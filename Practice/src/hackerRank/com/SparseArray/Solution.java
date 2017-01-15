package hackerRank.com.SparseArray;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int ttlStr = scan.nextInt();
		
		String[] ipStr = new String[ttlStr];  
		
		
		
		for(int i=0;i<ttlStr;i++){
			ipStr[i] = scan.next();
			
			scan.nextLine();
			
		}
		
		int ttlQuery = scan.nextInt();
		String[] query = new String[ttlQuery];
		
		for(int i=0;i<ttlQuery;i++){
			int count =0;
			query[i] = scan.next();
			
			for(int j=0;j<ttlStr;j++){
				
				if(query[i].equals(ipStr[j])){
					count++;
					
					
				}
				
				
				
			}
			
			System.out.println(count);
			scan.nextLine();
		}
		
		
		
		
		
	}

}
