import java.util.*;
public class Main
{
    public static int fib(int n){
        int a = 0;
        int b = 1;
        
        for(int i = 0; i < n; i ++){
            int next = a + b;
            a = b;
            b = next;
        }
        return a;
        
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size : ");
		int n = sc.nextInt();
		
		int size = n * n;
		
		int arr[] = new int[size];
		
		for(int i = 0; i < size; i ++){
		    arr[i] = fib(i + 1);
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
}
