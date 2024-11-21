package main;
public interface MethodInterface {
    // i dont think interfaces really helps me in this.
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
    int[] mergeSort(int[] initArr);
    int sequentialSearch(int[] arr, int x);
    int binarySearch(int[] arr, int x);
    /*
    int[] removeDuplicates(int[] initArr);
    */
}
