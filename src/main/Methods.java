public class Methods {
    public int squared(int n) {
        return n * n;
    }
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
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
}
