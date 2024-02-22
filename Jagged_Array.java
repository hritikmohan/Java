import java.util.Random;

// Jagged array is an array in which number of rows are defined but number of columns are not defined

public class Jagged_Array {
    public static void main(String[] args) {
        int nums[][] = new int [3][];

        // Number of columns are defined individually

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        Random random = new Random();

        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums[i].length; j++){
                nums[i][j] = random.nextInt(100);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }


    }
}
