import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		int n = sc.nextInt();
		int fact = 1;
		int sum = 0;
		
		for(int i = n; i > 0; i --){
		    fact *= i;
		}
		
		while(fact != 0){
		    int rem = fact % 10;
		    sum += rem;
		    fact /= 10;
		}
		
		System.out.println(sum);
		
	}
}
