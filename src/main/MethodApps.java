package main;
public class MethodApps implements MethodInterface {
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
    
    /* ALGORITHM PRACTICE */
    /* i'm doing all of this on my own */
    /* no google, just.. a prompt ya know, i gotta know what i wanna do */

    public int[] selectionSort(int[] initArr) {
        int[] arr = initArr; 
        // big boi loop
        for ( int i = 0; i < arr.length; i++ ) {
            int smallest = Integer.MAX_VALUE;
            int indexOfSmallest = -1;
            // find smallest 
            for ( int j = i; j < arr.length; j++ ) {
                if (arr[j] < smallest) {
                    smallest = arr[j];
                    indexOfSmallest = j;
                }
            }
            // and swap
            int temp = arr[i];
            arr[i] = arr[indexOfSmallest];
            arr[indexOfSmallest] = temp;
        }
        return arr;
    } // okay that was first try.

    // while loops are my best friend now :D.
    public int[] insertionSort(int[] initArr) {
        int[] arr = initArr;
        for ( int i = 1; i < arr.length; i++ ) {
            int x = arr[i];
            int j = i;
            while ( j > 0 && arr[j - 1] > arr[j] ) {
                arr[j] = arr[j - 1];
                arr[j - 1] = x;
                j--;
            }
        }
        return arr;
    }
    
    // merge sort
    // sequential search
    // binary search
    // removeDuplicates 

}
