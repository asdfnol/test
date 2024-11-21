package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println(a[3]);
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
