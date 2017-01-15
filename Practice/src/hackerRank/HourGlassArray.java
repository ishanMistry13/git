package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HourGlassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> allSums = new ArrayList<>(); 
		int sum=0;
		
		Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
       /* for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
            	
            	System.out.println(arr[i][j]);
            	
            }
        }*/
        
        
        
       for(int i=0;i<=3;i++){
        	for(int j=0;j<=3;j++){
        		System.out.println("In loop"+j);
        		sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
        		allSums.add(sum);		
        		//
        	}
        	
        	
        }
        
       Collections.sort(allSums);
        
        System.out.println(allSums.get(allSums.size()-1));
        
        

	}

}
