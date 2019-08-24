public class Practice01MathIterative implements Practice01Math {

    public int fact(int n) throws Exception {
        if(n < 0) {
            throw new Exception();
        } else {
            int fact = 1;
            for(int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
        // return 0;
    }

    public int fib(int n) throws Exception {
        int first = 0;
        int second = 1;
        int fibo = 0;

        if(n < 0) {
            throw new Exception();
        } else {
            if(n == 0 || n == 1) {
                return n;
            } else {
                for(int i = 1; i < n; i++) {
                    fibo = first + second;
                    first = second;
                    second = fibo;
                }
                return fibo;
            }
        }
        // return 0;
    }
}