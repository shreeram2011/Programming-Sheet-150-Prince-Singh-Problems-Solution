public class Main {
    public static void main(String[] args) {
        int[] arr = {10,10,5};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }
            else if(num > secondLargest && num != largest){
                secondLargest = num;
            }
        }
        System.out.print("Largest : " + largest);
        System.out.print(" Second Largest element : " + secondLargest);
    }
}

