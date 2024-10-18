public class SMPS4Q2 {

	public static void main(String[] args){

	float s1 = 65.0f;
	float s2 = 32.0f;
	float s3 = 98.0f;
	
	float per = (s1+s2+s3) / 3.0f ;
	
	if (per > 40 && s1>33 && s2>33 && s3>33){
	
		System.out.println("You are passed");
		}
	else{
		System.out.println("you are failed");
		}

	}


}