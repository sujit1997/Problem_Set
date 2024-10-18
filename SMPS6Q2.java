import java.util.Scanner;

public class SMPS6Q2 {

	public static void main(String[] args){

	int [] num = {100, 650, 780, 980, 450};
	
	Scanner sc = new Scanner(System.in);
	
	int get = sc.nextInt();
	
	boolean isInArray = false;
	
	for(int element:num){
		
		if( get == element){
			isInArray = true;
			break;
			}
		}	
	if(isInArray){
		System.out.println("The value is in array");
		}
	else{
		System.out.println("The value is not is in array");
		}

	}
}