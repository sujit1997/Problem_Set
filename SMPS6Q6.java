public class SMPS6Q6 {

	public static void main(String[] args){

	int [] arr = {1, 45, 64, 84, 35};
	int max = arr[0];
	
	for(int e:arr){
		
			if(e>max){
			max = e;
				}
			
			}
	System.out.println("The maximum value of array is " + max);


	}


}