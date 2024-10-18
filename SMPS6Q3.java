public class SMPS6Q3 {

	public static void main(String[] args){

	int [] marks = {65, 85, 46, 96, 45};
	
	int sum = 0;
	
	for(int element:marks){
	
		sum = sum + element;
	
		}
	System.out.println("The average of marks is: " +sum/marks.length);
	


	}
}