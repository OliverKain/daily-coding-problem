package DCP2_ProductOfArray;

import java.util.*;

public final class Solution {

    /**
     * Return a new array such that each element at index i of the new array is the
     * product of all the numbers in the original array except the one at i.
     * 
     * @param array
     * @return Result array
     */
    private static final int[] productOfArray(int[] array) {
        if (array == null || array.length < 1) {
            return array;
        }
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = product / array[i];
        }
        return array;
    }

    public static final void runSolution(int[] array) {
        System.out.println(Arrays.toString(productOfArray(array)));
    }
}