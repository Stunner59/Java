import java.util.Scanner;

public class strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        // System.out.println(s);
        sc.close();

        // System.out.println(s.toLowerCase());
        // System.out.println(s.toUpperCase());
        // System.out.println(s.substring(1,4));
        // System.out.println(s.replace('s', 'r'));

        System.out.println(s.startsWith("sa"));

        System.out.println(s.charAt(3));
        System.out.println(s.indexOf("esh"));
        System.out.println(s.equals("sarwesh"));


        
    
}
}
