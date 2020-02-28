package com.epamWeek4.epamWeek4;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Choose 1 for calculating Interest.");
    	System.out.println("Choose 2 for house construction.");
    	int option = sc.nextInt();
    	if(option==1) {
    		System.out.println("Enter principal amount");
    		double principal=sc.nextDouble();
    		System.out.println("Enter rate of interest");
    		float rateOfInterest=sc.nextFloat();
    		System.out.println("Enter time in years");
    		float time=sc.nextFloat();
    		System.out.print("1.Simple Interest\r\n"+"2.Compound Interest\r\n"+"Choose an option from the above\r\n");
    		int typeOfInterest=sc.nextInt();
    		if(typeOfInterest==1) {
    			SimpleInterest SI=new SimpleInterest(principal,rateOfInterest,time);
    			System.out.println("The simple interest is : "+SI.caluculateSimpleInterest());
    		}
    		else {
    			CompoundInterest SI=new CompoundInterest(principal,rateOfInterest,time);
    			System.out.println("The compound interest is : "+SI.caluculateCompoundInterest());
    		}
    	}
    	else if(option==2){
    		System.out.println("1:1200INR if we use standard materials\r\n"+ 
    				        	"2:1500INR if we use above standard materials\r\n"+ 
    				        	"3: 1800INR if customers needs high standard material\r\n"+ 
    				        	"4: 2500INR if customer needs high standard material and fully\r\n"+ 
    				        		"automated home\r\n");
    		System.out.println("Chosee the type of material from the above");
    		int typeOfMaterial=sc.nextInt();
    		System.out.println("Enter the area of your home in square feet");
    		float area=sc.nextFloat();
    		Construction c=new Construction(typeOfMaterial,area);
    		System.out.println("The total cost is : "+c.calculateTotalCost());
    	}
    }
}
