// package ArrayQuestions;

public class TwoPointer {

    //Two pointer apporach is very important concept 
    public static void main(String[] args) {
        // we have array that contains only 0s and 1s 
        // so here we are using two ponter apporach
        int[] arr = {1,0,0,1,0,1,0};
        //we want all 0s on left and all 1s on right
        int left=0,right=arr.length-1;

        while (left < right) {
            if (arr[left]== 1 && arr[right] == 0) { 
        //if left has value '1' and right '0' then swap it to its correct position
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++; //and then increase left pointer by one forward
                right--;  //and then decrease right pointer by one backward
            }
            if (arr[left] == 0) {
                left++; //if left contain 0 means it at its correct position so just increade left by one 
            }
            if (arr[right] == 1) {
               right--; //if right contain 1 means it at its correct position so just decrease right by one 
            }
        }

       for(int el :arr) {
        //printing newly sorted array
        System.out.print(el + " ");
       }
    }
}
