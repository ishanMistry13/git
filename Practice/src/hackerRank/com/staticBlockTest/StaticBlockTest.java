package hackerRank.com.staticBlockTest;

import java.util.Scanner;

public class StaticBlockTest {
	
	
	static{
		int B;
		int H;
		
		Scanner scan = new Scanner(System.in);
		
		
		
		B = scan.nextInt();
		H = scan.nextInt();
		
		if((scan.nextInt())>0){
			
			B = scan.nextInt();
			
		}else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			
		}
		
		scan.next();
		
		if((scan.nextInt())>0){
			H = scan.nextInt();
			
		}else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			
		}
		
		
		scan.close();
		
	}

	public static void main(String[] args) {
		
		
		
		
		

	}

}
