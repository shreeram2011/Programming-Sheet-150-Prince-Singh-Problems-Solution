import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nth_no = 0;
		
		for(int i = 1; i <= n; i ++){
		    nth_no += i;
		}
		
		System.out.println("Nth Triangular NO : " + nth_no);
	}
}
