// package ArrayQuestions;
import java.util.Scanner;

public class FrequencyArray {
  
    // ****---------------frequency array is important concept-------------------***

    static int[] makeFrequencyArray(int[] arr){
        int[] frq = new int[100005]; //here we are making frquency array where initially all values are zero

        for (int i = 0; i < arr.length; i++) {
            frq[arr[i]]++; // accesing arr element value and then go in frquency array of index(value of arr[i]) and incremenet it by 1 
            }

        return frq;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter " + n + " elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int [] frq = makeFrequencyArray(arr); //taking frequency array from function

        System.out.println("Enter number of query:");
        int q = sc.nextInt();

        while (q > 0) {
        System.out.print("Enter element to be serched :");
        int x = sc.nextInt();
        if (frq[x] > 0) {
            System.out.println("YES!!");
        } else {
            System.out.println("NO!!");
        }
        q--;
            
        }


        sc.close();
    }
}
