public class SMPS5Q15 {

	public static void main(String[] args){

	String str = "abc";
	String reversestring = "";
	char ch;
	
	for(int i=0; i<str.length(); i++){
		ch = str.charAt(i);
		reversestring = ch + reversestring;
		}
	System.out.println("reverse string is : " +reversestring);

	}


}