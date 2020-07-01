/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noduparray;

/**
 *
 * @author BHAGYA
 */
public class TestNoDupArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        
        NoDupArray a=new NoDupArray(4,0);
        
        a.insert(70);
        a.insert(2);
        a.insert(3);
        boolean find=a.search(2);
        //a.delete(1);
        a.displayArray();
        
        
        
        
        
        
        
        
        
        
    }
    
}
