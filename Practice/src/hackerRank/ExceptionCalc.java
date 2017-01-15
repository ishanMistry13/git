package hackerRank;

import java.util.Scanner;

public class ExceptionCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

	}

}

class MyExceptionCalc extends Exception{
	
	String errorMsg;
	
	MyExceptionCalc(String errorMsg) {
		
	this.errorMsg=errorMsg;
		
		
	}
	
	
	
	
	public String toString(){		
		return errorMsg ;
	}
	
	
	
	
}

class Calculator{
	
	
	public int power(int n, int p) throws Exception{
		
		int result;
		
		if(n<=0||p<=0){
			
			throw new Exception("n and p should be non-negative");
		}else {
			result = (int)Math.pow(n, p);
			return result;
			
		}
		
				
		
			
		
		
	}
	
	
}



