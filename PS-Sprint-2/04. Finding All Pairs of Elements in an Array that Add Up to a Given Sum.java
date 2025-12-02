// For Sorted Array if possible with problem
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;

        Arrays.sort(arr); // required for two-pointer

        ArrayList<int[]> list = new ArrayList<>();

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                list.add(new int[]{arr[i], arr[j]});
                i++;
                j--;
            }
            else if (sum < target) {
                i++;
            }
            else {
                j--;
            }
        }

        // Print pairs
        for (int[] pair : list) {
            System.out.println(Arrays.toString(pair));
        }
    }
}




////////////////////// OR /////////////////


//For Unsorted Array if in problem it is mention we can't sort the array then we use this method.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;

        HashSet<Integer> set = new HashSet<>();
        ArrayList<int[]> list = new ArrayList<>();

        for (int num : arr) {
            int complement = target - num;

            if (set.contains(complement)) {
                list.add(new int[]{complement, num});
            }

            set.add(num);
        }

        for (int[] pair : list) {
            System.out.println(Arrays.toString(pair));
        }
    }
}

