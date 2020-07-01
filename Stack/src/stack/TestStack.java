/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author BHAGYA
 */
public class TestStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Stack s=new Stack(5);
        s.push(4);
        s.push(2);
        s.push(3);
        s.push(7);
        s.peek();
        System.out.println();
        s.display();
        s.pop();
        s.pop();
        System.out.println();
        s.display();
        
    }
    
}
