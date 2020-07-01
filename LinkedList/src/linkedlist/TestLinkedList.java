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
public class TestLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        LinkedList l=new LinkedList();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(5);

        
        
        l.displayLinkedlist();
        l.delete(20);
       // l.deleteFirst();
        System.out.println();
        l.displayLinkedlist();
        
        
        
        
        
        
        
        
        
    }
    
}
