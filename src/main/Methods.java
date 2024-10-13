public class Methods {
    public static int squared(int n) {
        return n * n;
    }
    public static int fibonacci(int n, int n1) {
        int sum = n + n1;
        if ( sum >= 4200 ) {
            return 0;
        } else {
            return (fibonacci(n1, sum));
        }
    }
}
