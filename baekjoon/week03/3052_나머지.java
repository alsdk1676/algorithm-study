import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[42];

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();      
            int n = num % 42;       
            arr[n] = 1;           
        }
      
        int count = 0;
        for (int i = 0; i < 42; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
