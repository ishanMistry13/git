package hackerRank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class PalindromeStckQue {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner(System.in);
	        String input = scan.nextLine();
	        scan.close();

	        // Convert input String to an array of characters:
	        char[] s = input.toCharArray();

	        // Create a Solution object:
	        PalinDromeSol p = new PalinDromeSol();

	        // Enqueue/Push all chars to their respective data structures:
	        for (char c : s) {
	            p.pushCharacter(c);
	            p.enqueueCharacter(c);
	        }

	        // Pop/Dequeue the chars at the head of both data structures and compare them:
	        boolean isPalindrome = true;
	        for (int i = 0; i < s.length/2; i++) {
	            if (p.popCharacter() != p.dequeueCharacter()) {
	                isPalindrome = false;                
	                break;
	            }
	        }

	        //Finally, print whether string s is palindrome or not.
	        System.out.println( "The word, " + input + ", is " 
	                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
	    }

	}

class PalinDromeSol {
	Stack<Character> stck = new Stack<Character>();
	
	Queue<Character> que = new LinkedList<Character>();
	
	
	
	void pushCharacter(char c){
	
	//	if(stck.isEmpty()){
			this.stck.push(c);
		//}
		
			
		
	}
	
	void enqueueCharacter(char c){
		
		//if(que.isEmpty()){
		
			
			this.que.add(c);
			
		//}
		
		
	}
	
	
	char popCharacter(){
		
		return this.stck.pop();
		
	} 
	
	
	
	char dequeueCharacter(){
		
		return this.que.remove();
		
	} 
	
	
		
	
	
	
}


