package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MethodApps m = new MethodApps();
        System.out.print("n = ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for ( int i = 0; i < n; i++ ) {
            System.out.print("index " + i + ": ");
            int input = scan.nextInt();
            arr[i] = input;
        }
        printArray(arr);
        printArray(m.insertionSort(arr));
    }
    private static void printArray(int[] a) {
        for ( int i : a ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
