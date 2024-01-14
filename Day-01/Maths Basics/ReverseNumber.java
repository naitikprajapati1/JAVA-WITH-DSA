import java.util.Scanner;

public class ReverseNumber {
    public static int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }
        long reverse = 0;
        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        if (reverse > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) (isNegative ? -reverse : reverse);
    }

    public static void main(String[] args) {

        // give input
        System.out.println("Enter a number for reverse :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Digits : " + n);
        int reverseNum = reverse(n);
        System.out.println("Reverse : " + reverseNum);

        // close scanner object
        sc.close();
    }
}
