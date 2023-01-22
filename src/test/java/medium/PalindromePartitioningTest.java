package medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePartitioningTest {

    @Test
    void test1() {

        var str = "cbbbcc";
        var expected = List.of(
                List.of("c","b","b","b","c","c"),
                List.of("c","b","b","b","cc"),
                List.of("c","b","bb","c","c"),
                List.of("c","b","bb","cc"),
                List.of("c","bb","b","c","c"),
                List.of("c","bb","b","cc"),
                List.of("c","bbb","c","c"),
                List.of("c","bbb","cc"),
                List.of("cbbbc","c")
        );

        var solution = new PalindromePartitioning();
        assertEquals(expected, solution.partition(str));

    }

}