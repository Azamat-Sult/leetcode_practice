package easy;

public class MergeTwoSortedLists {

    public static class ListNode {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) {
            return null;
        }

        if (list1 == null && list2 != null) {
            return list2;
        }

        if (list1 != null && list2 == null) {
            return list1;
        }

        ListNode result = new ListNode();
        ListNode head = result;

        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    head.next = list1;
                    head = head.next;
                    list1 = list1.next;
                    continue;
                } else {
                    head.next = list2;
                    head = head.next;
                    list2 = list2.next;
                    continue;
                }
            }
            if (list1 != null) {
                head.next = list1;
                head = head.next;
                list1 = list1.next;
                continue;
            }
            if (list2 != null) {
                head.next = list2;
                head = head.next;
                list2 = list2.next;
                continue;
            }
        }

        return result.next;
    }

    public static void main(String[] args) {

        MergeTwoSortedLists mtsl = new MergeTwoSortedLists();

        ListNode node13 = new ListNode(4);
        ListNode node12 = new ListNode(2, node13);
        ListNode node11 = new ListNode(1, node12);

        ListNode node23 = new ListNode(4);
        ListNode node22 = new ListNode(3, node23);
        ListNode node21 = new ListNode(1, node22);

        ListNode result = mtsl.mergeTwoLists(node11, node21);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

}