package easy;

import org.junit.Assert;
import org.junit.Test;


public class RemoveDuplicatesFromSortedListTest {

    @Test
    public void test1() {

        RemoveDuplicatesFromSortedList.ListNode node3 = new RemoveDuplicatesFromSortedList.ListNode(2);
        RemoveDuplicatesFromSortedList.ListNode node2 = new RemoveDuplicatesFromSortedList.ListNode(1, node3);
        RemoveDuplicatesFromSortedList.ListNode node1 = new RemoveDuplicatesFromSortedList.ListNode(1, node2);
        RemoveDuplicatesFromSortedList rdfsl = new RemoveDuplicatesFromSortedList();
        RemoveDuplicatesFromSortedList.ListNode rsl = rdfsl.deleteDuplicates(node1);
        Assert.assertEquals(1, rsl.val);
        Assert.assertEquals(2, rsl.next.val);

    }

    @Test
    public void test2() {

        RemoveDuplicatesFromSortedList.ListNode node5 = new RemoveDuplicatesFromSortedList.ListNode(3);
        RemoveDuplicatesFromSortedList.ListNode node4 = new RemoveDuplicatesFromSortedList.ListNode(3, node5);
        RemoveDuplicatesFromSortedList.ListNode node3 = new RemoveDuplicatesFromSortedList.ListNode(2, node4);
        RemoveDuplicatesFromSortedList.ListNode node2 = new RemoveDuplicatesFromSortedList.ListNode(1, node3);
        RemoveDuplicatesFromSortedList.ListNode node1 = new RemoveDuplicatesFromSortedList.ListNode(1, node2);
        RemoveDuplicatesFromSortedList rdfsl = new RemoveDuplicatesFromSortedList();
        RemoveDuplicatesFromSortedList.ListNode rsl = rdfsl.deleteDuplicates(node1);
        Assert.assertEquals(1, rsl.val);
        Assert.assertEquals(2, rsl.next.val);
        Assert.assertEquals(3, rsl.next.next.val);

    }
}