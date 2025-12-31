package coreJava.practice.Tree;

public class MaximumValueInTree {

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

        TreeNode first = new TreeNode(9);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(100);

        root = first;

        first.left = two;
        first.right = three;

        two.left = four;
        two.right = five;


    }

    public int preOrder(TreeNode root) {

        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int result = root.data;

        int left = preOrder(root.left);
        int right = preOrder(root.right);

        if (result < left)
            result = left;

        if (result < right) {
            result = right;
        }

        return result;


    }

    public static void main(String[] args) {

        MaximumValueInTree binaryTree = new MaximumValueInTree();
        binaryTree.createBinaryTree();

        System.out.println(binaryTree.preOrder(binaryTree.root));


    }

}
