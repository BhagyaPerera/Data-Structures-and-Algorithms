/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursive2;

/**
 *
 * @author BHAGYA
 */
public class recursive2 {
    
    
    private int[]a={1,3,5,7,4,6,9};
    private int nElems;
    private int[]b;
    
    

    
    
    
    
 public void mergeSort(int lwbd,int upbd){
   
   
     
     if(lwbd==upbd)
         return;
     
     else{
         
         int mid=(lwbd+upbd)/2;
         
         mergeSort(lwbd,mid);
         
         mergeSort(mid+1, upbd);
         
         merge(lwbd,mid+1,upbd);
     
       
     
     }  
 }   
     
  public void merge(int lwptr,int highPtr,int upbd){
      
      int i=0;
      int lwbd=lwptr;
      int mid=highPtr-1;
      nElems=upbd-lwbd+1;
      
        b=new int[nElems];
      while((lwptr<=mid)&&(highPtr<=upbd)){
          
          if(a[lwptr]<a[highPtr])
              b[i++]=a[lwptr++];
              
          else
              b[i++]=a[highPtr++];
          
      }   
      while(lwptr<=mid)  
          
          b[i++]=a[lwptr++];
          
      while(highPtr<=upbd)
          
          b[i++]=a[highPtr++];
      
      
}   
     
public void display(){
    
    
    for(int i=0;i<nElems;i++){
        
        System.out.print(b[i]+" ");
        
    }
    
     
     
     
     
     
 } 
    
    
    
    
    
    
    
    
    
    
    
    
}
