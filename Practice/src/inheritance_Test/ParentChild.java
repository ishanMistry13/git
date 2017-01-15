package inheritance_Test;

public class ParentChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new B();
		
		a.print_var();

	}

}

class A{
	int i=10;
	
	public void print_var(){
		
		System.out.println("Value of I from A"+i);
		
		
	}
	
	
}


class B extends A{
	
	int i=20;
	
	public void print_var(){
		System.out.println("Value of I from B"+i);
		
	}
	
	
}