

public class Reverse_LL_using_recursion {

    static Node head;

    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }


    public void Reverse_rec(Node p)
    {
        if(p.next == null)
        {
            head = p;
            return;
        }
        Reverse_rec(p.next);
        Node q = p.next;
        q.next = p;
        p.next = null;
    }

    public void print(Node n)
    {
        while(n.next != null)
        {
            System.out.print(n.data+"->");
            n = n.next;
        }
        System.out.println(n.data);
    }
    public static void main(String[] args) {
        Reverse_LL_using_recursion rll = new Reverse_LL_using_recursion();

        head = new Node(85);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);

        System.out.println("Before reversing");
        rll.print(head);

        System.out.println();

        rll.Reverse_rec(head);

        System.out.println("After reversing");

        rll.print(head);

        



    }
}
