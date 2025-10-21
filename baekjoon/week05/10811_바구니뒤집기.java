import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  
        int M = sc.nextInt();
        int[] arr1 = new int[N];

        for(int i = 0; i < N; i++) {
            arr1[i] = i + 1;
        }

        for(int i = 0; i < M; i++) {
            int a = sc.nextInt(); 
            int b = sc.nextInt();   
            a = a - 1;
            b = b - 1;

            while(a < b) {
                int arr2 = arr1[a];   
                arr1[a] = arr1[b]; 
                arr1[b] = arr2;         
                a++;
                b--;
            }
        }

        for(int i = 0; i < N; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
