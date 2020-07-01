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
public class Stack {
    
    
    private int maxSize;
    private int top1;
    private int stackArray[];
    
    
    
    public Stack(int size){
        
        maxSize=size;
        top1=-1;
        stackArray=new int[maxSize];
        
     
    }
    
    
    public boolean isEmpty(){
        
        return (top1==-1);
       
        
    }
    
    public boolean isFull(){
        
        return(top1==maxSize-1);
        
    }
    
   public void push(int i){
       
       if(isFull())
           System.out.println("the Stack is fulled");
       
       else
      
       stackArray[++top1]=i;
       
           
   } 
   
   public int pop(){
       
       if(isEmpty()){
           System.out.println("the stack is empty");
           return 0;
       }
       
       else
       return stackArray[top1--];
       
       
       
   }
   
   
   
   public int peek(){
       
       return stackArray[top1];
         
   }
   
   public void display(){
       
       while(top1!=-1){
           
           System.out.printf("  "+stackArray[top1]);
           top1--;
       }
       
       
       
       
       
   }
   
}
