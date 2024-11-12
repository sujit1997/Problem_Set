import java.util.*;
class Circle{

	double radius;
	
	public double area(){
		return Math.PI*radius*radius;
			}
	public double perimeter(){
		return 2*Math.PI*radius;
			}

}
public class SMPS8Q6 {

	public static void main(String[] args){

	Circle crl = new Circle();
	crl.radius = 3.0d;	
	
	System.out.println(crl.area());
	System.out.println(crl.perimeter());


	}



}
