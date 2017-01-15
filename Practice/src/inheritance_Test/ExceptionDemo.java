package inheritance_Test;

public class ExceptionDemo {
	
	int numb;
	
	public void numbTest(int a) throws MyException{
		numb =a;
		
		if(numb>10){
					
			throw new MyException(numb);
						
		}
		System.out.println("Now exiting exception demo class");
			
	}
	
	
	
}
