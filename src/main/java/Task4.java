public class Task4 {
    public static void main(String[] args) {
        System.out.println(factor(5));
    }
    public static int factor(int a  ){
        if (a==1 ){ return 1;}


        return  a*factor(a-1);
    }
}