import java.util.Scanner;

public class SMPS5Q18 {

	public static void main(String[] args){
	
	Scanner sc = new Scanner (System.in);

	
	System.out.println("Enter a number to find it is prime number or not : ");
	int num = sc.nextInt();
	
	int flag = 0;
	if(num == 0 || num ==1) {       // Check if the number is less than 2 (not prime)
		System.out.println(num + "number is not prime number ");
		}
	else {
		int middleNumber = num / 2;
		for(int i=2; i<=middleNumber; i++){
			if(num % i == 0){
				System.out.println(num + " Number is not prime number");
				flag = 1;
				break;
				}
			
			}
			if(flag ==0){
				System.out.println(num + " Number is prime number");
					}
		}
		
	



	}

}