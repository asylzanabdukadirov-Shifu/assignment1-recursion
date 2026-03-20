public class Task6 {
    public static void main(String[] args) {
        System.out.println(Pow(2,10));
    }
    public static int Pow(int a , int b ){
        if ( b==1 ){ return a ;}

        return  a*Pow(a,b-1);
    }

}
