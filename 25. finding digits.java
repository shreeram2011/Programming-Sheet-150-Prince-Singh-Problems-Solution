import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		int n = sc.nextInt();
		int digits = 0;
		
		while(n != 0){
		    n /= 10;
		    digits ++;
		}
		
		System.out.println(digits);
	}
}
