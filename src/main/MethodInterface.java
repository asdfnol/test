package main;
public interface MethodInterface {
    // interfaces might be more helpful in managing the methods
    // idk
    /* remembering the language */
    int[] intToBinary(int n);
    int fibonacci(int n);
    int[] fibSequence(int n);
    double factorial(double n);
    double choose(double n, double k);
    int[][] transpose(int[][] a);
    /* ALGORITHM PRACICE */
    int[] arrayRotation(int[] a, int d);
    int[] selectionSort(int[] initArr);
    int[] insertionSort(int[] initArr);
    // int[] mergeSort(int[] initArr);
    // int[] merge(int[] left, int[] right);
    int sequentialSearch(int[] arr, int x);
    int binarySearch(int[] arr, int x);
    /*
    int[] removeDuplicates(int[] initArr);
    */
}
