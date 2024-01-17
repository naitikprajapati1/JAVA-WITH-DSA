public class PrimeNumber {
    public static boolean checkPrimeNumber(int n) {
        for (int i = 2; i < (int) (Math.sqrt(n)); i++) {
            if (n % i != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        if (checkPrimeNumber(23)) {
            System.out.println("it's  prime number");

        } else {

            System.out.println("it's not prime number");
        }
    }
}
