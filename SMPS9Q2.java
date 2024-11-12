import java.util.*;

class Cylinder2 {

	private int radius;
	private int height;
	
	public int getRadius(){
		return radius;
		}
	public void setRadius(int radius){
		this.radius = radius;
		}
	
	public int getHeight(){
		return height;
		}
	public void setHeight(int height){
		this.height = height;
		}	
	
	public double surfaceArea (){
		return 2* Math.PI * radius * radius + 2 * Math.PI * radius*height; 
		} 
	public double volume () {
		return Math.PI* radius * radius* height;
		}
	

}
public class SMPS9Q2 {

	public static void main(String[] args){

	Cylinder2 home = new Cylinder2();
	
	home.setRadius(2);
	int r = home.getRadius();
	home.setHeight(5);
	int h = home.getHeight();

	System.out.println(home.surfaceArea());
	
	System.out.println(home.volume());


	}


}