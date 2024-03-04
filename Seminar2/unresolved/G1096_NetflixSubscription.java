public class NetflixSubscription {

	

	public float calculateNetflixIndividualSubscriptionAmountWithDiscount(float initialPrice, float value, float discountBasedOnNumberOfProfiles ) {

		return (initialPrice - (discountBasedOnNumberOfProfiles * initialPrice)) 

    			- value * (initialPrice - (discountBasedOnNumberOfProfiles * initialPrice));

	}

	public float calculatePercentageDiscount(int subscriptionPeriod) {

		return (subscriptionPeriod > 10) ? (float)30/100 : (float)subscriptionPeriod/100; 

	}

	

	public float calculateNetflixIndividualSubscriptionAmount(

			int numberOfProfiles, float initialPrice, int subscriptionPeriod)

	  {

	    float percentageDiscountSubscriptionPeriod = calculatePercentageDiscount(subscriptionPeriod);

	    if (numberOfProfiles == 1)

	    {

	    	return initialPrice;

	    }

	    if (numberOfProfiles == 2)

	    {

	    	return calculateNetflixIndividualSubscriptionAmountWithDiscount(

	    			initialPrice,

	    			percentageDiscountSubscriptionPeriod,

	    			0.1f);

	    }

	    if (numberOfProfiles == 3)

	    {

	      	return calculateNetflixIndividualSubscriptionAmountWithDiscount(initialPrice,percentageDiscountSubscriptionPeriod,0.25f);

	    }

	    if (numberOfProfiles == 4)

	    {

	      	return calculateNetflixIndividualSubscriptionAmountWithDiscount(initialPrice,percentageDiscountSubscriptionPeriod,0.35f);

	    }

	    return 0;

	  }