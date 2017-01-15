package hackerRank.com.RmvDuplicatesLinkedList;

import java.util.Scanner;

public class Solution {
	
	
	
	 public static Node removeDuplicates(Node head) {
	      //Write your code here

		 Node newList = null;
		 
		 Node start = head;
		 
		 //Node curr = head;
		 //Node nxt = head.next;
		 
		 while(start.next!=null){
			 
           Node tmp = start.next;
           
           if(start.data == tmp.data){
        	   newList = insert(newList,start.data);
        	   start = tmp.next;
        	   
           }else {
        	   
        	   newList = insert(newList,start.data);
        	   start = start.next;
        	   
           }
			 
			
			 
		 }
		 
		 return newList;
		
		 
		
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);
	}
	
	  public static  Node insert(Node head,int data)
	    {
	        Node p=new Node(data);			
	        if(head==null)
	            head=p;
	        else if(head.next==null)
	            head.next=p;
	        else
	        {
	            Node start=head;
	            while(start.next!=null)
	                start=start.next;
	            start.next=p;

	        }
	        return head;
	    }
	    public static void display(Node head)
	        {
	              Node start=head;
	              while(start!=null)
	              {
	                  System.out.print(start.data+" ");
	                  start=start.next;
	              }
	        }
	       


}


class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}