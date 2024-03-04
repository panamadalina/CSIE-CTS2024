public class  Insurance{

	

	public float calculateInsuranceDiscount(int insurancePeriod) {

		return (insurancePeriod > 10) ? (float)30/100 : (float)insurancePeriod/100; 

	}

	

	public float getInsuranceWithDiscount(float baseInsurance, float discountInsuranceByPeriod,float percentageRiskFactor) {

		return (baseInsurance - (percentageRiskFactor * baseInsurance)) 

    			- discountInsuranceByPeriod * (baseInsurance - (percentageRiskFactor * baseInsurance));

	}

	

	public float calculateInsurance(int riskFactor, float baseInsurance, int insurancePeriod) {

	    

	    float discountInsuranceByPeriod = calculateInsuranceDiscount(insurancePeriod);

	   

	    if (riskFactor == typeRiskFactor.NO_DISCOUNT)

	    {

	    	return baseInsurance;

	    }

	    if (riskFactor == 2)

	    {

	    	return getInsuranceWithDiscount(baseInsurance,discountInsuranceByPeriod, 0.1f);

	    }

	    if (riskFactor == 3)

	    {

	    	return getInsuranceWithDiscount(baseInsurance,discountInsuranceByPeriod, 0.25f);

	    }

	    if (riskFactor == 4)

	    {

	    	return getInsuranceWithDiscount(baseInsurance,discountInsuranceByPeriod, 0.35f);

	    }

	    return 0;

	  }

