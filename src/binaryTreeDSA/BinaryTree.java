package binaryTreeDSA;

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

    public static void main(String[] args) {
        BinaryTree btree = new BinaryTree();
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = btree.buildTree(nodes);
        System.out.println(root.value);
    }
}
