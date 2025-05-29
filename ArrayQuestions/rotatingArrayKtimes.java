// package ArrayQuestions;
public class rotatingArrayKtimes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int k = 4;  //k is how many times we have to rotatate array
        k = k % n;  //
        for (int i = 0; i < k; i++) {
            int last = arr[n-1];   //here we storing last value of array to last variable 
            for (int j = n-1; j > 0 ; j--) {
                arr[j] = arr[j-1]; //here we are shifting array element from 1st index one backward
             }
             arr[0] = last;//assigning last value to first element of array
        }

       
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
