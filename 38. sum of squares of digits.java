import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		
		int n = sc.nextInt();
		int sum = 0;
		int temp = n;
		while(temp != 0){
		    int rem = temp % 10;
		    sum += Math.pow(rem, 2);
		    temp /= 10;
		}
		System.out.print("Sum of squares of digits : " + sum);
	}
}
