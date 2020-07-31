package DCP1_SumOfTwo;

import java.util.*;

public final class Solution {

    /**
     * Check whether the input array contains any two numbers add up to the input
     * sum.
     * 
     * @param array
     * @param sum
     * @return True/False
     */
    private static final boolean checkSum(int[] array, int sum) {
        if (array == null || array.length < 1) {
            return false;
        }
        HashSet<Integer> tempSet = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            int tempElem = sum - array[i];
            if (tempSet.contains(tempElem)) {
                return true;
            } else {
                tempSet.add(array[i]);
            }
        }
        return false;
    }

    /**
     * Display any two numbers in the input array which add up to the input sum.
     * 
     * @param array
     * @param sum
     * @return True/False
     */
    private static final List<Integer[]> listNumbers(int[] array, int sum) {
        if (array == null || array.length < 1) {
            return null;
        }
        // HashSet<Integer> tempSet = new HashSet<>();
        Map<Integer, Integer> tempMap = new HashMap<>();
        List<Integer[]> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int tempElem = sum - array[i];
            if (tempMap.containsKey(tempElem)) {
                result.add(new Integer[] { i, tempMap.get(tempElem) });
            } else {
                tempMap.put(array[i], i);
            }
        }
        return result;
    }

    public static final void runSolution(int[] array, int sum) {
        // Check only
        if (!checkSum(array, sum)) {
            System.out.println("Does not contain");
        } else {
            System.out.println("Does contain");
            // List indexes of matched items
            System.out.println("List indices");
            for (Integer[] result : listNumbers(array, sum)) {
                System.out.println(Arrays.toString(result));
            }
            // List all matched items
            System.out.println("List numbers");
            Integer[] item = new Integer[2];
            for (Integer[] result : listNumbers(array, sum)) {
                item[0] = array[result[0]];
                item[1] = array[result[1]];
                System.out.println(Arrays.toString(item));
            }
        }
    }
}