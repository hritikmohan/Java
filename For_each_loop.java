// Also called enhanced for loop

public class For_each_loop {
    public static void main(String[] args) {
        int arr[] = new int[5];

        arr[0] = 4;
        arr[1] = 7;
        arr[2] = 2;
        arr[3] = 9;
        arr[4] = 1;

        for(int n : arr){
            System.out.println(n);
        }

        // for traversing objects use Class name in place of int
    }
}
