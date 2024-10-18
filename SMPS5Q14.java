import java.util.Scanner;
public class SMPS5Q14 {

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number : ");
	
	int num = sc.nextInt();
	
	int ans = 0;
	
	while(num > 0){
		
		int lastDigit = num % 10;
		ans = ans * 10 + lastDigit;
		num = num /10;
		}
		
		System.out.println("Reverse number is : " +ans);


	
	}


}