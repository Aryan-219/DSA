package LinkedList;
public class MiddleOfTheLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode f = head;
        ListNode s = head;

        while(f!= null && f.next != null){
            s = s.next;
            f= f.next.next;
        }
        return s;
    }
    public static void main(String[] args) {

    }
}
