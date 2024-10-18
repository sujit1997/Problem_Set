import java.util.Scanner;
	
public class SMPS4Q6 {

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a domain name: ");
	
	String domain = sc.next();
	
	if(domain.endsWith(".com")){

		System.out.println("Its an Commercial Website");

		}
	else if(domain.endsWith(".in")){

		System.out.println("Its an Indian Website");
		
		}
	else if(domain.endsWith(".org")){
		System.out.println("Its an organisational website");
		}
	else {
	
	System.out.println("You put wrong input");
		}
	



	}


}