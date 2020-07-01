/*
 * AS2016467
   W.B.M.Perera
 */
package BinaryTrees;

/**
 *
 * @author BHAGYA
 */
public class Node {
    
    public int data;
    public Node left;
    public Node right;
    
    
    
 public Node(){
     
     data=0;
     left=null;
     right=null;
     
     
 }   
    
    
  public Node(int data){
      
      this.data=data;
      left=null;
      right=null;
      
      
  }  
    
 
  public Node getLeft(){
         
      
     return  left;
      
 }
  
  
 public Node getRight(){
        
      
     return right;
      
 }
    
    
    
    
    
}
