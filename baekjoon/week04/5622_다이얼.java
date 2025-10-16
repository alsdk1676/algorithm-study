import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();   
        int t = 0;        

        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i); 
            
            if(ch >= 'A' && ch <= 'C') {
                t += 3;
            } else if(ch >= 'D' && ch <= 'F') {
                t += 4;
            } else if(ch >= 'G' && ch <= 'I') {
                t += 5;  
            } else if(ch >= 'J' && ch <= 'L') {
                t += 6;
            } else if(ch >= 'M' && ch <= 'O') {
                t += 7;
            } else if(ch >= 'P' && ch <= 'S') {
                t += 8;
            } else if(ch >= 'T' && ch <= 'V') {
                t += 9;
            } else if(ch >= 'W' && ch <= 'Z'){
                t += 10;
            }
        }
        System.out.println(t);
    }
}
