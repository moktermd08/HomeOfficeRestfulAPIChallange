public class Solution {
    /**
     * Finds the lowest common ancestor of the two nodes.
     *
     * @param index1 - The first index.
     * @param index2 - The second index.
     * @return The index of the lowest common ancestor.
     */
    public static int run(int index1, int index2) {
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
