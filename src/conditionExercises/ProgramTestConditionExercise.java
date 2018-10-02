package conditionExercises;

public class ProgramTestConditionExercise {

	public static void main(String arg[]) {
		ConditionExercises conditionTesting=new ConditionExercises();
		
		int num1=45;
		int num2=196;
		int num3=100;
		int num4=150;
		int num5=150;
		int num6=75;
		int num7=174;
		
//for condition exercises		
		System.out.println("-------------testing these numbers: "+num1+","+num2+","+num3);
		
		//largest number from 3 numbers
		int largest=conditionTesting.findLarg(num1, num2, num3);
		System.out.println("Largest Number : "+largest+"\n");
		
		//second largest number from 3 numbers
		int second=conditionTesting.findSecondlarge(num1, num2, num3);
		System.out.println("Second Largest Number : "+second+"\n");
		
		
		//highest number from 7 numbers
		int high=conditionTesting.findLargest(num1, num2, num3, num4, num5, num6, num7);
		System.out.println("-------------testing these numbers: "+num1+","+num2+","+num3+","+num4+","+num5+","+num6+","+num7);
		System.out.println("Largest number of 7 digits : "+ high+"\n");
		
		
		//print from 1 to N numbers....
		System.out.println("Number Print : ");
		conditionTesting.printNumber(50);
		System.out.println();
		
		//check if number is negative...
		String condition=conditionTesting.checkNumber(-50);
		System.out.println("Number is a "+condition+" number \n");
		
		//check even odd...
		String isEvenOdd=conditionTesting.checkEvenOdd(-50);
		System.out.println("Number "+num4+" "+isEvenOdd+"\n");
		
		//check leap year
		boolean isLeapYear=conditionTesting.checkLeapYear(2012);
		if(isLeapYear) {
			System.out.println("The year is leap year");
		}
		else {
			System.out.println("The year is not a leap year");
		}
		System.out.println("-------------------------------------------------------------------");
		
		
	}
}
