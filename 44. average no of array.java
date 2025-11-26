import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = {1, 2, 3, 4, 5};
		int n = arr.length;
	    int sum = 0;
	    
	    for(int i = 0; i < n; i ++){
	        sum += arr[i];
	    }
	    
	    double average = (double) sum / n;
	    
	    System.out.print("Average : " + average);
	}
}
