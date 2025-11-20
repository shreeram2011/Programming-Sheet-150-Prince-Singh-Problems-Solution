import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter word : ");
	    String str = sc.nextLine();
	    String rev = new StringBuilder(str).reverse().toString();
	    
	    System.out.println(rev);
	}
}
