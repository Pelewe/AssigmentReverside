package conditionExercises;



public class ConditionExercises {
	
	//Find largest number among 3 numbers
	public int findLarg(int num1,int num2,int num3) {
		int largest=num1;
		
			if(largest <num1) {
				largest=num1;
			}
			
			if(largest<num2) {
				largest=num2;
			}
			if(largest<num3)
			{
				largest=num3;
			}
			
		return largest;
	}
	
	
	
	//Find second largest number among 3 numbers
	public int findSecondlarge(int num1, int num2, int num3) {
		int secondLarge=0;
		
			if(num1>num2 && num1<num3 ||num1<num2 &&num1>num3)
				{
					secondLarge=num1;
				}
		
		
			if(num2>num3 && num2<num1 || (num2<num3 && num2>num1)) {
				
				secondLarge=num2;
			}
		
			
			if(num3>num1 && num3 <num2 ||(num3<num1 && num3 >num2))
			{
				secondLarge=num3;
			}
			
			
		return secondLarge;
	}
	
	
	//Find largest number among 7 numbers
	public int findLargest(int num1,int num2, int num3, int num4, int num5, int num6, int num7) {
		int largest=0;
		int list[]= {num1,num2,num3,num4,num5,num6,num7};
		
		for(int i=0;i<list.length;i++) {
			if(largest<=list[i]) {
				largest=list[i];
			}
		}
	
		/*if(num1>=num2 && num1>=num3 && num1>=num4 && num1>=num5 && num1>=num6 &&num1>=num7)
		{
			largest=num1;
		}
		else if(num2>=num1 && num2>=num3 && num2>=num4 && num2>=num5 && num2>=num6 &&num2>=num7) {
			largest=num2;
		}
		else if(num3>=num1 && num3>=num2 && num3>=num4 && num3>=num5 && num3>=num6 &&num3>=num7) {
			largest=num3;
		}
		else if(num4>=num1 && num4>=num2 && num4>=num3 && num4>=num5 && num4>=num6 &&num4>=num7) {
			largest=num4;
		}
		else if(num5>=num1 && num5>=num2 && num5>=num3 && num5>=num4 && num5>=num6 &&num5>=num7) {
			largest=num5;
		}
		else if(num6>=num1 && num6>=num2 && num6>=num3 && num6>=num4 && num6>=num5 &&num6>=num7) {
			largest=num6;
		}
		else if(num7>=num1 && num7>=num2 && num7>=num3 && num7>=num4 && num7>=num5 &&num7>=num6) {
			largest=num7;
		}*/
		
		return largest;
	}
	
	//Print numbers from 1 to N, But if the number is multiple of 3 then print "FIZZ" 
	//and if the number is multiple of 5 then print "BUZZ". 
	//But if the number is multiple of both 3 and 5 then print only "FIZZBUZZ".
	
	public void printNumber(int max) {
		
		
		for (int num=1;num<=max;num++) {
			
			if(num %3==0 && num%5 ==0)
			{
				System.out.println("FIZZBUZZ");
			}
			else if(num%3==0) {
				System.out.println("FIZZ");
			}
			else if(num%5==0) {
				System.out.println("BUZZ");
			}
			else
			{
				System.out.println(num);
			}
		}
		
	}
	
	//Check if a number is negative, positive or zero.
	public String checkNumber(int num) {
		String negative="";
		
			if(num>=1) {
				negative="Positive";
			}
			else if(num<0)
			{
				negative="Negative";
			}
			else if(num==0) {
				negative="Zero";
			}
			
		return negative;
	}
	
	//Check if a number is even or odd
	public String checkEvenOdd(int num) {
		String evenOdd="";
			
			if(num%2 == 0) {
				evenOdd="is Even";
			}
			else {
				evenOdd="is Odd";
			}
		return evenOdd;
	}
	
	
	//Check if a year is leap year or not
	public boolean checkLeapYear(int year) {
		boolean isLeapYear=false;
			
			if((year% 4 == 0) && (year % 100==0) && (year%400 == 0)) {
				
					isLeapYear=true;
				
			}
			else if ((year%4==0) && year%100 !=0) {
				isLeapYear=true;
			}
			
		return isLeapYear;
	}
	
	
}
