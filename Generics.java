public class Generics {
    // determines the largest of three comparable objects
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; // assume x is initially the largest

        if (y.compareTo(max) > 0)
            max = y; // y is the largest so far

        if (z.compareTo(max) > 0)
            max = z; // z is the largest

        return max; // return the largest object
    } // end method maximum

    public static void main(String[] args) {
         System.out.printf("Maximum of %d, %d and %d is %d\n\n", 5, 8, 10, maximum(5, 8, 10));

         System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 7.7, 8.8, maximum(6.6, 7.7, 8.8));

         System.out.printf("Maximum of %s, %s and %s is %s\n\n", "Apple", "Banana", "Peach", maximum("Apple", "Banana", "Peach"));
    }

}

