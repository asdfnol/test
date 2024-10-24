package main;
import java.util.Scanner;
public class Patterns {
    public static void trianglePalindrome(int n) {
        int spaces = (n - 1) * 2;
        for ( int i = 1; i <= n; i++ ) {
            for ( int s = 0; s < spaces; s++ ) {
                System.out.print(" ");
            }
            int length = i + (i - 1);
            int placeholder = 0;
            for ( int j = i; j <= length; j++ ) {
                System.out.print(j + " ");
                placeholder = j;
            }
            int remain = length - i;
            for ( int j = 0; j < remain; j++ ) {
                placeholder--;
                System.out.print(placeholder + " ");
            }
            spaces -= 2;
            System.out.println();
        }
    }
    public static void squareHollow() {
    }
}
