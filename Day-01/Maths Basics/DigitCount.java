public class DigitCount {
    public static void main(String[] args) {
        int n = 813;
        int counter = 0;
        while (n > 0) {
            n = n / 10;
            counter++;
        }
        System.out.println("Number of Digit's Are " + counter);
    }
}