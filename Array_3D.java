import java.util.Random;

public class Array_3D {
    public static void main(String[] args) {
        int arr[][][] = new int[3][3][3];
        
        Random random = new Random();

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                for(int k = 0; k<3; k++){
                    arr[i][j][k]=random.nextInt(100);
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
