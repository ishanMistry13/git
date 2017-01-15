package inheritance_Test;

public class MyException extends Exception {
	
	int a;
	
	MyException (int detail){
		
		a = detail;
		
	}
	
	
	public String toString(){
		return "MyException:"+a;
		
	}
	

}
