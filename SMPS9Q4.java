class Rectangle2 {
	
	private int length;
	private int breadth;

	public Rectangle2(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
		}
	
	public Rectangle2(){
		this.length = 4;
		this.breadth = 5;
		}

	 public int getLength(){
		 return length;
		}
	
	
	public int getBreadth(){
		return breadth;
		}
	
}
public class SMPS9Q4 {

	public static void main(String[] args){

	Rectangle2 Home = new Rectangle2(25, 150);
	System.out.println(Home.getLength());
	System.out.println(Home.getBreadth());
	 


	}

}