package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Methods m = new Methods();
        int x = 2147483647;
        var b = m.intToBinary(x);
        for ( int e : b ) {
            System.out.print(e + "");
        }
        System.out.println();
    }
}
