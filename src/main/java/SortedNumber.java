package homework10;

import java.util.Arrays;

public class SortedNumber {
    public static void main(String[] args) {
        String[] myArr = {"1, 2, 0", "4, 5"};
        System.out.println(toSortIntArray(myArr));

    }
    private static String toSortIntArray(String[] myArr) {
        int[] ints = Arrays.stream(myArr)
                .map(arr -> arr.split(","))
                .flatMapToInt(arr -> Arrays.stream(arr).mapToInt(i -> Integer.parseInt(i.strip())))
                .sorted()
                .toArray();
        return Arrays.toString(ints);
    }

}
