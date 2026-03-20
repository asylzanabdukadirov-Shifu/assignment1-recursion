public class Task2 {
    public static void main(String[] args) {
      int arr[]= {1,3,5,7,9};

    int sum = sum(arr,0) ;
    double avg = sum/ arr.length;
    System.out.println(sum);
    System.out.println(avg);
    }

    public static int sum(int[] arr, int i) {
        if (i == arr.length) {
            return 0;
        }

        return  arr[i] + sum(arr,i+1);
    }
}