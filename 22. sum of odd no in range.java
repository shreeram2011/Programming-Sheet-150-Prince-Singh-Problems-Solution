import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		int sum = 0;
		for(int i = start; i <= end; i ++){
		    if(i % 2 != 0){
		        sum += i;
		    }
		}
		System.out.println(sum);
	}
}


