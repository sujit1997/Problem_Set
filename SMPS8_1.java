class Employee{
	int salary;
	String name;

	public int getSalary(){
			return salary;
			}
	public String getName(){
			return name;
			}
	public void setName(String n){
			name = n;
 			}
	}

public class SMPS8_1 {

	public static void main(String[] args){
	System.out.println("This is our custom class");
	Employee sujit = new Employee();
	
	// Attributes
	sujit.setName("sujitManmode");
	sujit.salary = 15000;
	System.out.println(sujit.getSalary());
	System.out.println(sujit.getName());
	


	}

}