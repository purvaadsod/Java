// package ArrayQuestions;

public class EvenOddArray {

    static boolean evenOrOdd(int n) {
        if (n%2 == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // we have to make this array like all even numbers are go on left side and all odd numbers go on right side
        // the sequence/order of element not matters
        int[] arr = {3,2,8,1,6,9,10,5};
        int left=0,right=arr.length-1;

        while (left < right) {
            if (evenOrOdd(arr[left]) == false  &&  evenOrOdd(arr[right]) == true) { 
        //if left has value '1' and right '0' then swap it to its correct position
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++; //and then increase left pointer by one forward
                right--;  //and then decrease right pointer by one backward
            }
            if (evenOrOdd(arr[left]) == true) {
                left++; //if left contain 0 means it at its correct position so just increade left by one 
            }
            if (evenOrOdd(arr[right]) == false) {
               right--; //if right contain 1 means it at its correct position so just decrease right by one 
            }
        }

        for(int el :arr) {
            //printing newly sorted array
            System.out.print(el + " ");
           }
    }
}
