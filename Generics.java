public class Generics {
    // determines the largest of three comparable float values
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; // assume x is initially the largest

        if (y.compareTo(max) > 0)
            max = y; // y is the largest so far

        if (z.compareTo(max) > 0)
            max = z; // z is the largest

        return max; // return the largest float value
    } // end method maximum

    public static void main(String[] args) {
        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 7.7, 8.8, maximum(6.6, 7.7, 8.8));
    }

}

