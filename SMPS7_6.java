public class SMPS7_6 {

	static void average(int[] num) {

		int sum = 0;
		float avg; 
		for(int i=0; i<num.length; i++){
		sum += num[i];

		}
	// System.out.println(sum);
	
	avg = (float)sum/num.length;
	System.out.println(avg);
	}

	public static void main(String[] args){
	
	

	int[] num = {95, 84, 62, 51, 94};
	
	average(num);


	}

}