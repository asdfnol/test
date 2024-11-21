package main;
import java.util.Arrays;
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
    }
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
    public int[] mergeSort(int[] arr) {
        // base case
        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] arrLeftSide= Arrays.copyOfRange(arr, 0, mid);
        int[] arrRightSide = Arrays.copyOfRange(arr, mid, arr.length);
        // recursively split till arrays are of length 1.
        int[] left = mergeSort(arrLeftSide);
        int[] right = mergeSort(arrRightSide);
        return merge(left, right);
    }
    // two passed arrays must be sorted already,
    // first time it's called, args will be length 1 arrays (sorted obv)
    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0; // for left
        int j = 0; // for right
        int k = 0; // for result
        while ( i < left.length && j < right.length ) {
            if ( left[i] <= right[j] ) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
            // this should get everything if dealing with even, equal length arrays.
        }
        // but for pairs with odd array
        while ( i < left.length ) {
            result[k] = left[i];
            i++; k++;
        }
        while ( j < right.length ) {
            result[k] = right[j];
            j++; k++;
        }
        return result;
    }
    public int sequentialSearch(int[] arr, int x) {
        for ( int i = 0; i < arr.length; i++ ) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    // must be sorted
    public int binarySearch(int[] arr, int x) {
        int left = 0; int right = arr.length - 1;
        while ( left <= right ) {
            int mid = (right + left) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    // removeDuplicates 

}
