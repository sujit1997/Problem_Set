import java.util.Scanner;

public class SMPS4Q7 {

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number : ");
	
	int num = sc.nextInt();
	
	if( num % 2 == 0 ){
	
	System.out.println("It is an even number");

		}
	else if (num % 2 !=0){
	System.out.println("it is an odd number");
		}

	else{
	System.out.println("you enter wrong input");	
		
	}
	}



}