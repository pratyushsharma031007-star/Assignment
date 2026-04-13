import java.util.*;

class program1 {
    static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        int[] factors = new int[count];
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors[j++] = i;
        }
        return factors;
    }

    static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    static long product(int[] arr) {
        long p = 1;
        for (int x : arr) p *= x;
        return p;
    }

    static double sumOfSquares(int[] arr) {
        double s = 0;
        for (int x : arr) s += Math.pow(x, 2);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] factors = getFactors(n);

        System.out.println("Factors:");
        for (int x : factors) System.out.print(x + " ");
        System.out.println();

        System.out.println("Sum = " + sum(factors));
        System.out.println("Product = " + product(factors));
        System.out.println("Sum of Squares = " + sumOfSquares(factors));
    }
}