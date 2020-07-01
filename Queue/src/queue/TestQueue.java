/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author BHAGYA
 */
public class TestQueue {

    
    public static void main(String[] args) {
        
        Queue q=new Queue(6);
        q.insert(7);
        q.insert(6);
        q.insert(5);
        q.insert(3);
        q.display();
        q.remove();
        System.out.println();
        q.peek();
        System.out.println();
       q.remove();
       q.display();
        
        
        
        
        
        
        
        
    }
    
}
