import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class SD {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

    }

    // https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> list = new ArrayList<String>();
        helper(root, list);
        return String.join(",", list);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        List<String> list = new ArrayList<>(Arrays.asList(data.split(",")));
        Collections.reverse(list);
        TreeNode node = helper2(list);
        return node;
    }

    void helper(TreeNode node, List<String> list) {
        if (node == null) {
            list.add("null");
            return;
        }
        list.add(String.valueOf(node.val));
        helper(node.left, list);
        helper(node.right, list);
    }

    TreeNode helper2(List<String> list) {
        String val = list.remove(list.size() - 1);
    
        if (val.charAt(0) == 'n') {
          return null;
        }
        
        TreeNode node = new TreeNode(Integer.parseInt(val));
    
        node.left = helper2(list);
        node.right = helper2(list);
    
        return node;
      }
    // public List<String> serialize(TreeNode root) {
    // List<String> list = new ArrayList<String>();
    // helper(root, list);
    // return list;
    // }

    // TreeNode deserialize(List<String> list) {
    // Collections.reverse(list);
    // TreeNode node = helper2(list);
    // return node;
    // }

}
