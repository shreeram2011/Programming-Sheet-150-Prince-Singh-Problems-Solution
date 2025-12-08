import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        
        int matrix [][] = new int[n][n];
        matrix[0][0] = 0;
        
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j ++){
                if (i == 0 && j == 0) continue;
                
                if(j > 0){
                    matrix[i][j] = (matrix[i][j - 1]==0) ? 1 : 0;
                }else{
                    matrix[i][j] = (matrix[i - 1][n - 1] == 0) ? 1 : 0;
                }
            }
        }
        
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j ++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
