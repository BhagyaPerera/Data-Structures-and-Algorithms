/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author BHAGYA
 */
public class BubbleSort {
    
    private int a[]={1,3,6,4,5,2,7,9,8};
    private int nElems;
    
    
  public BubbleSort(){
      
     nElems=9;
  }  
    
  public  void sorting(){
      
      int temp;
      
      for(int pass=1;pass<=nElems;pass++){
          
          for(int i=0;i<nElems-pass;i++){
              
              if(a[i]>a[i+1]){
                  
                  temp=a[i];
                  a[i]=a[i+1];
                  a[i+1]=temp;
                  
              }
                  
              
              
          }
          
          
          
          
          
    }
     
      
  }
 public void displayArray(){
      
      for(int i=0;i<nElems;i++){
          System.out.printf(" "+a[i]);
          
      }
      
      
      
      
  }    
      
      
      
      
  
    
    
    
    
    
    
}
