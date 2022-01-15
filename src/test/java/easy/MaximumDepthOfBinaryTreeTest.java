package easy;

import org.junit.Assert;
import org.junit.Test;

public class MaximumDepthOfBinaryTreeTest {

    @Test
    public void maxDepth1() {
        MaximumDepthOfBinaryTree.TreeNode treeNode7 =
                new MaximumDepthOfBinaryTree.TreeNode(7, null, null);
        MaximumDepthOfBinaryTree.TreeNode treeNode15 =
                new MaximumDepthOfBinaryTree.TreeNode(15, null, null);
        MaximumDepthOfBinaryTree.TreeNode treeNode20 =
                new MaximumDepthOfBinaryTree.TreeNode(20, treeNode15, treeNode7);
        MaximumDepthOfBinaryTree.TreeNode treeNode9 =
                new MaximumDepthOfBinaryTree.TreeNode(9, null, null);
        MaximumDepthOfBinaryTree.TreeNode treeNode3 =
                new MaximumDepthOfBinaryTree.TreeNode(3, treeNode9, treeNode20);

        int current = new MaximumDepthOfBinaryTree().maxDepth(treeNode3);
        int expected = 3;
        Assert.assertEquals(expected, current);
    }

    @Test
    public void maxDepth2() {
        MaximumDepthOfBinaryTree.TreeNode treeNode2 =
                new MaximumDepthOfBinaryTree.TreeNode(2, null, null);
        MaximumDepthOfBinaryTree.TreeNode treeNode1 =
                new MaximumDepthOfBinaryTree.TreeNode(1, null, treeNode2);

        int current = new MaximumDepthOfBinaryTree().maxDepth(treeNode1);
        int expected = 2;
        Assert.assertEquals(expected, current);
    }

    @Test
    public void maxDepth3() {

        int current = new MaximumDepthOfBinaryTree().maxDepth(null);
        int expected = 0;
        Assert.assertEquals(expected, current);
    }

    @Test
    public void maxDepth4() {

        MaximumDepthOfBinaryTree.TreeNode treeNode0 =
                new MaximumDepthOfBinaryTree.TreeNode(0, null, null);

        int current = new MaximumDepthOfBinaryTree().maxDepth(treeNode0);
        int expected = 1;
        Assert.assertEquals(expected, current);
    }
}