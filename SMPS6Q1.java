public class SMPS6Q1 {

	public static void main(String[] args){
	
	float [] num = {45.6f, 54.3f, 95.3f, 54.3f, 98.6f};
	float sum = 0;
	
	for(float element:num){
		sum = sum +  element; 
		}
	System.out.println(sum);

	}
}