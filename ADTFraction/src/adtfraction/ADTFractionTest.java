/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adtfraction;

/**
 *
 * @author BHAGYA
 */
public class ADTFractionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ADTFraction k=new ADTFraction();
        ADTFraction m=new ADTFraction();
        k.setNumerator(2);
        k.getNumerator();
        k.setDenominator(5);
        k.getDenominator();
        m.setNumerator(4);
        m.getNumerator();
        m.setDenominator(5);
        m.getDenominator();
        ADTFraction a=m.plus(k);
        System.out.println(a);
        
        ADTFraction b=m.substraction(k);
        System.out.println(b);
        
        ADTFraction c=m.multipication(k);
        System.out.println(c);
        
        ADTFraction d=m.division(k);
        System.out.println(d);
        
        ADTFraction e=m.recipicol();
        System.out.println(e);
        
        
        
        
        
        
        
    }
    
}
