import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int M = sc.nextInt(); 
        int[] arr = new int[N + 1];

        for(int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        for(int k = 0; k < M; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int arr2 = arr[i];
            arr[i] = arr[j];
            arr[j] = arr2;
        }

        for(int i = 1; i <= N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
