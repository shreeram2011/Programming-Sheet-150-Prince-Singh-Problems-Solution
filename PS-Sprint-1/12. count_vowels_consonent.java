import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().toLowerCase();
		
		int vowels = 0;
		int consonent = 0;
		
		for(int i = 0; i < str.length(); i ++){
		    int ch = str.charAt(i);
		    
		    if(ch >= 'a' && ch <= 'z'){
		        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
		            vowels ++;
		        }else{
		            consonent++;
		        }
		    }
		}
		
		System.out.println("vowels : " + vowels + " consonent : " + consonent);
		
		
	}
}
