import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number:");
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
        
        bf.close();

        System.out.println();        
        
        System.out.println("Enter a number:");

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println(num1);
    }
    
}