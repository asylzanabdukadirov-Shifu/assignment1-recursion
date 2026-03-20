public class Task5 {
    public static void main(String[] args) {
        System.out.println(fibo(40));
    }
    public static int fibo(int a  ){
        if (a<1 ){ return 0;}
        if (a==1 ){ return 1;}

        return  fibo(a-2)+fibo(a-1);
    }
}

