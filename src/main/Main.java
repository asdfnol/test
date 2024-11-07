package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MethodApps m = new MethodApps();
        int[] arr = inputArray();
        printArray(arr);
        int[] sortedArr = m.mergeSort(arr);
        printArray(sortedArr);
    }
    private static void printArray(int[] a) {
        for ( int i : a ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    private static int[] inputArray() {
        Scanner scan = new Scanner(System.in);
        System.out.print("length = ");
        int length = scan.nextInt();
        int[] arr = new int[length];
        for ( int i = 0; i < length; i++ ) {
            System.out.print("index " + i + ": ");
            int input = scan.nextInt();
            arr[i] = input;
        }
        return arr;
    }
}
