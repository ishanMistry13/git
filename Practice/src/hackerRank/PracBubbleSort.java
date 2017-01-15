package hackerRank;

import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;

public class PracBubbleSort {
	

	public void sortElements(int[] ipArr){
		
		int numSwaps = 0;
		int firstEle;
		int lastEle;
		
		for(int i=1;i<ipArr.length;i++){
			
			for(int j=0;j<=ipArr.length-2;j++){
				
				if(ipArr[j]>=ipArr[j+1]){
					int tmp;
					tmp=ipArr[j];
					ipArr[j]=ipArr[j+1];
					ipArr[j+1] = tmp;
					numSwaps++;				
					
				}
				
			}
			
		}
		
		
		System.out.println("Array is sorted in"+numSwaps+"swaps.");
		System.out.println("First Element:"+ipArr[0]);
		System.out.println("Last Element:"+ipArr[ipArr.length-1]);
		
		
	}
	

	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ipArr =  new int[n];
		
		
		
		for(int i=0;i<n;i++){
			
			ipArr[i]= scan.nextInt();
			
		}
					
		scan.close();
		
		PracBubbleSort p = new PracBubbleSort();
		
		p.sortElements(ipArr);
		
		

	}
	
	

}
