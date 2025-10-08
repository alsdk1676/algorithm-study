import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int M = sc.nextInt(); 
        int[] arr = new int[N + 1];

        for(int a = 0; a < M; a++) {
            int i = sc.nextInt(); 
            int j = sc.nextInt(); 
            int k = sc.nextInt(); 

            for(int b = i; b <= j; b++) {
                arr[b] = k;
            }
        }

        for(int c = 1; c <= N; c++) {
            System.out.print(arr[c] + " ");
        }
    }
}
