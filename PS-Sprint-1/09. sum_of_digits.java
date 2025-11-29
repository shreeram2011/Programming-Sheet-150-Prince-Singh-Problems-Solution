import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int sum = 0;
		
	
		for(int temp = n; temp > 0; temp /= 10){
		    sum += temp % 10;
		}
		
		System.out.println(sum);
	}
}

