public class SMPS5Q19{

	public static void main(String[] args){

	
	for(int num=2; num<=100; num++){
		
		int flag = 0;
		int middleNumber = num/2;
		
		for(int i=2; i<=middleNumber; i++){
		
		if(num% i ==0){
		
		flag = 1;
		break;		
				}

			}
	
		if(flag==0){
			System.out.println(" "+num);
			}
	
		}
		
	}

}