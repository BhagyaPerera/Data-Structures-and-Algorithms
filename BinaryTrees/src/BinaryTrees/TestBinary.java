/*
AS2016467
W.B.M.Perera
 */
package BinaryTrees;

/**
 *
 * @author BHAGYA
 */
public class TestBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Node n1=new Node(20);
        BinaryTrees tree=new BinaryTrees(n1);
        
        
        System.out.println("Insertion");
        tree.insert(20);
        tree.insert(15);
        tree.insert(12);
        tree.insert(30);
        tree.insert(40);
        tree.insert(17);
        tree.insert(28);
        tree.insert(26);
        tree.insert(29);
        tree.insert(35);
        tree.insert(32);
        tree.insert(37);
        tree.insert(50);
        tree.insert(27);
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Traverse ");
       
        Node n2=new Node(15);
        Node n3=new Node(12);
        Node n4=new Node(30);
        Node n5=new Node(40);
        Node n6=new Node(17);
        Node n7=new Node(28);
        Node n8=new Node(26);
        Node n9=new Node(29);
        Node n10=new Node(35);
        Node n11=new Node(32);
        Node n12=new Node(37);
        Node n13=new Node(50);
        Node n14=new Node(27);
        
        
        
        
        n1.left=n2;
        n2.left=n3;
        n1.right=n4;
        n4.right=n5;
        n5.right=n13;
        n4.left=n7;
        n2.right=n6;
        n7.left=n8;
        n7.right=n9;
        n5.left=n10;
        n10.left=n11;
        n10.right=n12;
        n8.right=n14;
                
        
        Node root=tree.getRoot();
        System.out.println();
        System.out.println();
        System.out.println("inOrder traverse :");
        tree.inOrder(root);
        
        System.out.println();
        System.out.println();
        System.out.println("preOrder traverse :");
        tree.preOrder(root);
        
        System.out.println();
        System.out.println();
        System.out.println("postOrder traverse :");
        tree.postOrder(root);
        
        
        
        System.out.println();
        System.out.println();
        
        System.out.println("find :");
        Node found=tree.find(30);
        
        if(found!=null)
            System.out.println(found.data);
        
        else
            System.out.println("Not Found");
        
        
        
        System.out.println();
        System.out.println();
        
        System.out.println("find succesor:");
        
        Node succesor=tree.findSuccesor(30);
        
        System.out.println(succesor.data);
        
        
        
        System.out.println();
        System.out.println();
        
        System.out.println("delete");
        
        
        Node del=tree.delete(30);
        
        System.out.println(del.data);
        
        
        
        
        
        System.out.println();
        System.out.println();
        System.out.println("inOrder traverse :");
        Node root1=tree.getRoot();
        
        tree.inOrder(root1);

        
        
        
        
        
        
        
  }
    
}
