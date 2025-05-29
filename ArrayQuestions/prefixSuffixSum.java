import java.util.Scanner;

public class prefixSuffixSum {

   /* ----------(prefix sum snd suffix sum is the important concept)---------- */
//    lecture no 19 raghav garg

    static int totalSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static boolean equalPartition(int[] arr){
        int totalSum = totalSum(arr); //this will return total sum of the array elements 
        int prefixSum = 0, suffixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i]; //counting prefix sum for each element 
            suffixSum = totalSum - prefixSum; 

            if (prefixSum == suffixSum) {
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        
        // QUE:check if we can partition the array into subarrays with equal sum. More formally,
        // check that the prefix sum of the array is equal to the suffix sum of the rest of the array
        // not necessay that it will only equal partition(half)
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter " + n + " elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Equal partition possible: " + equalPartition(arr));

    }
}
