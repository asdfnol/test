public class Methods {
    public int squared(int n) {
        return n * n;
    }
    /**
    public int fibonacci(int n, int n1) {
        int sum = n + n1;
        if (
        // fibonacci(0, 1) returns fibonacci(1, 1)
        // fibonacci(1, 1) returns fibonacci(1, 2)
    }
    **/
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
        // factorial(3) returns factorial(3 * factorial(2))
        // factorial(2) returns factorial(2 * factorial(1))
        // factorial(1) returns factorial(1 * factorial(0))
        // factorial(0) returns 1
    }
}
