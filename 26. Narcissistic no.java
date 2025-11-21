import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		int n = sc.nextInt();
		int digits = 0;
		int sum = 0;
		int original = n;
		
		int temp = n;
		
		while(temp != 0){
		    temp /= 10;
		    digits ++;
		}
		
		temp = n;
		while(temp != 0){
		    int rem = temp % 10;
		    sum += Math.pow(rem, digits);
		    temp /= 10;
		}
		
		System.out.println((original == sum) ? "Narcissistic no." : "not a Narcissistic no.");
	}
}
