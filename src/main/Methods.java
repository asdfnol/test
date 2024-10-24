package main;
public class Methods {
    public int[] intToBinary(int n) {
        int[] t = new int[32];
        for ( int i = 0; i < t.length; i++ ) {
           t[i] = n % 2;
           n = n / 2;
        }
        int[] b = new int[t.length];
        int j = 0;
        for ( int i = t.length - 1; i >= 0; i-- ) {
           b[j] = t[i];
           j++;
        }
        return b;
    }
    // returns nth nubmer in fibonacci sequence
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    // returns first n numbers in fibonacci sequence
    public int[] fibSequence(int n) {
        int[] x = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            x[i] = fibonacci(i);
        }
        return x;
    }
    
    public double factorial(double n) {
        if (n == 0.0) {
            return 1.0;
        }
        return n * factorial(n - 1.0);
    }
    public double choose(double n, double k) {
        double num = factorial(n);
        double den = factorial(k) * factorial(n - k);
        double combination = num / den;
        return combination;
    }
    public int[][] transpose(int[][] a) {
        int[][] b = new int[a.length][a[0].length];
        for ( int i = 0; i < a.length; i++ ) {
            for ( int j = 0; j < a[i].length; j++ ) {
                b[j][i] = a[i][j];
            }
        }
        return b;
    }
    public int[] arrayRotation(int[] a, int d) {
        int[] b = new int[a.length];
        int otherIndex = 0;
        for ( int i = d; i < a.length; i++ ) {
            b[otherIndex] = a[i];
            otherIndex++; 
        }
        otherIndex = a.length - d;
        for ( int j = 0; j < d; j++ ) {
            b[otherIndex] = a[j];
            otherIndex++;
        }

        return b;
        /*
         * [0, 1, 2, 3, 4]
         * [3, 4, 0, 1, 2]
         * d = 3
         *
         * smaller array part2 containing 0 -> d, will be pushed forward.
         * smaller array part1 continaing d -> a.length, will be pushed back.
         * b[0] -> part1
         *
         */
    }
    // given that initArr is sorted.
    public int[] removeDuplicates(int[] initArr) {
        int length = initArr.length;
        // for each iteration in given array:
        //     if an element is repeated after initial element, length - 1
        for ( int i = 0; i < initArr.length; i++ ) {
            for ( int j = i + 1; j < initArr.length - 1; j++ ) {
                if ( initArr[i] == initArr[j] ) {
                    length -= 1;
                } 
            }
        }
        int[] arr = new int[length];
        return arr; 
        // my brain doesn't work like this anymore.
        // i need iterative tracing built into my brain again.
    }
}
