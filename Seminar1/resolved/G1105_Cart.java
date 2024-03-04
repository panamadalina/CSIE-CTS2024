public class Cart {//worldclass

	

	public float applyDiscount(float initialPrice, float percentage) {

		return (initialPrice - (percentage *  initialPrice));

	}



	public float calculateDiscountBasedOnSubscriptionDuration(int subscriptionDuration) {

		 return (subscriptionDuration > 10) ? (float)30/100 : (float)subscriptionDuration/100; 

		   

	}

	public float calculatePriceWithDiscount(int subscriptionType, float initialPrice, int subscriptionDuration) {

	   

	   

	    if (subscriptionType == 1)

	    	return initialPrice;



	    if (subscriptionType == 2)

	    	return (1-calculateDiscountBasedOnSubscriptionDuration(subscriptionDuration))*applyDiscount(initialPrice, 0.1f);



	    if (subscriptionType == 3)

	    	return (1-calculateDiscountBasedOnSubscriptionDuration(subscriptionDuration))*applyDiscount(initialPrice, 0.25f);



	    if (subscriptionType == 4)

	    	return (1-calculateDiscountBasedOnSubscriptionDuration(subscriptionDuration))*applyDiscount(initialPrice, 0.35f);



	    return 0;



	  }