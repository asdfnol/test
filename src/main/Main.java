package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Patterns p = new Patterns();
        System.out.print("rows: ");
        int n = scan.nextInt();
        p.numberTriangle(n);
    }
}
