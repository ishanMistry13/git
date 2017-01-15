package inheritance_Test;

public class RunDemoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionDemo e = new ExceptionDemo();
		
		try {
			e.numbTest(12);
		} catch (MyException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.toString());
		}
		
		
		

	}

}
