package hackerRank;

import java.util.*;

public class SolutionifElse {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); 
        scan.close();
        
        
        System.out.println(23&1);

        System.out.println( ((n & 1) == 1 || (6 <= n && n <= 20)) ? "Weird" : "Not Weird");
    }
}

