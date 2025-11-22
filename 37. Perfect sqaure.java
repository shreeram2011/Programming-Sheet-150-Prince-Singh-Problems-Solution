import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int root =(int) Math.sqrt(n);
        
        System.out.println(((root * root) == n) ? "Perfect square" : "Not perfect square");
        
    }
}
