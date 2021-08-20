public class ReverseLL
{
    static Node Head;

    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    Node reverse(Node node)
    {
        Node current = node;
        Node prev = null;
        Node next = null;

        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        node = prev;
        return node;
    }

    void print_recursive(Node Head)
    {
        if(Head == null)
            return;
        else{
            System.out.print(Head.data+"->");
            print_recursive(Head.next);
        }
    }

    void printRev_recursive(Node Head)
    {
        if(Head == null)
            return;
        else{
            printRev_recursive(Head.next);
            System.out.print(Head.data+"->");
        }
    }

    void printNode(Node node){
        
        while(node!=null)
        {
            System.out.print(node.data +"->");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ReverseLL l = new ReverseLL();

        Head = new Node(85);
        Head.next = new Node(1);
        Head.next.next = new Node(2);
        Head.next.next.next = new Node(3);
        Head.next.next.next.next = new Node(4);

        System.out.println("Before reversing");
        l.printNode(Head);
        // Head = l.reverse(Head);
        // Head = l.reverse(Head);
        System.out.println();
        // System.out.println("After reversing");
        // l.printNode(Head); 


        System.out.println();
        System.out.println("using recursion printing");
        l.print_recursive(Head);
        System.out.println();
        System.out.println("using recursion revesrse printing");
        l.printRev_recursive(Head);
        

    }
}





