// import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class RepEle {

    static void findcommon(int a[])
    {
        int b[] = {-1,-1,-1,-1,-1,-1,-1};
        for(int i = 0; i < a.length; i++)
        {
            b[a[i]] += i;  
        }
                                                                //WRONG PROGRAM
        for(int ele:b)
        {
            System.out.print(ele+" ");

            if(ele == 2)
            {
                System.out.println(" "+a[ele]+" ");
                System.out.println("ele");
                System.out.println("========================");
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {1,3,5,4,3,5,6};
        findcommon(a);
    }
}
