package coreJava.practice.Tree;

public class PostOrderRecursive {
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
        postOrder(root.left);
        postOrder(root.right);

        System.out.print(root.data + " ");



    }

    public static void main(String[] args) {

        PostOrderRecursive binaryTree = new PostOrderRecursive();
        binaryTree.createBinaryTree();
        binaryTree.postOrder(binaryTree.root);

    }

}
