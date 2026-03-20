public class Task9 {
    public static void main(String[] args){
        int i = 0;
        String s = "qwertyy" ;
        System.out.println(length(s,i));
    }
        public static int length (String s , int i) {
            if (i == s.length()) {
                return 0;
            }

            return 1 + length(s, i + 1);
        }















}
















