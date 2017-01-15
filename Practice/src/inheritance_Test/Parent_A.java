package inheritance_Test;

public class Parent_A {

	int a =10;
	
	void show(){
		
		System.out.println("Printing from topmost class:"+a);
	}
	
}


class Sub_b extends Parent_A{
	
	void show_b(){
		
		System.out.println("Printing from Sub b");
		
	}
	
	
}


class Sub_c extends Parent_A{
	
void show_c(){
		
		System.out.println("Printing from Sub c");
		
	}
	
	
}



class sub_jhol extends Sub_b{
	
	
	
}


class test_execute {
	
	public static void main(String[] args) {
		sub_jhol j = new sub_jhol();
		
		j.show();
	}
	
}
