package com.epamWeek4.epamWeek4;

public class CompoundInterest {
	Double principalamount;
    float rateOfInterest;
    float timePeriodInYears;
    CompoundInterest(Double p,float r,float t){
 	   	principalamount=p;
 	   	timePeriodInYears=t;
 	   	rateOfInterest=r; 	   
    }
    public double caluculateCompoundInterest() {
   	 	return (principalamount * Math.pow((1 + rateOfInterest/100),timePeriodInYears));
    }
}
