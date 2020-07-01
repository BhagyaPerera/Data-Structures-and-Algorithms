/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author BHAGYA
 */
public class Queue {
    
    private int maxSize;
    private int a[];
    private int front;
    private int rear;
    private int nElems;
    
 public Queue(int size){
     
     maxSize=size;
     a=new int[maxSize];
     front=0;
     rear=-1;
     
     
     
 }   
    
    
 public boolean isEmpty(){
     
     return(front==maxSize);
     
     
 }   
    
 
public boolean isFull(){
    
    return(rear==maxSize);
    
} 

public void insert(int i){
    
    if(isFull())
        System.out.println("Queue is fulled");
    
    else
        rear+=1;
        a[rear]=i;
        nElems++;
    
}

public void remove(){
    
    if(isEmpty())
        System.out.println("Queue is empty");
    
    else
        front+=1;
    
    
}



public int peek(){
    return a[front];
    
}


public void display(){
    
    while(front<nElems)
        System.out.printf(" "+a[front++]);
        
    
       
}




}
