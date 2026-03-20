public class Task10 {
 public static void main(String[] args){
     int a = 25;
     int b = 12;
     System.out.println(GCD(a,b));
 }
public static int GCD(int a , int b) {
    if (b == 0) {
        return a;
    }
    return GCD(b, a % b);

}
}
