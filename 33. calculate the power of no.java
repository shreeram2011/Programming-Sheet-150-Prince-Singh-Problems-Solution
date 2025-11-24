import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("base : ");
		int base = sc.nextInt();
		System.out.print("exponent : ");
		int exponent = sc.nextInt();
		
		int ans = 1;
		
		for(int i = 1; i <= exponent; i ++){
		    ans *= base;
		}
		
		System.out.println(ans);
	}
}
