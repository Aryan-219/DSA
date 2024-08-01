package LinkedList;

public class MergeTwoSortedLists {
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

    // public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    //     ListNode node1 = list1;
    //     ListNode node2 = list2;
    //     ListNode head = new ListNode();
    //     ListNode node = head;
    //     while (node1 != null && node2 != null) {
    //         if (node1.val < node2.val) {
    //             ListNode x = new ListNode(node1.val);
    //             node.next = x;
    //             node = x;
    //             node1 = node1.next;
    //         } else {
    //             ListNode x = new ListNode(node2.val);
    //             node.next = x;
    //             node = x;
    //             node2 = node2.next;
    //         }
    //     }
    //     while (node1 != null) {
    //         ListNode x = new ListNode(node1.val);
    //         node.next = x;
    //         node = x;
    //         node1 = node1.next;

    //     }
    //     while (node2 != null) {

    //         ListNode x = new ListNode(node2.val);
    //         node.next = x;
    //         node = x;
    //         node2 = node2.next;

    //     }
    //     head = head.next;
    //     return head;
    // }

    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list = new ListNode();
        ListNode temp = list;
        mergeTwoListsRec(list1, list2, temp);
        return list.next;
        
    }
    public void mergeTwoListsRec(ListNode list1, ListNode list2,ListNode temp) {
        

        if (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
                ListNode x = new ListNode(list1.val);
                temp.next = x;
                mergeTwoListsRec(list1.next, list2,temp.next);
            } else {
                ListNode x = new ListNode(list2.val);
                temp.next = x;
                mergeTwoListsRec(list1, list2.next,temp.next);
            }
        }
        if (list1 != null) {
            ListNode x = new ListNode(list1.val);
            temp.next = x;
            mergeTwoListsRec(list1.next, list2,temp.next);
        }
        if (list2 != null) {
            ListNode x = new ListNode(list2.val);
            temp.next = x;
            mergeTwoListsRec(list1, list2.next,temp.next);
        }
        return ;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        // skip the first left-1 nodes
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        // reverse between left and right
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
        return head;
    }

}
