import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row : ");
		
		int n = sc.nextInt();
		int matrix [][] = new int [n][n];
		int num = 1;
		
		for(int i = 0; i < n; i ++){
		    for(int j = 0; j < n; j++){
		        matrix[i][j] = num ++;
		    }
		    System.out.println();
		}
		
		for(int i = 0; i < n; i ++){
		    for(int j = 0; j < n; j++){
		        System.out.print(matrix[i][j] + " ");
		    }
		    System.out.println();
		}
		
		
	}
}
