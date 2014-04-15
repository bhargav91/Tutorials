public class UniqueChecker2{	
	
	public static void main(String[] args){

		String str = "bhargav";
		UniqueChecker2 uc = new UniqueChecker2();
		boolean result = uc.checkUnique(str);
		if(result)
			System.out.println("String has all unique characters");
		else
			System.out.println("String does not have all unique characters");
	}

	public boolean checkUnique(String str){

		boolean[] strSet = new boolean[256];//boolean array representing each character in char set

		for(int i = 0; i<str.length(); i++){

			int val = str.charAt(i);//we assign a character to an int so its ASCII value gets stored..!
			if(strSet[val]){ //if its already true
				return false; //we have a duplicate
			}
			strSet[val] = true; //set boolean value representing that character to be true
		}
		return true; // all characters in string was unique..!
	}
}