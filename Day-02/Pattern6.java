public class Pattern6 {
    public static void main(String[] args) {
        for (int i = 97; i <= 101; i++) {
            for (int j = 97; j <= i; j++) {
                System.out.print((char) i + " ");
            }
            System.out.println(" ");
        }
    }
}
