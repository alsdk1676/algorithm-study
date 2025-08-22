import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        for(char x = 'a'; x <= 'z'; x++) {
            System.out.print(S.indexOf(x) + " ");
        }
    }
}
