package sberfight;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class PipesTest {

    @Test
    public void test1() {
        List<String> input = List.of("0-0-0-0",
                                     "1-1-1-0",
                                     "0-0-1-0",
                                     "0-0-1-0");
        Assert.assertEquals(92, Pipes.getResult(input));
    }

}