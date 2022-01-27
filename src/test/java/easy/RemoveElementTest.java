package easy;

import org.junit.Assert;
import org.junit.Test;

public class RemoveElementTest {

    @Test
    public void test1() {
        RemoveElement re = new RemoveElement();
        int[] array = new int[] {3, 2, 2, 3};
        int current = re.removeElement(array, 3);
        int expected = 2;
        Assert.assertEquals(expected, current);
        Assert.assertArrayEquals(new int[] {2, 2, 2, 3}, array);
    }

    @Test
    public void test2() {
        RemoveElement re = new RemoveElement();
        int[] array = new int[] {0, 1, 2, 2, 3, 0, 4, 2};
        int current = re.removeElement(array, 2);
        int expected = 5;
        Assert.assertEquals(expected, current);
        Assert.assertArrayEquals(new int[] {0, 1, 4, 0, 3, 0, 4, 2}, array);
    }

}