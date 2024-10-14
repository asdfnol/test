import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Methods m = new Methods();
        System.out.print("return an int greater than or equal to 0\nn: ");
        int n = s.nextInt(); 
        int[] a = m.fibSequence(n);
        for ( int x : a ) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
