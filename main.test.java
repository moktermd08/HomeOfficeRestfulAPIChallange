import org.junit.Assert;
import org.junit.Test;

public class Solution_Test {

    /**
     * Tests the functionality of the run method to find the lowest common ancestor.
     */
    @Test
    public void testCommonAncestor() {
        Assert.assertEquals(3, Solution.run(13, 15));
        Assert.assertEquals(1, Solution.run(11, 13));
        Assert.assertEquals(5, Solution.run(10, 11));
        Assert.assertEquals(25, Solution.run(25, 100));  // The test case
        Assert.assertEquals(-1, Solution.run(-1, 15));   // Testing invalid index
        Assert.assertEquals(-1, Solution.run(0, 15));    // Testing 0 as an index
    }
}
