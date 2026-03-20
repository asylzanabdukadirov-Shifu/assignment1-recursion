public class Task1 {
    public static void main(String[] args) {
        printDigits(1234);
    }

    public static void printDigits(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        }

        printDigits(n / 10);
        System.out.println("right now n is equal to " + n);
        System.out.println(n % 10);
    }
}