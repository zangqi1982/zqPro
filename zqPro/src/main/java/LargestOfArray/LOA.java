package LargestOfArray;

public class LOA {


//    static int[] array = {1, 2, 3, 4, 5, 4, 3, 2, -1};
//    static int[] array = { -1};
    static int[] array = { };

    // input is null
    // input is empty
    // input is ....
    //

    public static void main(String[] Args) {
        int result = findLargestValue();
        System.out.println(result);
    }

    /**
     * return largest value or
     * return index of largest value
     * <p>
     * same value return first return last, random return all?
     *
     * empty ??
     */
    public static int findLargestValue(int[] input) {
        int largestValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (largestValue < array[i]) {
                largestValue = array[i];
            }
        }
        return largestValue;
    }



    /**
     * return index of largest value, if same return last largest value's index
     * <p>
     * when empty array return null, when array is null, return null
     */
}

