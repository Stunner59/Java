// import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {
        // int [] marks = new int[5];

        // int [] marks;
        // marks = new int[5];

        // 3rd method
        // Scanner sc = new Scanner(System.in);
        
        // for(int i =0; i<5; i++){
            
            //     marks[i] = sc.nextInt();
            
            
            // }
            // sc.close();
            
            // for(int i =0; i<5; i++){
                
                
                //     System.out.print(marks[i]);
                
                
                // }
                int [] marks = {1,2,3,4,5};
                System.out.println(marks[4]);
                System.out.println(marks.length);

                for(int i =marks.length-1; i>-1; i--){              
                        System.out.print(marks[i]+" ");                    
                    }
                    System.out.println();
                for (int element : marks) {
                    
                    System.out.print(element+" ");

                    
                }
            }
            
}
