class cellphone{
	
	String companyName;
	
	public void ring(){
			System.out.println("Ringing...");
			}
	public void vibrate(){
			System.out.println("Vibrating...");
			}
	public void callFriend(){
			System.out.println("Calling Rasik");
	}

	}

public class SMPS8Q2 {

	public static void main(String[] args){
	
	System.out.println("features of cellphone : ");
	
	cellphone samsung = new cellphone();// Instantiating a new cellphone

	// Setting attributes	
	samsung.callFriend();
	samsung.ring();
	samsung.vibrate();
	




	}

}
