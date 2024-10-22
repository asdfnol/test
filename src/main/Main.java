package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Methods m = new Methods();
        var a = m.pascalArray(15);
        for ( int e : a ) {
            System.out.print(e + " ");
        }
        System.out.println(m.choose(13, 1));

        // Scanner scan = new Scanner(System.in);

        /*
        System.out.print("n = ");
        int n = scan.nextInt();

        int s = 1;
        for ( int i = 0; i < n; i++ ) {
            int[] arr = m.pascalArray(i);
            for ( int x = 0; x < n - s; x ++ ) {
                System.out.print("  ");
            }
            for ( int e : arr ) {
                System.out.print(e + "   ");
            }
            System.out.println();
            s++;
        }
        */
    }
}
