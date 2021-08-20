class Node
{
    int data;
    Node next;
}

class Data{
    
    Node head;
   

    public void insert(int data)
    {

       Node node = new Node();

       node.data = data;
       node.next = null;



        if(head == null)
        {
            head = node; 
        }
        else
        {
            Node temp = head;

            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void insertBeg(int data)
    {
        Node node = new Node();
        node.data = data;
        // node.next = null;

        node.next = head;
        head = node;
    }

    public void insertAfter(int data, int loc)
    {
        Node node = new Node();
        node.data = data; 

        Node temp = head;

        if(loc == 0)
        {
            insertBeg(data);
        }
        else{
        for (int i = 0; i <loc-1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }
    }

    public void deleteAt(int index)
    {
        Node n = head;
        if(index == 0)
        {
            head = head.next;
        }
        else{
            for (int i = 1; i <index; i++) {
                n = n.next;
            }
            Node n1 = null;
            n1 = n.next;
            n.next = n1.next;
        }
    }


    public void show(){
        Node node = head;

        while(node.next!=null)
        {
            System.out.print(node.data+"->");
            node = node.next;
        }
        System.out.println(node.data); 
    }
}


public class LinkedList {

    public static void main(String[] args) {
        Data d = new Data();

        d.insert(1);
        d.insert(2);
        d.insert(3);
        d.insert(4);
        d.insert(5);
        d.insert(6);
        d.insert(7);
        // d.insertBeg(12);
        // d.insertBeg(13);
        // d.insertAfter(14, 2);
        // d.insertAfter(15, 0);
        // d.insertAfter(155, 4);
        d.deleteAt(2);
        d.deleteAt(0);


        d.show();
    }
    
}
