package arithmeticInterface;

import java.util.Scanner;

public class ArithmeticInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
		
		
		
	}

}


interface AdvancedArithmetic{
	   int divisorSum(int n);
	}

class Calculator implements AdvancedArithmetic {
	

	@Override
	public int divisorSum(int n) {
		
		int sum =1;
		
		int sqrt_numb = (int)Math.sqrt(n);
		
		for(int i=2;i<=(n/2);i++){
			
			if(n%i==0){
				sum += i;
			}
			
			
		}
		
		return sum+n;
	}
	
	
	
	
}