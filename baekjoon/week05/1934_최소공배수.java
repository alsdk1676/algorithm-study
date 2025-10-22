import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  

        for(int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int min; 
            int max = 1; 
            
            if(A < B) {
                min = A;
            } else {
                min = B;
            }

            for(int j = 1; j <= min; j++) {
                if(A % j == 0 && B % j == 0) {
                    max = j;
                }
            }

            int result = A * B / max;  
            System.out.println(result);
        }
    }
}
