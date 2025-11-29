import java.util.*;
public class Main{
    public static void main(String args[]){
        int arr[] = {1, 2, 4, 5, 7, 9};
        int max = Arrays.stream(arr).max().getAsInt();
        
        boolean seen[] = new boolean[max + 1];
        
        for(int num : arr){
            seen[num] = true;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= max; i ++){
            if(!seen[i]){
                list.add(i);
            }
        }
        
        System.out.println(list);
        
    }
}
