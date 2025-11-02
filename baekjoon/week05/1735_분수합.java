import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A1 = sc.nextInt(); 
        int B1 = sc.nextInt(); 
        int A2 = sc.nextInt(); 
        int B2 = sc.nextInt(); 

        int top = A1 * B2 + A2 * B1;
        int bottom = B1 * B2;
        int min;
        int max = 1;
        
        if (top < bottom) {
            min = top;
        } else {
            min = bottom;
        }

        for(int i = 1; i <= min; i++) {
            if(top % i == 0 && bottom % i == 0) {
                max = i;
            }
        }

        top = top / max;
        bottom = bottom / max;
      
        System.out.println(top + " " + bottom);
    }
}
