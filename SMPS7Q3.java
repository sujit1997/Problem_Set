public class SMPS7Q3 {
	
	static int sumRec(int n){
		if(n==1){
		
		return 1;

			}
	
		return n + sumRec(n-1);

		}

	public static void main(String[] args){
	
	int c = sumRec(4);
	System.out.println(c);

	}

}