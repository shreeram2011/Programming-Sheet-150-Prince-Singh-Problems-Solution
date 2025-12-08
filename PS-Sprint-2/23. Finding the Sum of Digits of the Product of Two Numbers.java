import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1st no : ");
        int n = sc.nextInt();
        System.out.print("Enter 2nd no : ");
        int s = sc.nextInt();
        int product = n * s;
        int sum = 0;
        
        while(product != 0){
            sum += product % 10;
            product /= 10;
        }
        System.out.print("Sum of two proucts of numbers : " +);
    }
}
