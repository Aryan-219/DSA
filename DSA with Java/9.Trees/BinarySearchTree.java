import java.util.Scanner;

public class BinarySearchTree {
    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public BinarySearchTree() {

    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node populate(Scanner scanner) {
        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
        return root;
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("do you want to insert to the left of : " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of left node");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to insert to the right of : " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of right node");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }
    // public void populate(int[] nums) {
    //     for (int i = 0; i < nums.length; i++) {
    //         this.insert(nums[i]);
    //     }
    // }

    // public void populateSorted(int[] nums) {
    //     populateSorted(nums, 0, nums.length);
    // }

    // private void populateSorted(int[] nums, int start, int end) {
    //     if (start >= end) {
    //         return;
    //     }
    //     int mid = (start + end) / 2;
    //     this.insert(nums[mid]);
    //     populateSorted(nums, start, mid);
    //     populateSorted(nums, mid + 1, end);
    // }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        if (value > node.value) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public boolean isBalanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public void display() {
        display(root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }


    // https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/
    int count = 0;

    public int kthSmallest(Node root, int k) {
        Node x = helper(root, k);
        return x.value;
    }

    private Node helper(Node node, int k) {
        if (node == null) {

            return null;
        }
        Node left = helper(node.left, k);
        if (left != null) {
            return left;
        }
        count++;
        if (k == count) {
            return node;
        }
        return helper(node.right, k);
    }

}
