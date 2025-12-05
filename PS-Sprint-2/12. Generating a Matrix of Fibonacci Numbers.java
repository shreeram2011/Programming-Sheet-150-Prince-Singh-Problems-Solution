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
		
		int arr[][] = new int[n][n];
		int s = 1;
		for(int i = 0; i < n; i ++){
		    for(int j = 0; j < n; j ++){
		        arr[i][j] = fib(s ++);
		        System.out.print(arr[i][j] + " ");
		    }
		    System.out.println();
		}
	}
}
