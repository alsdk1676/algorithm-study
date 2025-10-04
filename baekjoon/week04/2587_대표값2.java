import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int total = 0;          

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        int avg = total / 5;

        for (int i = 0; i < 5; i++) {       
            for (int j = i + 1; j < 5; j++) { 
                if (arr[i] > arr[j]) {     
                    int arr2 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = arr2;
                }
            }
        }
        int n = arr[2];

        System.out.println(avg);
        System.out.println(n);
    }
}
