import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String comp ="";
		
		for(int i = str.length() - 1; i >= 0; i --){
		    comp += str.charAt(i);
		}
		System.out.println((comp.equalsIgnoreCase(str)) ? "palindrome" : "not palindrome");
	}
}
