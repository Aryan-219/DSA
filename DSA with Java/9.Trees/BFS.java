// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Queue;

// import javax.swing.tree.TreeNode;

public class BFS {
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

        // private void bfs(Queue<List<TreeNode>> queue) {
        //     List<TreeNode> list = queue.poll();

        //     if (list.isEmpty()) {
        //         return;
        //     }
        //     List<TreeNode> children = new ArrayList<TreeNode>();

        //     for (TreeNode node : list) {

        //         System.out.print(node.val + " ");
        //         if (node.left != null) {
        //             children.add(node.left);
        //         }
        //         if (node.right != null) {
        //             children.add(node.right);
        //         }
        //     }
        //     queue.add(children);
        //     System.out.println();
        //     bfs(queue);
        // }

        // Kunal's implementation
        // public List<List<Integer>> levelOrder(TreeNode root) {
        // List<List<Integer>> result = new ArrayList<>();

        // if (root == null) {
        // return result;
        // }

        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.offer(root);

        // while (!queue.isEmpty()) {
        // int levelSize = queue.size();
        // List<Integer> currentLevel = new ArrayList<>(levelSize);
        // for (int i = 0; i < levelSize; i++) {
        // TreeNode currentNode = queue.poll();
        // currentLevel.add(currentNode.val);
        // if (currentNode.left != null) {
        // queue.offer(currentNode.left);
        // }
        // if (currentNode.right != null) {
        // queue.offer(currentNode.right);
        // }
        // }
        // result.add(currentLevel);
        // }
        // return result;
        // }

        // public List<Double> averageOfLevels(TreeNode root) {
        // List<Double> result = new ArrayList<Double>();
        // if (root == null) {
        // return result;
        // }
        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.offer(root);
        // while(!queue.isEmpty()) {
        // int levelSize = queue.size();
        // double sum = 0;
        // for(int i = 0; i < levelSize; i++) {
        // TreeNode currentNode = queue.poll();
        // sum += currentNode.val;
        // if(currentNode.left!= null) {
        // queue.offer(currentNode.left);
        // }
        // if(currentNode.right!= null) {
        // queue.offer(currentNode.right);
        // }
        // }
        // result.add(sum / levelSize);
        // }
        // return result;
        // }

        // public TreeNode findSuccessor(TreeNode root, int key) {
        // if (root == null) {
        // return null;
        // }
        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.offer(root);

        // while (!queue.isEmpty()) {
        // // int levelSize = queue.size();

        // TreeNode currentNode = queue.poll();
        // if (currentNode.left != null) {
        // queue.offer(currentNode.left);
        // }
        // if (currentNode.right != null) {
        // queue.offer(currentNode.right);
        // }
        // if (currentNode.val == key) {
        // break;
        // }

        // }
        // return queue.peek();
        // }

        // public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // List<List<Integer>> result = new ArrayList<>();
        // if (root == null) {
        // return result;
        // }
        // Deque<TreeNode> queue = new LinkedList<>();
        // queue.offer(root);
        // boolean leftToRight = false;
        // while (!queue.isEmpty()) {
        // int levelSize = queue.size();
        // List<Integer> currentLevel = new ArrayList<>(levelSize);
        // for (int i = 0; i < levelSize; i++) {
        // if (leftToRight) {
        // TreeNode currentNode = queue.pollFirst();
        // currentLevel.add(currentNode.val);
        // if (currentNode.left!= null) {
        // queue.addLast(currentNode.left);
        // }
        // if (currentNode.right!= null) {
        // queue.addLast(currentNode.right);
        // }
        // } else {
        // TreeNode currentNode = queue.pollLast();
        // currentLevel.add(currentNode.val);
        // if (currentNode.right!= null) {
        // queue.addFirst(currentNode.right);
        // }
        // if (currentNode.left!= null) {
        // queue.addFirst(currentNode.left);
        // }
        // }
        // }
        // result.add(currentLevel);
        // leftToRight =!leftToRight;
        // }
        // return result;
        // }
        // public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // List<List<Integer>> result = new ArrayList<>();

