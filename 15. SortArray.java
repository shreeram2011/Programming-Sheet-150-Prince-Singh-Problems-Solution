import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    int arr[] = {3, 1, 4, 1, 5, 9};
	    
	    for(int i = 0; i < arr.length; i ++){
	        int minindex = i;
	        
	        for(int j = i + 1; j < arr.length; j ++){
	            if(arr[j] < arr[minindex]){
	                minindex = j;
	            }
	        }
	        
	        int temp = arr[minindex];
	        arr[minindex] = arr[i];
	        arr[i] = temp;
	    }
	    
	    System.out.println(Arrays.toString(arr));
	}
}


//best approach inbuilt mehtod
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    int arr[] = {3, 1, 4, 1, 5, 9};
	    
	    Arrays.sort(arr);
	    System.out.println(Arrays.toString(arr));
	}
}


