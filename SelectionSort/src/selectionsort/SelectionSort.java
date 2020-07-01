/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

/**
 *
 * @author BHAGYA
 */
public class SelectionSort {
    
    private int a[]={4,2,3,5,6,1,7,8,9};
    private int nElems;
    private int minIn;
  
    
    
    
 public SelectionSort(){
     
     nElems=9;
     minIn=0;
     
     
 }
  
 public void sorting(){
   
     int temp;
    
     
     for(int pass=0;pass<nElems;pass++){
         int min=pass;
         for(int i=pass+1;i<nElems;i++){
             
             if(a[i]<a[min]){
                 min=i;
                 
             }   
             
            
                 
           
           
         }
         
         temp=a[pass];
         a[pass]=a[min];
         a[min]=temp;
       
         
         
         
         
     }
     
     
     
     
     
     
 }
 
 
 public void display(){
     
     for(int i=0;i<nElems;i++){
         System.out.printf(" "+a[i]);
         
     }
     
     
     
     
 }
 
 
 
 
}