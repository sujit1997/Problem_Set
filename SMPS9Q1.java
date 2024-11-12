class Cylinder {

	private int radius;
	private int height;
	
	public int getRadius(){
		return radius;
		}
	public void setRadius(int r){
		this.radius = r;
		}

	public int getHeight(){
		return height;
		}
	
	public void setHeight(int h){
		this.height = h;
		}
	


}
public class SMPS9Q1 {
	public static void main(String[] args){
	
	Cylinder home = new Cylinder();
	home.setRadius(5);
	System.out.println(home.getRadius());
	home.setHeight(10);
	System.out.println(home.getHeight());
	



	}


}