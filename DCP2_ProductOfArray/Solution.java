package DCP2_ProductOfArray;

import java.util.*;

public final class Solution {

    /**
     * Solution: Find the product of all elements in the original array, then iterate
     * over the original array, divide the product by the element at index i.
     * 
     * @param array
     * @return Result array
     */
    private static final int[] productOfArray1(int[] array) {
        if (array == null || array.length < 1) {
            return array;
        }
        int arrLength = array.length;
        int[] returnArr = new int[arrLength];
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        for (int i = 0; i < array.length; i++) {
            returnArr[i] = product / array[i];
        }
        return returnArr;
    }

    /**
     * Solution: Iterate over the original array N times, multiplying each element
     * in the result array (except the i-th one) by the i-th element of the original
     * array
     * 
     * @param array
     * @return Result array
     */
    private static final int[] productOfArray2(int[] array) {
        if (array == null || array.length < 1) {
            return array;
        }
        int arrLength = array.length;
        int[] returnArr = new int[arrLength];
        Arrays.fill(returnArr, 1);
        for (int i = 0; i < arrLength; i++) {
            for (int j = 0; j < arrLength; j++) {
                if (i == j) {
                    continue;
                }
                returnArr[j] *= array[i];
            }
        }
        return returnArr;
    }

    public static final void runSolution(int[] array) {
        System.out.println(Arrays.toString(productOfArray1(array)));
        System.out.println(Arrays.toString(productOfArray2(array)));
    }
}