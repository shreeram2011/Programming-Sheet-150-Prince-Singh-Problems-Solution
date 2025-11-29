import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		int n = sc.nextInt();
		int digit = String.valueOf(n).length();
		int sum = 0;
		int orignal = n;
		
		
		int temp = n;
		while(temp != 0){
		    int rem = temp % 10;
		    sum += Math.pow(rem, digit);
		    temp /= 10;
		}
		
		
		System.out.print((orignal == sum) ? "Armstrong" : "not armgstrong");
	}
}
