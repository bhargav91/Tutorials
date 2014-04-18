/*

This code tries to check if a string has all unique characters using hash implementation.
This code assumes all characters to be in lowercase.

*/
public class HashImpl{

	public static void main(String[] args){

		String str = "abcdefghijklmnopqrstuvwxyz"; //string to check
		
		if(isUnique(str))
			System.out.println("Unique");
		else
			System.out.println("Not unique");

	}

	public static boolean isUnique(String str){

		int[] primes = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};//array of 26 prime numbers
		int startingAscii = 'a'; //ascii for 'a'. although this could be anything from a-z
		int primesProduct = 1;	
		String str1 = str.toLowerCase(); //assuming all characters to be in lowercase
		char[] charArray = str.toCharArray(); //convert string to character array
		for(char ch : charArray){ 
			int asciiValue = ch; //ascii value of current character
			int currentPrime = primes[Math.abs(asciiValue - startingAscii)]; //assign a different prime number to each character
			if(primesProduct % currentPrime == 0){//check whether the current prime is a factor of primes product. If it is, then it means the character is repeated.				
				return false;
			}
			else{
				primesProduct = primesProduct * currentPrime; // multiply current prime to primes product.
			}
		}
		return true;
	}
}
