class SMPS5Q21 {

	static int a = 0, b=1, c;
	void printFib(int i)
	{
		if(i>=1){
			
			System.out.println(a);
			c = a+b;
			a=b;
			b=c;
			printFib(i-1);
			}
	}

	public static void main(String[] args){

	SMPS5_21 ob= new SMPS5_21();
	ob.printFib(10);
	
	}

}