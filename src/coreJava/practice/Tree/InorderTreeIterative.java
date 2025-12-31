package coreJava.practice.Tree;

import java.util.Stack;

public class InorderTreeIterative {

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

    public void inOrder(TreeNode root) {

        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }


        }

    }

    public static void main(String[] args) {

        InorderTreeIterative binaryTree = new InorderTreeIterative();
        binaryTree.createBinaryTree();
        binaryTree.inOrder(binaryTree.root);

    }
}
