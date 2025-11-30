import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		int res = (n*(n + 1))/2;
		
		System.out.println("The sum of n-th traingular no : " + res);
	}
}
