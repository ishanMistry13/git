package hackerRank.com.BitWiseAnd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            
            System.out.println(solve(n,k));
            
        }
        

	}
	
	public static int solve(int n, int k){
		
		int[][] bestPair = new int [1][2];
		
		int currtMaxK = 0;
		
		bestPair[0][0] = 0;
		bestPair[0][1] = 0;
		
		for (int i=1;i<=n;i++){
			
			for(int j=i+1;j<=n;j++){
				
				
				
				if(((i&j)<k)&&((i&j)>currtMaxK)){
					
					
					
					if((i>=bestPair[0][0])&&(j>=bestPair[0][1])){
				
						System.out.println("Verifying pair"+i+","+j+" Current maxK: "+currtMaxK);
						
						bestPair[0][0]=i;
						bestPair[0][1]=j;
						currtMaxK = i&j;
						
					}
					
					
				}
				
				
			}
			
			
		}
		
		
		
		return (bestPair[0][0]&bestPair[0][1]);
		
	}

}


