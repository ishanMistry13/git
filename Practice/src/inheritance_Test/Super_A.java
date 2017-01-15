package inheritance_Test;

public class Super_A {
	
	int a=1;
	int b=2;
	
	public Super_A() {
		// TODO Auto-generated constructor stub
		a=0;
		b=0;
		System.out.println("Value from default contructor of A");
		
	}
	
	Super_A(int a, int b){
		a=a;
		b=b;
		
		System.out.println("calling contructor called by A called by B"+a+b);
		
		
	}
	
	void show(){
		System.out.println("Inside class A's contructor");
	}
}


class Sub_b1 extends Super_A {
	
	public Sub_b1(int c, int d) {
		// TODO Auto-generated constructor stub
		super(c, d);
		
		a=c;
		b=d;
		
		System.out.println("Printing values from cont of B");
		
	}
	
	
	
}




class Test_call {

	public static void main(String[] args) {
		Sub_b1 b = new Sub_b1(10, 20);
	}
	
	
}

