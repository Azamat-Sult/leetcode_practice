package easy;

public class RemoveDuplicatesFromSortedList {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {
      }
      ListNode(int val) {
          this.val = val;
      }
      ListNode(int val, ListNode next) {
          this.val = val; this.next = next;
      }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode rsl = head;
        while (head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return rsl;
    }

}