import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {3, 1, 2, 4, 5};
        int n = arr.length;
        
        Arrays.sort(arr);
        double median;
        
        if(n % 2 == 1){
            median = arr[n /2];
        }else{
            median = (arr[n/2 - 1] + arr[n/2]) / 2.0;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(median);
    }
}
