import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    BinaryTree tree = new BinaryTree();
    tree.populate(scanner);
    tree.display();
    tree.prettyDisplay();

    BinarySearchTree bst = new BinarySearchTree();
    int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
    // int[] nums = { 1,2,3,4,5,6,7,8,9,10};
    bst.populateSorted(nums);
    bst.populate(nums);
    bst.display();
    
    
    AVL avl = new AVL();
    for(int i=0; i<1000; i++){
      avl.insert(i);
    }

    System.out.println(avl.height());
  }
}