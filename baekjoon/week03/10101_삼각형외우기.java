import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;

        if(a == 60 && b == 60 && c == 60) {
            System.out.println("Equilateral");
        } else if(sum == 180 && (a == b || b == c || a == c)) {
            System.out.println("Isosceles");
        } else if(sum == 180 && a != b && b != c && a != c) {
            System.out.println("Scalene");
        } else {
            System.out.println("Error");
        }
    }
}
