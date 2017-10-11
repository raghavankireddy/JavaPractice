package prob7Feb;

public class ComputeAgeInDays {

	static String testcase1="24121989";
	static String testcase2="05071990";
	static String testcase3="18011991";
	static String testcase4="04082012";
	static String testcase5="10101989";
	static String testcase6="01012013";
	static String testcase7="01012012";
	
	
	
	public static void main(String[] args) {
		
		ComputeAgeInDays testcase =new ComputeAgeInDays();
		int result = testcase.computeAge(testcase7);
		System.out.println("Result is:"+result);
	
		
	}
	
	public int computeAge(String str){
		
		char ch;
		int i=0,targetyear=2014,targetmonth=1,targetday=1,initialyear=0,initialmonth=0,initialday=0,noOfyear,sum=0,totalNoOfDaysFromMonths=0,totalDaysFromYear=0,countLeapYear=0,actualAgeInDaysOfPerson=0,flag=0;
		String s="";
		
		s=str.substring(4,8);
		initialyear=Integer.parseInt(s);
		System.out.println("Year :" + initialyear);
		
		s=str.substring(2,4);
		initialmonth=Integer.parseInt(s);
		System.out.println("Month :" + initialmonth);
		
		s=str.substring(0,2);
		initialday=Integer.parseInt(s);
		System.out.println("Day :" + initialday);
		
		noOfyear=targetyear-(initialyear);
		System.out.println("No ofYear " + noOfyear);
		
		for(i=1;i<=noOfyear;i++){
			if(i%4==0){
				countLeapYear++;
			}
			totalDaysFromYear=noOfyear*365+countLeapYear;
		}
		
		System.out.println(totalDaysFromYear);
		
		

		if(initialmonth>targetmonth){
				
			flag=1;
			for(i=targetmonth;i<initialmonth;i++){
				
				if( (i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) ){
				sum=sum+31;
				}
				
				else if((i==4 || i==6 || i==9 || i==11)){
					sum=sum+30;	
					}
				
				else{
					sum=sum+28;
				}
			}
		}
		
		if(flag==1){
			totalNoOfDaysFromMonths=sum+initialday;
		}
		else {
			totalNoOfDaysFromMonths=0;
		}
		
		System.out.println("Total Days :" +(totalNoOfDaysFromMonths));
		
		actualAgeInDaysOfPerson=totalDaysFromYear-totalNoOfDaysFromMonths+1;
		
		return actualAgeInDaysOfPerson;
	}

		
}
