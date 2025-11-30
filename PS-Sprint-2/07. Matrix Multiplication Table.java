import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int [][] arr = new int[size][size];
		
		for(int i = 0; i < size; i ++){
		    for(int j = 0; j < size; j ++){
		        arr[i][j] = (i + 1) * (j + 1);
		    }
		}
		
		for(int i = 0; i < size; i ++){
		    for(int j = 0; j < size; j ++){
		        System.out.print(arr[i][j] + " ");
		    }
		    System.out.println();
		}
	}
}

