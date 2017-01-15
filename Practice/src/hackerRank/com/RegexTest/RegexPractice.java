package hackerRank.com.RegexTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String regexPattern = "[a-zA-Z]+";
		
		String str = "The quick brown fox jumped over the lazy dog...";
		
		Pattern p = Pattern.compile(regexPattern);
		
		Matcher m = p.matcher(str);
		
		while(m.find()){
			System.out.println(m.group());
		
		}
		
		
		
		
		
		

	}

}
