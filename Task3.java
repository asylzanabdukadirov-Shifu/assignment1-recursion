public class Task3 {
    public static void main(String[] args) {
      System.out.println(Isprime(19,18));
    }
    public static boolean Isprime(int a , int b ){
        if ( b==1 ){ return true ;}
        if (a%b == 0 ){ return false ;}

    return  Isprime(a,b-1);
    }
}