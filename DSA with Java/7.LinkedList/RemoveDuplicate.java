package LinkedList;

public class RemoveDuplicate {
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

    // public ListNode deleteDuplicates(ListNode head) {
    // ListNode temp = head;
    // while(temp!=null){

    // while( temp.next!=null&& temp.val== temp.next.val ){
    // temp.next = temp.next.next;
    // }
    // temp=temp.next;
    // }
    // return head;
    // }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        if(temp==null){
            return head;
        }
        while (temp.next != null && temp.val == temp.next.val) {
            temp.next = temp.next.next;
        }
        deleteDuplicates(temp.next);
        return head;
    }
}
