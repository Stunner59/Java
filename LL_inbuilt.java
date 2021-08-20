import java.util.LinkedList;
// import java.util.Stack;




public class LL_inbuilt {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
     
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(0, 1);
        System.out.println(l.element()); 
        int i;
        for( i = 0; i<l.size()-1;i++)
        {
            System.out.print(l.get(i)+"->");
        }
        System.out.println(l.get(i));
        // int x = l.size(),i=0;
        //     while(x-- !=0)
        //     {
        //         System.out.print(l.get(i++)+"->");
                
        //     }

    }
}
