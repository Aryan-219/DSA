import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
public class DFS {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // https://leetcode.com/problems/diameter-of-binary-tree/description/
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int dia = leftHeight + rightHeight + 1;
        diameter = Math.max(dia, diameter);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // https://leetcode.com/problems/invert-binary-tree/description/
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;

    }

    // https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
    TreeNode root;

    public TreeNode sortedArrayToBST(int[] nums) {
        sortedArrayToBST(nums, 0, nums.length);
        return root;
    }

    private void sortedArrayToBST(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        this.insert(nums[mid]);
        sortedArrayToBST(nums, start, mid);
        sortedArrayToBST(nums, mid + 1, end);
    }

    public void insert(int val) {
        root = insert(val, root);
    }

    private TreeNode insert(int val, TreeNode node) {
        if (node == null) {
            node = new TreeNode(val);
            return node;
        }
        if (val < node.val) {
            node.left = insert(val, node.left);
        }
        if (val > node.val) {
            node.right = insert(val, node.right);
        }
        // node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    // https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/
    public void flatten(TreeNode root) {

        TreeNode current = root;

        while (current != null) {
            if (current.left != null) {
                TreeNode temp = current.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }

    // https://leetcode.com/problems/validate-binary-search-tree/description/
    public boolean isValidBST(TreeNode root) {
        return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean helper(TreeNode node, int low, int high) {
        if (node == null) {
            return true;
        }
        if (node.val >= high) {
            return false;
        }
        if (node.val <= low) {
            return false;
        }
        if (node.left != null) {
            if (node.left.val >= node.val) {

                return false;
            }
        }
        if (node.right != null) {
            if (node.val >= node.right.val) {
                return false;
            }
        }
        boolean flagleft = helper(node.left, low, node.val);
        boolean flagright = helper(node.right, node.val, high);
        return flagleft && flagright;
    }

    // https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (p == root || q == root) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        return left == null ? right : left;
    }

    // https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/
    int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        TreeNode x = helper(root, k);
        return x.val;
    }

    private TreeNode helper(TreeNode node, int k) {
        if (node == null) {

            return null;
        }
        TreeNode left = helper(node.left, k);
        if (left != null) {
            return left;
        }
        count++;
        if (k == count) {
            return node;
        }
        return helper(node.right, k);
    }

    // https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        int r = preorder[0];
        int index = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == r) {
                index = i;

            }
        }
        TreeNode node = new TreeNode(r);
        node.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1), Arrays.copyOfRange(inorder, 0, index));
        node.right = buildTree(Arrays.copyOfRange(preorder, index + 1, preorder.length),
                Arrays.copyOfRange(inorder, index + 1, inorder.length));
        return node;
    }

    // https://leetcode.com/problems/path-sum/
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (targetSum - root.val == 0) {
            return true;
        }
        if (targetSum - root.val < 0) {
            return false;
        }
        boolean left = hasPathSum(root.left, targetSum - root.val);
        boolean right = hasPathSum(root.right, targetSum - root.val);
        return left || right;
    }

    // https://leetcode.com/problems/sum-root-to-leaf-numbers/
    public int sumNumbers(TreeNode root) {
        ArrayList<String> list = new ArrayList<String>();
        if (root == null) {
            return 0;
        }
        String sum = "";
        sumNumbers(root, list, sum);
        int res = 0;
        // sum all numbers of list and return
        for (int i = 0; i < list.size(); i++) {
            res += Integer.parseInt(list.get(i));
        }
        return res;
    }

    void sumNumbers(TreeNode root, ArrayList<String> list, String sum) {

        if (root == null) {
            sum = "";
            return;
        }
        sum += root.val;
        if (root.left == null && root.right == null) {
            list.add(sum);
            return;
        }
        sumNumbers(root.left, list, sum);
        sumNumbers(root.right, list, sum);
    }
    // Optimized code for sumNumbers
    // public int sumNumbers(TreeNode root) {
    // return helper(root, 0);
    // }

    // private int helper(TreeNode node, int sum) {
    // if (node == null) {
    // return 0;
    // }
    // sum = sum * 10 + node.val;
    // if (node.left == null && node.right == null) {
    // return sum;
    // }
    // return helper(node.left, sum) + helper(node.right, sum);
    // }

    // https://leetcode.com/problems/binary-tree-maximum-path-sum/description/
    int ans = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }

    private int helper(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftSum = helper(node.left);
        int rightSum = helper(node.right);
        leftSum = Math.max(0, leftSum);
        rightSum = Math.max(0, rightSum);
        int pathSum = leftSum + rightSum + node.val;
        ans = Math.max(ans, pathSum);

        return Math.max(leftSum, rightSum) + node.val;
    }

    boolean findPath(TreeNode node, int[] arr) {
        if (node == null) {
            return arr.length == 0;
        }
        return helper(node, arr, 0);
    }

    boolean helper(TreeNode node, int[] arr, int index) {
        if (node == null) {
            return false;
        }
        if (index >= arr.length || node.val != arr[index]) {
            return false;
        }
        if (node.left == null && node.right == null && index == arr.length - 1) {
            return true;
        }
        return helper(node.left, arr, index + 1) || helper(node.right, arr, index + 1);
    }
    
    // dfs using stack
    void dfsStack(TreeNode node) {
        if(node==null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()) {
            TreeNode current = stack.pop();
            System.out.print(current.val + " ");
            if(current.right!=null) stack.push(current.right);
            if(current.left!=null) stack.push(current.left);
            
        }
    }

}
