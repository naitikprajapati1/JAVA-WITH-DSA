public class Armstrong {
    public static boolean armstrongNumber(int number) {
        int temp = number;
        int tempNumber = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        int sumPower = 0;
        while (number != 0) {
            int digit = number % 10;
            sumPower += Math.pow(digit, count);
            number /= 10;
        }
        return (sumPower == tempNumber);
    }

    public static void main(String[] args) {
        if (armstrongNumber(1634)) {
            System.out.println("It\'s a Armstrong Number");
        } else {
            System.out.println("It's not a Armstrong Number");
        }
    }
}
