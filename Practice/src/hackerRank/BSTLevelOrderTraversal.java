package hackerRank;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class BSTLevelOrderTraversal {
	
	static Queue<NodeBSTLvl> eleQue = new LinkedList<NodeBSTLvl>();
	
	static void levelOrder(NodeBSTLvl root){
		
		eleQue.add(root);
		
		while(!eleQue.isEmpty()){
			
			NodeBSTLvl tmp = eleQue.poll();
			
			System.out.print(tmp.data+" ");
			
			
			if(tmp.left!=null){
				eleQue.add(tmp.left);
				
			} 
			
			if(tmp.right!=null){
				eleQue.add(tmp.right);
				
			}
			
			
		}
		
		
		
		
	    }
	
	public static NodeBSTLvl insert(NodeBSTLvl root,int data){
        if(root==null){
            return new NodeBSTLvl(data);
        }
        else{
            NodeBSTLvl cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
	    int T=sc.nextInt();
	    NodeBSTLvl root=null;
	    while(T-->0){
	        int data=sc.nextInt();
	        root=insert(root,data);
	    }
	    levelOrder(root);
		
	   
	}

}

class NodeBSTLvl{
    NodeBSTLvl left,right;
    int data;
    NodeBSTLvl(int data){
        this.data=data;
        left=right=null;
    }
}

