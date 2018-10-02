package iterationExercises;


public class IterationExercises {
	
	//Find largest number from an array of numbers
	public int arrayLargest(int [] list) {
		int largest=0;
			
			for(int i=0;i<list.length;i++) {
				if(largest<=list[i]) {
					largest=list[i];
				}
			}
		
		return largest;
	}
	
	
	//Find second largest number from an array of numbers
	public int arraySecondLarge(int[] list) {
		int secondLarge=list[0];
		int largest=list[0];
		
			for(int i=0;i<list.length;i++) {
				if(list[i]>largest)
				{
					secondLarge=largest;
					largest=list[i];
				}
				else if(list[i]>secondLarge && list[i]<largest) //If list[i] is in between first and second then update second
				{
					secondLarge=list[i];
				}
			}
		
		return secondLarge;
	}
	
	
	
	//Find if a number is present in an array of numbers
	public boolean Findnumber(int[] list,int num) {
		boolean isPresent=false;
			
			for(int i=0;i<list.length;i++) {
				if(list[i]==num) {
					isPresent=true;
					break;
				}
			}
			
		return isPresent;
	}
	
	//Find number of occurrences of a number in an array of numbers
	public int findOccurrence(int[] list,int num) {
		int occurrence=0;
		
			for(int i=0; i<list.length;i++) {
				if(list[i]==num) {
					occurrence++;
				}
			}
		return occurrence;
	}
	
	//Find the number in an array of numbers with maximum occurrences
	public int maxOccurrence(int[] list) {
		int max=0;
		int counter=0;
		int num_max=0;
			
				for(int i=0;i<list.length;i++) {
					counter=0;
					for(int x=0;x<list.length;x++) {
						if(list[i]==(list[x])) {
							counter++;
						}
					}
					if(counter>max) {
						max=counter;
						num_max=list[i];
					}
				}
				
		return num_max;
	}
	
	//Find number of spaces in a sentence
	public int numSpaces(String line) {
		int no_spaces=0;
		
			for(int i=0;i<line.length();i++) {
				if(Character.isWhitespace(line.charAt(i))){
					no_spaces++;
				}
			}
		
		return no_spaces;
	}
	
	//Find number of words in a sentence
	public int numWords(String line) {
		int words=0;
		
		String split[]=line.split(" ");
		words=split.length;
		
		return words;
	}
	
	//Replace all spaces in a sentence with underscore
	public String replacewith_(String line) {
		String newLine="";
			
			newLine=line.replace(" ","_");
		return newLine;
	}
	
	//Sort an array of numbers in ascending order
	public int[] sortArrayAscending(int list[]){
		int temp=0;
		
		for(int i=0;i<list.length;i++) {
			for(int x=0;x<list.length;x++) {
				if(list[i]<list[x]) {
					temp=list[i];
					list[i]=list[x];
					list[x]=temp;
					
				}
			}
		}
		
		return list;
	}
	
	//Find all even numbers from an array of numbers
	public int[] findEvennumber(int list[]) {
		
		int counter=0;	
		
		for(int i=0;i<list.length;i++) {
			if(list[i]%2==0) {
				counter++;
			}
		}
		
		int [] evenList= new int [counter];
			counter=0;
			for(int i=0;i<list.length;i++) {
				if(list[i]%2==0) {
					evenList[counter]=list[i];
					counter++;
				}
			}
			
		return evenList;
	}
	
	//Generate fibonacci series from 1 to N
	public int[] generateFibonacciSeries(int num) {
			
		int f1=0,f2=1;
		int sum=0;
		int i=1;
		
		
		while(num>=sum) { //count the numbers generated from 1 to N to create an array of numbers
			sum=f1+f2;
			f1=f2;
			f2=sum;
			i++;
		}
		int [] series= new int[i];
		series[0]=1;
		f1=0;f2=1;sum=0;i=1; //reset all values
		
		if(num<1) {
			return series;
		}
		
		while(num>=sum) //set values to the array being returned
		{
			sum=f1+f2;
			f1=f2;
			f2=sum;
			series[i]=sum;
			i++;

		}
			
		
		return series;
	}
	
	//Reverse a string
	public String reverseString(String line) {
			String reverse="";
			
			for(int i=line.length()-1;i>=0;i--) {
				reverse=reverse+line.charAt(i);
				
			}
		return reverse;
	}
	
	//Convert numeric string value to number like "1234" -> 1234
	public int convertString(String str) {
		int num =Integer.parseInt(str);
		return num;
	}
	
	//Find the maximum difference between two consecutive items in an array of numbers
	public int maxDiff(int list[]) {
		int maxDiff=list[0]-list[1];
		int first=list[0];
			
			for(int i=1;i<list.length;i++) {
				
				if((first-list[i])>maxDiff)
				{
					maxDiff=first-list[i];
				}
					first=list[i];
			
			}
		return maxDiff;
	}
	
	//Count number of digits in a number
	public int countdigits(int num) {
		int counter=0;
		
		while(num!=0) {
			num=num/10;
			counter++;
		}
		
		return counter;
	}
	
	//Calculate sum of digits in a number
	public int sumOfDigits(int num) {
		int sum=0;
		int x=0;
		
		while(num>0) {
			x=num % 10;
			sum=sum+x;
			num=num/10;
		}
		
		return sum;
	}
	
	//Find sum of all odd numbers between 1 to N
	public int sumOfOddnumbers(int max) {
		int sum=0;
			
		for(int i=0;i<=max;i++) {
			if(i%2 ==1) {
				sum=sum+i;
			}
		}
		
		return sum;
	}
	
	//Swap first & last digit of a number
	public int swapFnL(int num) {
		String input=Integer.toString(num);
		String first=input.substring(0,1);
		String last=input.substring(input.length()-1);
		
		input=last+input.substring(1, input.length()-1)+first;
		
		int newnum=Integer.parseInt(input);
		return newnum;
	}
	
	//Check if an alphabet i s vowel or consonant
	public String checkVowelOrConstant(char alpha) {
		String  Vowel="";
		
		if(alpha=='a'||alpha=='A'|| alpha=='e'|| alpha=='E' || alpha=='i'|| alpha=='I'|| alpha=='o'|| alpha=='O'|| alpha=='u'|| alpha=='U') {
			Vowel="Vowel";
		}
		else if((alpha>='a'&&alpha<='z')||(alpha>='A'&&alpha<='Z'))
		{
			Vowel="Constant";
		}
		else {
			Vowel="Not an aplhabet";
		}
		
		return Vowel;
	}
	
	//Reverse a number
	public int reverseNumber(int num) {
		long reversedNum=0;
		
				
		while(num!=0) {
			reversedNum=reversedNum*10+num%10;
			num=num/10;
		}
		
		return (int) reversedNum;
	}
}
