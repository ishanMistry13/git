package hackerRank.com.IsPrime;


import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int totalTc = scan.nextInt();
		//int [] ele = new int[totalTc];
		
		//HashMap<Integer,String> eleStats = new HashMap<>();
		
	
			//ele[i] = scan.nextInt();
			
		
			for(int i=0;i<totalTc;i++){
				long N = scan.nextLong();
				
				boolean isNotPrime=false;
				
				for(int j=2;j<=Math.sqrt(N);j++){
					
					if(N%j==0){
						
						isNotPrime = true;
						break;
						
					}
				}
				if(isNotPrime==true)
					System.out.println("Not prime");
				else
					System.out.println("Prime");
				
			//	N= scan.nextInt();
				
			}
				
			
			
		scan.close();
	}

}
