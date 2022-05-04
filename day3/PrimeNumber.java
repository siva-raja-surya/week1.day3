package week1.day3;

public class PrimeNumber {

	public static void main(String[] args) {
		
		//Initializing value to check whether it is prime number 
		int value= 13;
		
		// Declare a boolean variable flag as false
		boolean flag= false;
		
		// Iterate from 2 to half of the input using for loop
		for (int i = 2; i <(value/2); i++) {
			
			// Divide the input with each for loop variable and check the remainder
			int f = value%i;
		
			// Set the flag as true when there is no remainder
			if(f==0) {
				flag=true;
			}
			
		}

		// Check the flag (Provide a condition)
		if(flag==true) {
			
			// Print 'Not a Prime' when the condition matches
			System.out.println(value + " Not a Prime");
		}
		else {
			
			// Print 'Prime' when the condition doesn't match 
			System.out.println(value + " Prime");
		}
			
	}

}
