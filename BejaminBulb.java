import java.util.Scanner;

public class BejaminBulb {

    // in Benjamin bulb we are given n number of bulbs which are initially off
    // n number of fluctuations happen in bulbs 
    // 1st fluctuation all bulb fluctuate in 2nd 2s multiple fluctuate ,in 3rd 3s multiple ....and so on until n fluctuation
    // we have to return bulbs which will remain on after n fluctuations

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();

    //perfect square in this range will remain on
        for (int i = 1; i*i <=n; i++) {
            System.out.print("b"+ i*i + " ");
        }
        
    }
}
