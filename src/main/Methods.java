package main;
public class Methods {
    public int[] intToBinary(int n) {
        int[] t = new int[32];
        for ( int i = 0; i < t.length; i++ ) {
           t[i] = n % 2;
           n = n / 2;
        }
        int[] b = new int[t.length];
        int j = 0;
        for ( int i = t.length - 1; i >= 0; i-- ) {
           b[j] = t[i];
           j++;
        }
        return b;
    }
    // returns nth nubmer in fibonacci sequence
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    // returns first n numbers in fibonacci sequence
    public int[] fibSequence(int n) {
        int[] x = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            x[i] = fibonacci(i);
        }
        return x;
    }
    public double factorial(double n) {
        if (n == 0.0) {
            return 1.0;
        }
        return n * factorial(n - 1.0);
    }
    public double choose(double n, double k) {
        double num = factorial(n);
        double den = factorial(k) * factorial(n - k);
        double combination = num / den;
        return combination;
    }
}
