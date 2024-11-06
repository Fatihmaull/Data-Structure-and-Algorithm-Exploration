public class FibonacciFatihLoop {
    public static void main(String[] args) {
        int n = 10;
        int fib1 = 1, fib2 = 2, sum;
        int totalSum = fib1 + fib2;
        System.out.println("Deret Fibonacci: ");
        System.out.print(fib1 + ", " + fib2);
        for (int i = 3; i <= n; i++) {
            sum = fib1 + fib2;
            System.out.print(", " + sum);
            totalSum += sum;
            fib1 = fib2;
            fib2 = sum;
        }
        System.out.println("\nJumlah 10 bilangan pertama Fibonacci: " + totalSum);
    }
}
