import java.util.Stack;

public class StringReverseUsingStack {


    public void reverseS(String q, int n)
    {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            s.push(q.charAt(i));            
        }
        System.out.print(q);
        System.out.println();

       while(!s.empty())
       {
           System.out.print(s.pop());
       }

    }
    public static void main(String[] args) {

        String st = "HelloWorld my name is gabbar";

        StringReverseUsingStack sss = new StringReverseUsingStack();
        sss.reverseS(st, st.length());



    }
    
}
