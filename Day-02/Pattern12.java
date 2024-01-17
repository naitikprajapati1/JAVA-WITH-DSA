public class Pattern12 {
    public static void main(String[] args) {
        for (int i = 68; i >= 65; i--) {
            for (int j = 65; j <= i; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println("");
        }
    }
}
