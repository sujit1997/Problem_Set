import java.util.Scanner; 

public class SMPS1Q3 {

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter marks of subject 1: ");
	float a = sc.nextFloat();
	
	System.out.println("Enter marks of subject 1: ");
	float b = sc.nextFloat();
	
	System.out.println("Enter marks of subject 1: ");
	float c = sc.nextFloat();
	
	float cgpa_a = (a/100)*10;
	float cgpa_b = (a/100)*10;
	float cgpa_c = (a/100)*10;
	
	float cgpa = (cgpa_a + cgpa_b + cgpa_c)/3;
	
	System.out.println(cgpa);



	}

}