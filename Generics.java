public class Generics {
    // determines the largest of three comparable integers
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; // assume x is initially the largest

        if (y.compareTo(max) > 0)
            max = y; // y is the largest so far

        if (z.compareTo(max) > 0)
            max = z; // z is the largest

        return max; // return the largest integer
    } // end method maximum

    public static void main(String[] args) {
        System.out.printf("Maximum of %d, %d and %d is %d\n\n", 5, 8, 10, maximum(5, 8, 10));
    }

}

