package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Methods m = new Methods();
        int[] arr = {1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
        for ( int e : arr ) {
            System.out.print(e + " ");
        }
        System.out.println();

        int[] noDupes = m.removeDuplicates(arr);
        for ( int e : noDupes ) {
            System.out.print(e + " ");
        }
        System.out.println();

    }
}
