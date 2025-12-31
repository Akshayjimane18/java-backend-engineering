package coreJava.practice.Tree;

import java.util.Stack;

public class PostOrderIterative {

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

    public void postOrder(TreeNode root) {

        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.peek().right;

                if (temp == null) {
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }
                } else {
                    current = temp;
                }
            }


        }

    }

    public static void main(String[] args) {

        PostOrderIterative binaryTree = new PostOrderIterative();
        binaryTree.createBinaryTree();
        binaryTree.postOrder(binaryTree.root);

    }
}
