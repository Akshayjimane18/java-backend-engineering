package coreJava.practice.Tree;
// Tree traversal in Java


class BinaryTreeRecursivePreOrder {
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

        System.out.print(root.data+" ");

        preOrder(root.left);
        preOrder(root.right);

    }

    public static void main(String[] args) {

        BinaryTreeRecursivePreOrder binaryTree = new BinaryTreeRecursivePreOrder();
        binaryTree.createBinaryTree();
        binaryTree.preOrder(binaryTree.root);

    }
}
