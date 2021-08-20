import java.util.LinkedList;
import java.util.Stack;

public class reverseStringUsingLinkedlist {
    static LinkedList<Character> ll = new LinkedList<>();
    static Stack<Character> stack = new Stack<>();




    public static void main(String[] args) {
        input();
        for (char string : ll) {
            System.out.print(string);
            
        }
System.out.println();
        while(!ll.isEmpty())
        {
            stack.push(ll.get(0));
            ll.remove(0);
        }

        while(!stack.isEmpty()){
            ll.add(stack.pop());
        }

        for (char ele : ll) {
            System.out.print(ele);
            
        }
    }

    static void input()
    {
        ll.add('H');
        ll.add('e');
        ll.add('l');
        ll.add('l');
        ll.add('o');
    }
    
}
