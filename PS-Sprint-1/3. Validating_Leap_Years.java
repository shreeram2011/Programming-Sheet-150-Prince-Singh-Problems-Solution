import java.util.Scanner;

class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int n = sc.nextInt();
        
        System.out.println(((n % 400 ==0) || (n % 4 == 0 && n % 100 != 0)) ? "Leap Year" : "Not a Leap Year.");
        
    }
}
