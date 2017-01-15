package hackerRank;

import java.util.Scanner;

public class Count1s {
	
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	int ipInt = scan.nextInt();
	
	int numOfOnes=0;
	int finalMaxCount = 0;
	
	String binNumb = Integer.toBinaryString(ipInt);
	
	for(int i=0;i<binNumb.length();i++){
		
		if(binNumb.charAt(i)=='1'){
			numOfOnes++;
			
			finalMaxCount = Math.max(finalMaxCount, numOfOnes);
			
		}else{
			
			numOfOnes=0;
		}
		
		
		
	}
	
	System.out.println(finalMaxCount);
	
}
	

}
