import java.util.Scanner;
public class SMPS2Q2 {
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your grade");
	
	char grade = sc.next().charAt(0);
	
	char newgrade = (char) (grade + 8) ; 
	
	System.out.println("Your grade is : ");
	System.out.println(newgrade);

	// Decrypting grade

	char oldgrade = (char) (newgrade - 8);
	System.out.println("Your grade is : ");
	System.out.println(oldgrade);


	}


}