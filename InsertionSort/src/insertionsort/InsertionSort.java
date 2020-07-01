/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

/**
 *
 * @author BHAGYA
 */
public class InsertionSort {
    
    private int a[]={1,5,6,8,9,3,4,2,7};
 
    private int nElems;
    
    
  public InsertionSort(){
      
      nElems=10;
      
  }  
    
    
 public void sort(){
     
   int temp=a[0];
   
   for(int pass=0;pass<nElems-1;pass++){
      
       int previousKey=pass;
       int markedKey=pass+1;
       
       
     while(temp<a[previousKey--]){
     
   
     }
     for(int i=previousKey+1;i<markedKey-2;i++){
         
         a[i+1]=a[i];
         a[previousKey+1]=temp;
         
     }
   }
 }   
    
 public void display(){
     
     for(int i=0;i<nElems;i++){
         
         System.out.println(a[i]);
     }
     
     
     
     
 }   
    
}
