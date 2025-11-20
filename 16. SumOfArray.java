import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    int arr[] = {1, 2 , 3, 4, 5};
	    int sum = 0;
	    
	    for(int i = 0; i < arr.length; i ++){
	        sum += arr[i];
	    }
	    
	    System.out.println(sum);
	}
}

//Best approach using stream

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    int arr[] = {1, 2 , 3, 4, 5};
	    int sum = Arrays.stream(arr).sum();
	    System.out.println(sum);
	}
}



