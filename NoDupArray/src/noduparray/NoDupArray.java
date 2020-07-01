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
public class NoDupArray{
    
        private int size;
        private int nElems;
        private int a[];
        private int findIndex;
        
public NoDupArray(){
    
    size=0;
    nElems=0;
    findIndex=0;
    
}
    
public NoDupArray(int size,int nElems){
    
    this.size=size;
    this.nElems=nElems;
    a=new int[size];
    
    
}  
    
public void insert(int insertKey){
    
    
    if(nElems<size){
    
     for(int i=0;i<size;i++){
        
        if(a[i]==0){
            a[i]=insertKey;
             nElems++;
            break;
        }
        
     }  
        
        
   }
   
    else
        System.out.println("Array size exceed");
    
    
}  
    
  
public boolean search(int searchKey){
    
    boolean find=false;
    int i=0;
    
    while(i<nElems){
        
        if(a[i]==searchKey){
            findIndex=i;
            find=true;
            break;
        }
        
    }
    
    
    
   return find; 
}   
    
/*        
 public void delete(int deleteKey){
     
     
     boolean find=search(deleteKey);
     int i=findIndex;
     
     if(find==true){
         
         while(i<nElems){
             
             a[i]=a[i+1];
             
             
         }
       nElems--; 
              
     }
     
     
     
     
 }
      
 */ 
public void displayArray(){
    
    
    for(int i=0;i<nElems;i++){
        
        System.out.printf(a[i]+" ");
        
        
        
    }
    
    
    
    
    
}
        
        
        
        
        
   
}
