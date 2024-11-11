class Rectangle {

	int length;
	int width;
	
	public int area(){
		return length*width;
			}
	
	public int perimeter(){
		return 2*(length + width);
			}
}

public class SMPS8_4 {

	public static void main(String[] args){

	Rectangle rec = new Rectangle();
	rec.length = 5;
	rec.width = 2;
	
	System.out.println(rec.area());
	System.out.println(rec.perimeter());


	}


}