package coreJava.practice.Tree;

import java.util.Stack;

public class BinaryTreeIterativePreOrder {

    private TreeNode root;

    private class TreeNode {

        private TreeNode left;
        private TreeNode right;

        private int data;

        TreeNode(int data) {

            this.data = data;

        }


    }

    public void createBinaryTree() {

        TreeNode first = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);

        root = first;

        first.left = two;
        first.right = three;

        two.left = four;
        two.right = five;


    }

    public void preOrder(TreeNode root){

        if(root==null){
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();

            System.out.print(temp.data + " ");

            if (temp.right!=null){
                stack.push(temp.right);
            }

            if (temp.left!=null){
                stack.push(temp.left);
            }

        }

    }

    public static void main(String[] args) {

        BinaryTreeIterativePreOrder binaryTree = new BinaryTreeIterativePreOrder();
        binaryTree.createBinaryTree();
        binaryTree.preOrder(binaryTree.root);

    }

}
