import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        String n = sc.next();
        System.out.println("Enter a digit : ");
        char digit = sc.next().charAt(0);
        
        int count = 0;
        
        for(int i = 0; i < n.length(); i ++){
            if(digit == n.charAt(i)){
                count ++;
            }
        }
        
        System.out.print(count);
    }
}
