class Cylinder3 {
	
	private int radius;
	private int height;

	public Cylinder3(int radius, int height){
		this.radius = radius;
		this.height = height;
		}

	 public int getRadius(){
		 return radius;
		}
	
	
	public int getHeight(){
		return height;
		}
	
}
public class SMPS9Q3 {

	public static void main(String[] args){

	Cylinder3 Home = new Cylinder3(25, 150);
	System.out.println(Home.getRadius());
	System.out.println(Home.getHeight());
	 


	}

}