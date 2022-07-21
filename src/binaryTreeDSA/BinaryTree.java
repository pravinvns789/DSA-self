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
    public void leverlOrder(Node root){
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
        btree.leverlOrder(root);
        System.out.println(btree.countNode(root));
    }
}
