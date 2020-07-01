/*
 AS2016467
 W.B.M.Perera*/


package BinaryTrees;

/**
 *
 * @author BHAGYA
 */
public class BinaryTrees {
    
    
     public Node root;
     public Node parent;//parent of the delete node//
     public Node successorParent;//parent of successor//
     public Node par;//parent of insert node//
     
     
     
  public BinaryTrees(){
      
      root=null;
      parent=null;
      
  } 
  
public BinaryTrees(Node root){
    
    this.root=root;
    parent=root;
    
    
    
}  
    
  public void insert(int i){
       
    
       Node curr=root;
       if(root==null){
          
           root=new Node (i);
           curr=root;
       
       }
       else{
           while(curr!=null){
               
               if(i<curr.data){
                   par=curr;
                   curr=curr.left;
                    
                   if(curr==null)
                       curr=new Node(i);
                       
                   
                   break;
                 }    
                else{
                   par=curr;
                   curr=curr.right;
               
                   if(curr==null)
                       curr=new Node(i);
                   
                   break;
                   
                }
               
            }
       
      }
       
       System.out.print(i+ " ");
      
   }
  
  
   
  public Node getRoot(){
      
      return root;
  }
  
   
 public void inOrder(Node localroot){
     
    
     
     if(localroot!=null){
         inOrder(localroot.left);
    
         System.out.print(localroot.data+ " ");
         inOrder(localroot.right);
     
     }
     

     
 }   
 
 
 public void preOrder(Node localroot){
     
     if(localroot!=null){
         
         System.out.print(localroot.data+ " ");
         preOrder(localroot.left);
         preOrder(localroot.right);
     
     }
     
 }   
 
 
 public void postOrder(Node localroot){
     
     if(localroot!=null){
         
         postOrder(localroot.left);
         postOrder(localroot.right);
         System.out.print(localroot.data+ " ");

     }
     
 }   
 
 
 
public Node find(int findKey){
    
    Node curr=root;
    
    
    while(curr.data!=findKey){
        
            parent=curr;
            if(curr.data>findKey)
            curr=curr.left;
        
        
            else if(curr.data<findKey)
            curr=curr.right;
  
            if(curr==null)
            return null;
    
           
    } 
    return curr;
  }   
        
        
       
  public Node findSuccesor(int deleteKey){
         
      Node delNode=find(deleteKey);
      successorParent=delNode;
      Node successor=delNode;
      Node current=delNode.right;
     
      while(current!=null){
      
        successorParent=successor;
        successor=current;
        current=current.left;
        
    
      }
    
    
    
    return successor;
    
  } 
  
  
  public Node delete(int delKey){
      
     
      Node delNode=find(delKey);
      Node deleted=delNode;
      Node successor=findSuccesor(delKey);
      
      //delete a node with no child//
        if((delNode.left==null)&&(delNode.right==null)){
         
          if(delNode==root)
             root=null;
            
         else if(delNode==parent.left) 
              parent.left=null;
         else
            parent.right=null;
         
          deleted=delNode;
          
        }  
        
   //delete a node that has one child//
        
        //deleta a node that has only right child//
        else if((delNode.right!=null)&&(delNode.left==null)){
            
            if(delNode==root)
                root=delNode.right;
            
            
            else if(parent.right==delNode)
                parent.right=delNode.right;
            
            
            else if(parent.left==delNode)
                parent.left=delNode.right;
                  
          deleted=delNode;        
        }
          
        //delete a node that has only left child//
        else if((delNode.right==null)&&(delNode.left!=null)){
            
            if(delNode==root)
                root=delNode.left;
            
            
            else if(parent.right==delNode)
                parent.right=delNode.left;
            
            
            else if(parent.left==delNode)
                parent.right=delNode.right;
            
            
          
          
          deleted=delNode;
        }
      
      
       // delete a node that has two children// 
        else if((delNode.right!=null)&&(delNode.left!=null)){
            
            if(successor==delNode.right){
                successor.left=delNode.left;
                
                if(delNode==parent.right)
                parent.right=successor;
                
                else if(delNode==parent.left)
                parent.left=successor;
                
                else if(delNode==root)
                    root=successor;
                    
                
                
            }
            
            
            else{
                
                
                if(delNode==parent.right){
                    
                    successorParent.left=successor.right;
                    successor.right=delNode.right;
                    parent.right=successor;
                    successor.left=delNode.left;
                    
                    
                    
                    
                }
                
                else if(delNode==parent.left){
                    
                    
                    successorParent.left=successor.right;
                    successor.right=delNode.right;
                    parent.left=successor;
                    successor.left=delNode.left;
                    
                    
                }
                
                else if(delNode==root){
    
                    successorParent.left=successor.right;
                    successor.right=delNode.right;
                    root=successor;
                    successor.left=delNode.left;
                    

                    
                    
                }
                
            }  
        deleted=delNode; 
                
       }
            
            return deleted;
            
            
  }
   
 
}
 
 
 
 
 
 
 
 
 
    
    
    
    

