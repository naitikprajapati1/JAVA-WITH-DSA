
public class Palindrom {
    public static boolean isPalm(int n) {
        int dup = n;
        int revNum = 0;
        while (n > 0) {
            int ld = n % 10;
            n = n / 10;
            revNum = revNum * 10 + ld;
        }
        return revNum == dup ? true : false;
    }

    public static void main(String[] args) {
        boolean out = isPalm(-121);

        System.out.println(out);
    }

}
