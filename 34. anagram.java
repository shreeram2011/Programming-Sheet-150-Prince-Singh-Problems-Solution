import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string 1 : ");
		String s1 = sc.nextLine().toLowerCase().replaceAll("\\s","");
		System.out.print("Enter string 2 : ");
		String s2 = sc.nextLine().toLowerCase().replaceAll("\\s","");
		
		if(s1.length() != s2.length()) System.out.println("Not anagram");
		
		char a[] = s1.toCharArray();
		char b[] = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		System.out.println((Arrays.equals(a, b)) ? "Anagram" : "Not anagram");
	}
}
