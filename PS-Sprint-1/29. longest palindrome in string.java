import java.util.*;

public class Main{
    public static String expand(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left --;
            right ++;
        }
        return s.substring(left + 1, right);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        int maxlen = 0;
        
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i ++){
            String odd = expand(s, i, i);
            String even = expand(s, i, i);
            
            if(odd.length() > maxlen){
                maxlen = odd.length();
                list.clear();
                list.add(odd);
            }else if(odd.length() == maxlen){
                if(!list.contains(odd)){
                    list.add(odd);
                }
            }
            
            if(even.length() > maxlen){
                maxlen = even.length();
                list.clear();
                list.add(even);
            }else if(even.length() == maxlen){
                if(!list.contains(even)){
                    list.add(even);
                }
            }
            
        }
        
        System.out.println("Largest Palindrome : ");
        for(String p : list){
            System.out.println(p);
        }
    }
}
