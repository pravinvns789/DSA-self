package binaryTreeDSA;

import list.SinglyLinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    int idx=-1;
    static class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value=value;
            left=null;
            right=null;
        }

    }
    public Node buildTree(int[] nodes){
        idx++;
        if(nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;

    }
    public void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.value+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void inOrder(Node root){
        if (root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.value+" ");
        inOrder(root.right);
    }
    public void postOrder(Node root){
        if (root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value+" ");
    }
    public void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node current = q.remove();
            if(current==null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                System.out.print(current.value+" ");
                if(current.left!=null){
                    q.add(current.left);
                }
                if(current.right!=null){
                    q.add(current.right);
                }
            }
        }
    }

    public int countNode(Node root){
        if (root==null){
            return 0;
        }
        int left = countNode(root.left);
        int right=countNode(root.right);
        return left+right+1;

    }
    public int sumOfNodes(Node root){
        if(root==null){
            return 0;

        }
        int sumLeft=sumOfNodes(root.left);
        int sumRight=sumOfNodes(root.right);
        return sumLeft+sumRight +root.value;
    }
    public int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    public int diameter(Node root){
        if(root==null){
            return 0;
        }
        int dia1=diameter(root.left);
        int dia2 =diameter(root.right);
        int dia3=height(root.right)+height(root.left)+1;
         return Math.max(dia1,Math.max(dia2,dia3));
    }
    class TreeInfo{
        int ht;
        int dia;
        TreeInfo(int ht,int dia){
            this.dia=dia;
            this.ht=ht;
        }
    }
    public TreeInfo diameter2(Node root){
        if (root==null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right =diameter2(root.right);
        int myheight=Math.max(left.ht,right.ht)+1;
        int dia1= left.dia;
        int dia2=right.dia;
        int dia3=left.ht+right.ht+1;
        int mydia = Math.max(Math.max(dia1,dia2),dia3);
        TreeInfo myInfo = new TreeInfo(myheight,mydia);
        return myInfo;
    }

    public static void main(String[] args) {
        BinaryTree btree = new BinaryTree();
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = btree.buildTree(nodes);
        System.out.println(root.value);
        btree.preOrder(root);
        System.out.println();
        btree.inOrder(root);
        System.out.println();
        btree.postOrder(root);
        System.out.println();
        btree.levelOrder(root);
        System.out.println(btree.countNode(root));
        System.out.println(btree.sumOfNodes(root));
        System.out.println(btree.height(root));
        System.out.println(btree.diameter(root));
        System.out.println(btree.diameter2(root).dia);
    }
}