        // if (root == null) {
        // return result;
        // }

        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.offer(root);

        // while (!queue.isEmpty()) {
        // int levelSize = queue.size();
        // List<Integer> currentLevel = new ArrayList<>(levelSize);
        // for (int i = 0; i < levelSize; i++) {
        // TreeNode currentNode = queue.poll();
        // currentLevel.add(currentNode.val);
        // if (currentNode.left != null) {
        // queue.offer(currentNode.left);
        // }
        // if (currentNode.right != null) {
        // queue.offer(currentNode.right);
        // }
        // }
        // result.add(0,currentLevel);
        // }
        // return result;
        // }

        //
        // public Node connect(Node root) {
        // connect(root);
        // }

        // private void connect(Node node){
        // Node leftMost = node;
        // Node current = node;

        // while(leftMost.left != null){
        // while(current.next!=null){
        // current.left.next = current.right;
        // current.right.next = current.next.left;
        // }
        // leftMost=leftMost.left;
        // }
        // }

        // https://leetcode.com/problems/binary-tree-right-side-view/
        // public List<Integer> rightSideView(TreeNode root) {
        // List<Integer> result = new ArrayList<>();

        // if (root == null) {
        // return result;
        // }

        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.offer(root);

        // while (!queue.isEmpty()) {
        // int levelSize = queue.size();
        // List<Integer> currentLevel = new ArrayList<>(levelSize);
        // for (int i = 0; i < levelSize; i++) {
        // TreeNode currentNode = queue.poll();
        // currentLevel.add(currentNode.val);
        // if (currentNode.left != null) {
        // queue.offer(currentNode.left);
        // }
        // if (currentNode.right != null) {
        // queue.offer(currentNode.right);
        // }
        // }
        // result.add(currentLevel.get(currentLevel.size() - 1));
        // }
        // return result;
        // }

        // https://leetcode.com/problems/cousins-in-binary-tree/description/
        // public boolean isCousins(TreeNode root, int x, int y) {
        // TreeNode xx = findNode(root, x);
        // TreeNode yy = findNode(root, y);

        // return ((level(root, xx, 0) == level(root, yy, 0)) && (!isSibling(root, xx,
        // yy)));
        // }

        // private TreeNode findNode(TreeNode node, int a) {
        // if (node == null) {
        // return null;
        // }
        // if (node.val == a) {
        // return node;
        // }
        // TreeNode left = findNode(node.left, a);
        // if (left != null) {
        // return left;
        // }
        // return findNode(node.right, a);
        // }

        // private boolean isSibling(TreeNode node, TreeNode x, TreeNode y) {
        // if (node == null) {
        // return false;
        // }
        // return ((node.left == x && node.right == y) ||
        // (node.left == y && node.right == x) ||
        // isSibling(node.left, x, y) ||
        // isSibling(node.right, x, y));
        // }

        // int level(TreeNode node, TreeNode x, int lev) {
        // if (node == null) {
        // return 0;
        // }
        // if (node == x) {
        // return lev;
        // }
        // int l = level(node.left, x, lev + 1);
        // if (l != 0) {
        // return l;
        // }

        // return level(node.right, x, lev + 1);
        // }

        // https://leetcode.com/problems/symmetric-tree/submissions/1410419174/
        // public boolean isSymmetric(TreeNode root) {
        // Queue<TreeNode> queue = new LinkedList<TreeNode>();
        // queue.add(root.left);
        // queue.add(root.right);
        // while(!queue.isEmpty()) {
        // TreeNode left = queue.poll();
        // TreeNode right = queue.poll();
        // if (left == null && right == null) {
        // continue;
        // }
        // if (left == null || right == null || left.val!= right.val) {
        // return false;
        // }
        // queue.add(left.left);
        // queue.add(right.right);
        // queue.add(left.right);
        // queue.add(right.left);
        // }
        // return true;
        // }
    }
}