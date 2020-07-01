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
public class LinkedList {
    
    private Node head;
    private Node previous;
    private Node previousIn;
    
    
    public LinkedList(){
       
        previous=null;
        previousIn=null;
        
    }
    
   public boolean isEmpty(){
       
       return(head==null);
       
   
   }
   
   
    public void insertFirst(int i){
        
        Node newNode=new Node(i);
        
        if(isEmpty())
        head=newNode;
        
        else{
         
         newNode.next=head;
         head=newNode;
        }
        
    }
    
    
    public void insert(int i){
        
        Node newNode=new Node(i);
        Node current=head;
        
        if(isEmpty()){
            head=newNode;
        
        }
        else{
            
            while(current.item<i){
                
                previousIn=current;
                current=current.next;
                
            }
            
            previousIn.next=newNode;
            newNode.next=current;
                
                
                
                
                
       }
            
            
            
     
    }
    
    
    public Node Search(int searchKey){
        
        Node current=head;
        Node search=null;
   
        
        while(current!=null){
            
            if(current.item==searchKey){
                
                search =current;
                break;
                
            }
            
            else{
                
                previous=current;
                current=current.next;
            }
        }
        
       return search; 
        
        
    }
    
    
    public Node deleteFirst(){
     
        Node temp;
        
        temp=head;
        head=head.next;
        
        
        return temp;
    }
        
    public Node delete(int deleteKey){
     
        Node find=Search(deleteKey);
       
        if(find!=null){
            Node current=find;
            previous.next=current.next;
       
        }
        
        return find;
    }    
    
    
    public void displayLinkedlist(){
        
        Node current=head;
        while(current!=null){
            
            current.displayNode();
            
            current=current.next;
            
        }
        
        
        
        
    }    
        
        
    
    
    
}
