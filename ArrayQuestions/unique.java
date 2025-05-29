// package ArrayQuestions;

public class unique {

    //checking unique element in the array

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,2,3,1,4,5};
        int unique = -1,idx =-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                 }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                unique = arr[i];
                idx = i;
            }
        }

        if (unique < 0) {
            System.out.println("Array has no unique element");
            
        } else {
            
            System.out.println("Unique element = " + unique + " and index is " + idx);
        }
    }
}
