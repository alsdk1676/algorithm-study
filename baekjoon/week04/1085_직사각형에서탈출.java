import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        int n = x; 
        
        if(y < n) {
            n = y;
        }
      
        if(w - x < n) {
            n = w - x;
        }
      
        if(h - y < n) {
            n = h - y;
        }

        System.out.println(n);
    }
}
