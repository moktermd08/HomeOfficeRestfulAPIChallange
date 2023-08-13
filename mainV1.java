interface ITree {
    /**
     * Finds the lowest common ancestor of the two nodes in the tree.
     *
     * @return The index of the lowest common ancestor.
     */
    int findCommonAncestor();
}

class BinaryTree implements ITree {
    private final int index1;
    private final int index2;
    private final int INVALID_INDEX = -1;
    
    /**
     * Constructs a binary tree with two node indices.
     *
     * @param index1 - The index of the first node.
     * @param index2 - The index of the second node.
     */
    public BinaryTree(int index1, int index2) {
        this.index1 = index1;
        this.index2 = index2;
    }

    /**
     * Validates a given index.
     *
     * @param index - The node index to be validated.
     * @return True if the index is greater than 0, otherwise False.
     */
    private boolean isValidIndex(int index) {
        return index > 0;
    }

    /**
     * Finds the lowest common ancestor of the two nodes in the binary tree.
     * The method computes the ancestor by continuously dividing the greater index by 2 
     * until both indices match.
     *
     * @return The index of the lowest common ancestor.
     * Returns -1 if either index is invalid.
     */
    @Override
    public int findCommonAncestor() {
        if (!isValidIndex(index1) || !isValidIndex(index2)) {
            return INVALID_INDEX;
        }

        int localIndex1 = index1;
        int localIndex2 = index2;

        while (localIndex1 != localIndex2) {
            if (localIndex1 > localIndex2) {
                localIndex1 /= 2;
            } else {
                localIndex2 /= 2;
            }
        }

        return localIndex1;
    }
}

public class Solution {
    /**
     * Finds the lowest common ancestor of the two nodes using a tree implementation.
     *
     * @param index1 - The first index.
     * @param index2 - The second index.
     * @param tree - An implementation of a tree structure.
     * @return The index of the lowest common ancestor.
     */
    public static int findLowestCommonAncestor(int index1, int index2, ITree tree) {
        return tree.findCommonAncestor();
    }
    
    /**
     * Entry method that uses the BinaryTree implementation to find the lowest common ancestor.
     *
     * @param index1 - The first index.
     * @param index2 - The second index.
     * @return The index of the lowest common ancestor.
     */
    public static int run(int index1, int index2) {
        ITree tree = new BinaryTree(index1, index2);
        return findLowestCommonAncestor(index1, index2, tree);
    }
}
