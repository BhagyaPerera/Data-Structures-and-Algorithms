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
public class ADTFraction {
    
  private int numerator;
  private int denominator;
    
    
public ADTFraction(){
    
    numerator=0;
    denominator=1;
    
    
    
}


public ADTFraction(int numerator,int denominator){
    
    this.numerator=numerator;
    
    if(denominator!=0)
        this.denominator=denominator;
    
    else
        this.denominator=0;
          
}
    
  
public void setDenominator(int denominator){
    
    
    if(denominator!=0)
    this.denominator=denominator;
    
    else
        this.denominator=1;
    
    
}

public int getDenominator(){
    
    return denominator;
    
}



public void setNumerator(int numerator){
    
    
   
    this.numerator=numerator;
    
    
    
    
}

public int getNumerator(){
    
    return numerator;
    
}


public ADTFraction plus(ADTFraction k){
    
    int num,den;
    
    num=this.numerator*k.denominator+k.numerator*this.denominator;
    den=this.denominator*k.denominator;       
    
    
    
    ADTFraction a=new ADTFraction(num,den);
    
    return a;
    
}


public ADTFraction substraction(ADTFraction k){
    
    int num,den;
    
    num=this.numerator*k.denominator-k.numerator*this.denominator;
    den=this.denominator*k.denominator;       
    
    
    
    ADTFraction b=new ADTFraction(num,den);
    
    return b;
    
}


public ADTFraction multipication(ADTFraction k){
    
    int num,den;
    
    num=this.numerator*k.numerator;
    den=this.denominator*k.denominator;       
    
    
    
    ADTFraction c=new ADTFraction(num,den);
    
    return c;
    
}

public ADTFraction division(ADTFraction k){
    
    int num,den;
    
    num=this.numerator*k.denominator;
    den=this.denominator*k.numerator;       
    
    
    
    ADTFraction d=new ADTFraction(num,den);
    
    return d;
    
}

public ADTFraction recipicol(){
    
    int num,den;
    
    num=this.denominator;
    den=this.numerator;       
    
    
    
    ADTFraction e=new ADTFraction(num,den);
    
    return e;
    
}

public String toString(){
    
    return String.format(numerator+"/"+denominator);
    
    
    
}




}
