package binaryTreeDSA;

public class BinarySearchTree {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            right=null;
            left=null;
        }
    }
    public Node build(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(data< root.data){
            root.left=build(root.left,data);
        }
        else {
            root.right=build(root.right,data);
        }
        return root;
    }
    public void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public boolean isFound(Node root,int data){
        if(root==null){
            return false;
        }
        if(root.data==data){
            return true;
        }

        if(data< root.data){
            isFound(root.left,data);
        }
        else {
            isFound(root.right,data);
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] data = {5,1,3,4,2,7};
        Node root=null;
        for (int x:data){
            root=bst.build(root,x);
        }
        bst.inOrder(root);
        System.out.println();
        System.out.println(bst.isFound(root,5));
        System.out.println(bst.isFound(root,8));
    }
}
