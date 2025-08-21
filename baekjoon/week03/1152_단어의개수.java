import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine().trim();

        if (n.length() == 0) { 
            System.out.println(0);
        } else {
            System.out.println(n.split(" ").length); 
        }
    }
}
