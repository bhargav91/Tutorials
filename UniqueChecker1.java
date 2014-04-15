import java.util.*;

public class UniqueChecker1{	

	public static void main(String[] args){

		String str = "bhargav";
		UniqueChecker1 uc = new UniqueChecker1();
		boolean result = uc.checkUnique(str);
		if(result)
			System.out.println("String has all unique characters");
		else
			System.out.println("String does not have all unique characters");
	}

	public boolean checkUnique(String str){

		HashSet<Character> hashSet = new HashSet<Character>(str.length());
		
		for(char c : str.toCharArray()){ //iterate through character array
			if(!hashSet.add(Character.toUpperCase(c))) //try to add each char to hashset
				return false;  //return false if could not add
		}
		return true;
	}
}