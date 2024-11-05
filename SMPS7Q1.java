import java.util.Scanner;
public class SMPS7Q1 {

	static void table(int num){
	
		for(int i=1; i<=10; i++){
		System.out.printf("%d * %d = %d\n", num, i, num*i);
					}
			}

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a number to get table : ");
	int num = sc.nextInt();
	System.out.println("Table of " + num + " is :");
	table(num);
	}

}