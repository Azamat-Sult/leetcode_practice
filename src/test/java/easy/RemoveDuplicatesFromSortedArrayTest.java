package easy;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void test1() {
        RemoveDuplicatesFromSortedArray rdfsa = new RemoveDuplicatesFromSortedArray();
        int[] array = new int[] {1, 2, 3};
        int current = rdfsa.removeDuplicates(array);
        int expected = 3;
        Assert.assertEquals(expected, current);
        Assert.assertArrayEquals(new int[] {1, 2, 3}, array);
    }

}