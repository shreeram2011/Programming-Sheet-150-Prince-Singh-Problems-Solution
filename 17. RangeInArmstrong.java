import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Etner num : ");
	    int start = sc.nextInt();
	    
	    int end = sc.nextInt();
	    
	    for(int n = start; n <= end; n ++){
	        int sum = 0;
    	    int digit = 0;
    	    
    	    int original = n;
    	    
    	    int temp = n;
    	    while(temp != 0){
    	        temp /= 10;
    	        digit ++;
    	    }
    	    
    	    
    	    temp = n;
    	    while(temp != 0){
    	        int rem = temp % 10;
    	        sum += Math.pow(rem, digit);
    	        temp /= 10;
    	    }
    	    if(sum == original){
                System.out.print(original + " ");
            }
    	    
	    }
	    
	}
}


