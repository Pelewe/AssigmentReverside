package iterationExercises;

public class ProgramTest {
	
	public static void main(String arg[]) {
		//for iterative exercises
		
		int num1=45;
		int num2=10;
		int num3=100;
		int num4=150;
		int num5=150;
		int num6=75;
		int num7=174;
		
		IterationExercises iterationTesting = new IterationExercises();
		int list[]= {num1,num2,num3,num4,num5,num6,num7};
		
		//find largest in an array
		int arrayHigh=iterationTesting.arrayLargest(list);
		System.out.println("Highest number in the array is : "+arrayHigh);
		System.out.println();
		
		//find second largest in an array
		int arraySecondHigh=iterationTesting.arraySecondLarge(list);
		System.out.println("Second highest number in the array is : "+arraySecondHigh);
		System.out.println();
		
		//find if number is present in an array
		boolean isPresent=iterationTesting.Findnumber(list, 150);
		if(isPresent) {
			System.out.println("The number is present in the array");
		}else {
			System.out.println("The number is not present in the array");
		}
		System.out.println();
		
		//find the occurrence of a number in an array
		int occurrence=iterationTesting.findOccurrence(list, 150);
		System.out.println("Number of occurrences for this number is : "+occurrence+"\n");
				
				
		//Find the number in an array of numbers with maximum occurrences	
		int maxOccurrence=iterationTesting.maxOccurrence(list);
		System.out.println("The number that appears the most in the array is : "+maxOccurrence+"\n");
		
		//Find number of spaces in a sentence
		String sentence="I am Testing my program, thanks.";
		int spaces=iterationTesting.numSpaces(sentence);
		System.out.println("Number of spaces in these sentence '"+sentence+"' is : "+spaces+"\n");
		
		//Find number of words in a sentence
		int words=iterationTesting.numWords(sentence);
		System.out.println("Number of words in these sentence '"+sentence+"' is : "+words+"\n");
		
		//to replace all spaces in a sentence with underscore
		String newLine=iterationTesting.replacewith_(sentence);
		System.out.println("Replaced these sentence '"+sentence+"' with '"+newLine+"'"+"\n");
		
		//to sort an array of numbers in ascending order
		int arraylist[]= {50,78,96,5,10,13,78,85,11,75,48};
		arraylist=iterationTesting.sortArrayAscending(arraylist);
		System.out.print("The sorted array in ascending order : {");
		for(int i=0;i<arraylist.length;i++) {
			System.out.print(arraylist[i]+",");
		}
		
		//to find all even numbers from an array of numbers
		System.out.println("} \n");
		System.out.print("all even numbers from the above array list of numbers : {");
		int evenlist[]=iterationTesting.findEvennumber(arraylist);
		if(evenlist.length!=0) {
		for(int i=0;i<evenlist.length;i++) {
			System.out.print(evenlist[i]+" ");
		}
		}
		else {System.out.print("No even Numbers");}
		
		//to generate fibonacci series from 1 to N
		System.out.println("} \n\nThe fibonacci series from 1 to N is :");
		int fibonacciArray[]=iterationTesting.generateFibonacciSeries(50);
		
		for(int i=0;i<fibonacciArray.length;i++) {
			System.out.print(fibonacciArray[i]+" ");
		}
		
		
		//to reverse a string
		System.out.println("\n");
		String str="my name";
		String reverseStr=iterationTesting.reverseString(str);
		System.out.println("The reverse of this string '"+str+"' is : '"+reverseStr+"'"+"\n");
		
		//to convert an string to number
		int convertedString=iterationTesting.convertString("85670");
		System.out.println("Converted number String is : "+convertedString+"\n");
		
		
		//to find the maximum difference between two consecutive items in an array of numbers
		int findDiff[]= {85,85,84,8,5,7,9,48,10,56,48,87,75,46,35,75};
		int maxDiff=iterationTesting.maxDiff(findDiff);
		System.out.println("The maximum difference between two consecutive numbers in an array is : "+maxDiff+"\n");
		
		
		//to count number of digits in a number
		int countthis=78456120;
		int numbercounter=iterationTesting.countdigits(countthis);
		System.out.println("Number of digits on this number "+countthis+" is : "+numbercounter+"\n");
		
		
		//to calculate sum of digits in a number
		int sumnumber=iterationTesting.sumOfDigits(countthis);
		System.out.println("And the sum of the number is : "+sumnumber+"\n");
		
		//to find sum of all odd numbers between 1 to N
		int oddsum=iterationTesting.sumOfOddnumbers(10);
		System.out.println("the sum of odd numbers between 1 to N number specified is : "+oddsum+"\n");
		
		
		//Swap first & last digit of a number
		int swapnum=iterationTesting.swapFnL(1234);
		System.out.println("Swapped first and last digit number is "+ swapnum+"\n");
		
		//to check if an alphabet is vowel or consonant
		char cha='z';
		String vowel=iterationTesting.checkVowelOrConstant(cha);
		System.out.println("Character '"+cha+ "' is " +vowel+"\n");
		
		//to reverse a number
		int testnum=123456;
		int reversenumber=iterationTesting.reverseNumber(testnum);
		System.out.println("Reversed number is of "+testnum+" is : "+reversenumber);
		
		System.out.println("---------------------------------------------------------------");
	}

}
