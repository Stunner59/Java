import java.util.Scanner;

public class StringReverseUsingArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        // System.out.println(s);

        sc.close();

        for (int i = 0; i < arr.length/2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        for (char c : arr) {
            System.out.print(c);
        }
    }
    
}
