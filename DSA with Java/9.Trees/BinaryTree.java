import java.util.Scanner;

public class BinaryTree {
    private static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        TreeNode(int value) {
            this.value = value;
        }

        TreeNode() {

        }
    }

    private TreeNode root;

    public void populate(Scanner scanner) {
        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();
        root = new TreeNode(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, TreeNode node) {
        System.out.println("do you want to insert to the left of : " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of left node");
            int value = scanner.nextInt();
            node.left = new TreeNode(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to insert to the right of : " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of right node");
            int value = scanner.nextInt();
            node.right = new TreeNode(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(this.root, "");
    }

    private void display(TreeNode node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        prettyDisplay(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|--------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }

    public void preOrder() {
        preOrder(root);
    }

    // Pre-order traversal
    private void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    
    // In-order traversal
    public void inOrder() {
        inOrder(root);
    }
    
    private void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.value + " ");
        inOrder(node.right);
    }
    
    // Post-order traversal
    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value + " ");
    }
}