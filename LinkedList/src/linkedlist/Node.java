/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author BHAGYA
 */
public class Node {
    
    public int item;// data item
     public Node next;//reference to the next node
    public Node previous;
    
    public Node(){
        
        item=0; 
        next=null;
        previous=null;
        
    }
    
    
   public Node(int item){
       
       
       this.item=item;
       next=null;
       previous=null;
       
   } 
   
   
   public void displayNode(){
       
       System.out.print(item+" ");
   }
    
}
