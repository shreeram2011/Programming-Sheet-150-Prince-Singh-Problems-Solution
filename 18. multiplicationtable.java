import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Etner num : ");
	    
	    int n = sc.nextInt();
	    
	    for(int i = 1; i <= 5; i ++){
	        int ans = n * i;
	        System.out.println(n + " x " + i + " = " + ans);
	    }
	}
}


