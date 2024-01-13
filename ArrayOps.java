public class ArrayOps {
    public static void main(String[] args) {
        int[] arrTest1 = { 1, 2, 1, 1, 2 };
        int[] arrTest2 = { 5, 5, 3, 3, 2};
        System.out.println(secondMaxValue(arrTest2));
    }

    public static int findMissingInt(int[] array) {
        // Write your code here:
        int missingInt;
        boolean checker = false;

        for (int i = 0; i < array.length + 1; i++) {
            checker = false;
            for (int j = 0; j < array.length; j++) {
                if (i == array[j]) {
                    checker = true;
                }

            }
            if (checker == false) {
                return i;
            }

        }

        return -1;
    }

    public static int secondMaxValue(int[] array) {
        // Write your code here:
        int secondMax = 0;
        int Max = 0;

        for (int index = 0; index < array.length; index++) {
            Max = Math.max(Max, array[index]);
        }

        for (int index = 0; index < array.length; index++) {

            if (array[index] != Max) {
                secondMax = Math.max(secondMax, array[index]);
            }

        }

        return secondMax;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        // Write your code here:
        boolean contains = false;

        for (int i = 0; i < array1.length; i++) {
            contains = false;
            for (int j = 0; j < array2.length; j++) {

                if (array1[i] == array2[j]) {
                    contains = true;
                }

            }

            if (contains == false) {
                return false;
            }

        }

        return true;
    }

    public static boolean isSorted(int[] array) {
        // Write your code here:
        boolean increase = false;
        boolean decrease = false;
        int index = 0;

        if (array[0] <= array[1]) {
            increase = true;
        } else {
            decrease = true;
        }

        while (((increase && array[index] <= array[index+1])||((decrease && array[index] >= array[index+1])))&& (index != array.length-2)) {
            index ++;

            if ( (increase&&(array[index] > array[index +1])) || (decrease&&(array[index] < array[index +1]))) {
                return false;
            }
        }

        return true;
    }

}
