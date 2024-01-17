public class Divisors {
    public static void checkAllDivisors(int n) {
        for (int i = 1; i <= (int) (Math.sqrt(n)); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if ((n / i) != i) {
                    System.out.print(n / i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        checkAllDivisors(36);
    }
}
