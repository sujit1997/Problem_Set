public class SMPS6Q7 {

	public static void main(String[] args){

	int[] arr = {56,96,74,32,46,956,294,165};
	
	int min = arr[0];
	for(int e: arr){
			if(e<min){
			min = e;
				}

			}
	System.out.println("The value of minimum element is : " + min);





}
}