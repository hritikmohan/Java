// Import when Random class is to be used
import java.util.Random;

public class Multidimensional_Array {
    public static void main(String[] args) {
        int arr[][] = new int [3][4];

        // Generates random number
        Random random = new Random();

        for(int i = 0;i<3;i++){
            for(int j = 0; j<4; j++){
                arr[i][j] = random.nextInt(100);   // inserts random numbers between 0 to 100
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }
}
