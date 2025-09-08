import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        long sum = 0;              

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            sum += a;
            if (a > max) {
                max = a;
            }
        }

        double avg = (sum * 100) / (max * (double)N);
        System.out.println(avg);   
    }
}
