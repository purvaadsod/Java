import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size :");
        int n = sc.nextInt();
        System.out.print("Enter array elements:");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
               a[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(a[i] > max){
                max = a[i];
            }
        }

        for (int floor = max; floor >=1; floor--) {
            for (int j = 0; j < n; j++) {
                if(a[j] >= floor){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    
    }
