class BinaryTree {
    
    private int index1;
    private int index2;

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
     * Ensures that both indices are valid.
     *
     * @return True if both indices are greater than 0, otherwise False.
     */
    private boolean validateIndices() {
        return index1 > 0 && index2 > 0;
    }

    /**
     * Finds the lowest common ancestor of the two nodes in the binary tree.
     *
     * @return The index of the lowest common ancestor.
     * Returns -1 if indices are invalid.
     */
    public int findCommonAncestor() {
        if (!validateIndices()) {
            return -1;
        }

        while (index1 != index2) {
            if (index1 > index2) {
                index1 /= 2;
            } else {
                index2 /= 2;
            }
        }
        return index1;
    }
}

public class Solution {
    /**
     * Finds the lowest common ancestor of the two nodes using the BinaryTree class.
     *
     * @param index1 - The first index.
     * @param index2 - The second index.
     * @return The index of the lowest common ancestor.
     */
    public static int run(int index1, int index2) {
        BinaryTree tree = new BinaryTree(index1, index2);
        return tree.findCommonAncestor();
    }
}
