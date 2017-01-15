package hackerRank.com.LibraryFine;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int[] day = new int[2]; 
		int[] month = new int[2];
		int[] year = new int[2];
		
		
		
			day[0] = scan.nextInt();
			month[0] = scan.nextInt();
			year[0] = scan.nextInt();
			
			
			scan.nextLine();
			day[1] = scan.nextInt();
			month[1] = scan.nextInt();
			year[1] = scan.nextInt();
			
			//System.out.println(day[1]);
			
			
		
		
		GregorianCalendar expReturnDt = new GregorianCalendar(year[1], month[1], day[1]);
		GregorianCalendar  returnDt= new GregorianCalendar(year[0], month[0], day[0]);
		
		
		if(year[1]==year[0]){
			
			if(month[1] == month[0]){
				
				if(day[1]==day[0]){
					System.out.println(0);
					
				}else if(day[1]>day[0]){
					System.out.println(0);
					
				}else{
					System.out.println(((returnDt.getTimeInMillis()-expReturnDt.getTimeInMillis())/(60*60*24*1000))*15);
				}
				
				
			}else if(month[1]>month[0]) {
				System.out.println(0);
				
			}else{
				float ttlMonths = ((returnDt.getTimeInMillis()-expReturnDt.getTimeInMillis())/(60*60*24*1000))/30;
				System.out.println(((int)Math.ceil(ttlMonths))*500);
			}
			
		}else if(year[1]>year[0]){
			System.out.println(0);
			
			
		}else if(year[1]<year[0]) {
			System.out.println(1000);
		}
		

	}

}
