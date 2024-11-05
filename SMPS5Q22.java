import java.util.Scanner;

public class SMPS5Q22 {

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a number : ");

	int num = sc.nextInt();
	
	int temp = num;
		
	int rev = 0;
	int rem;
	
	while(temp !=0){
		
		rem = temp%10;
		rev = rev*10+rem;
		temp = temp/10;
		}
		
	if(num == rev){
		
		System.out.println(num+ " Is palindrome number ");

		}
		else{
		System.out.println(num+ "Is not palindrome number");
		}


	}

}