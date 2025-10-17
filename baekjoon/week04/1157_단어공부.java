import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toUpperCase(); 
        
        int[] arr = new int[26]; 
        
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);     
            int idx = ch - 'A';
            arr[idx]++;         
        }

        int max = 0;      
        char result = '?';   

        for(int i = 0; i < 26; i++) {
            if(arr[i] > max) {         
                max = arr[i];         
                result = (char)(i + 'A'); 
            } else if(arr[i] == max) { 
                result = '?';          
            }
        }
        System.out.println(result); 
    }
}
