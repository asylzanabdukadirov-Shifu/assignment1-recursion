public class Task8 {
    public static void main(String[] args) {
        String s = "123456";

        if (check(s, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean check(String s, int i) {
        if (i == s.length()) {
            return true;
        }

        if (!Character.isDigit(s.charAt(i))) {
            return false;
        }

        return check(s, i + 1);
    }
}