package hackerRank;

import java.security.SecurityPermission;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
	
		
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );

	}

}




class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	int[] a = new int[3];
	
	
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}
	



class Student extends Person{
	
private int[] testScores;
List<String> al = new ArrayList<String>();

    
    Student(String fName, String lName, int id, int[] tScores){
       	super(fName, lName, id);
    	testScores=tScores;
        
    }
    
    public char calculate(){
        int totalScore=0;
        int avgScore=0;
        
        for(int i=0;i<testScores.length;i++){
            
            totalScore = testScores[i]+avgScore;
            
        }
        
        avgScore = totalScore/testScores.length;
        
        if(avgScore>=90&&avgScore<=100){
            
            return 'O';
        }else if(avgScore>=80&&avgScore<=90){
            return 'E';
            
        }else if(avgScore>=70&&avgScore<=80){
            return 'A';
        }else if(avgScore>=55&&avgScore<=70){
            return 'P';
        }else if(avgScore>=40&&avgScore<=55){
            return 'D';
        }else{
            return 'T';
        }
        
        
    }
   
	
}
