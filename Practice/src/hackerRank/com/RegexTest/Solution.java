package hackerRank.com.RegexTest;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner in = new Scanner(System.in);
				
				String ipPattern = "[a-zA-Z0-0]@gmail.com";
				Pattern p = Pattern.compile(ipPattern);
				
				ArrayList<String> names = new ArrayList<String>();
				
		        int N = in.nextInt();
		        for(int a0 = 0; a0 < N; a0++){
		            String firstName = in.next();
		            String emailID = in.next();
		            Matcher m = p.matcher(emailID);
		            if(m.find()){
		            	
		            	names.add(firstName);
		            	
		            }
		            
		        }
		        
		        Collections.sort(names);
		        
		        
		        for(int i=0;i<names.size();i++){
		        	System.out.println(names.get(i));
		        }
		        	
		        	
		        	
		        
		        
		    }
		
		
	

}
