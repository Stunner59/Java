
import java.util.Stack;



public class ParanthesisChecker {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();

        String str = "{}}";

        for(int i = 0; i<str.length();i++)
        {
            if(str.charAt(i) == '[' || str.charAt(i) == '{'|| str.charAt(i) == '(' )
            {
                st.push(str.charAt(i));
            }

            else if( !st.isEmpty() &&
                    ((str.charAt(i) == ')' && st.peek() == '(') ||
                
                    (str.charAt(i) == ']' && st.peek() == '[') ||

                    (str.charAt(i) == '}' && st.peek() == '{') ))
                    {
                        st.pop();
                    }

            else{
                st.push(str.charAt(i));
            }
        }
        System.out.println();
        if(st.isEmpty()){
            System.out.println();
            System.out.println(str + " is balanced");}
        else
            System.out.println(str + " is not balanced");

            System.out.println();
            System.out.println();
    }
}
