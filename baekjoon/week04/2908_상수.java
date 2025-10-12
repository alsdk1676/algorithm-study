import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        String a = "";
        for(int i = 0; i < A.length(); i++) {
            a = A.charAt(i) + a; 
        }

        String b = "";
        for(int i = 0; i < B.length(); i++) {
            b = B.charAt(i) + b; 
        }

        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);

        if(num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}
