import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    int arr[] = {4, 7, 1, 8, 5};
	    int lowest = arr[0];
	    int greatest = arr[0];
	    
	    for(int i = 1; i < arr.length; i ++){
	        if(arr[i] < lowest){
	            lowest = arr[i];
	        }
	        if(arr[i] > greatest){
	            greatest = arr[i];
	        }
	        
	    }
	    
	    System.out.println("lowest : " + lowest + " greatest : " + greatest);
	}
}
