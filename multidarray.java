import java.util.Scanner;
// import java.util.Arrays;


class multidarray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = in.nextInt();

        int [] a = new int [n];

        for(int i = 0; i<a.length; i++)
        {
            // System.out.println("Enter "+i+"th Element");
            a[i] = in.nextInt();
        }
        
        int first;
        int  count;

        System.out.println("Enter the kth value");
        count = in.nextInt();
        in.close();

        first = a[0];



        for(int i = 0; i<a.length; i++){
           if(a[i]<first)
           {
               first = a[i];
               
           }
           
        }
       
        



        // for (int ele : a) {
        //     if(ele > first)
        //    {
        //        first = ele;
        //    }
        //    if(ele<last)
        //    {
        //        last = ele;
        //    }
        // }

        // System.out.println("The greatest element in an array is "+first);
        // System.out.println("The smallest element in an array is "+last);



        System.out.println("The "+ count+ " largest element in an array is "+first);
        

       


        
    }
    
    
}
