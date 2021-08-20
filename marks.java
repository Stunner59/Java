import java.util.Scanner;


class Student{
    static String clg_name = "NIT";
    String sname;
    String usn;
    double average = 0;
    static int count = 1;

    double SE1, SE2, SE3, SE4, SE5, SE6, SE7, SE8;
    static int passout = 2022;

    Scanner sc = new Scanner(System.in);
    Student(){
        System.out.println();
        System.out.println("Enter the Student "+count+" Name");
        sname = sc.nextLine();
        System.out.println("Enter the USN");
        usn = sc.nextLine();


        System.out.println("Enter sem 1 percent");
        SE1 = sc.nextDouble();
        System.out.println("Enter sem 2 percent");
        SE2 = sc.nextDouble();
        System.out.println("Enter sem 3 percent");
        SE3 = sc.nextDouble();
        System.out.println("Enter sem 4 percent");
        SE4 = sc.nextDouble();
        System.out.println("Enter sem 5 percent");
        SE5 = sc.nextDouble();
        System.out.println("Enter sem 6 percent");
        SE6 = sc.nextDouble();
        System.out.println("Enter sem 7 percent");
        SE7 = sc.nextDouble();
        System.out.println("Enter sem 8 percent");
        SE8 = sc.nextDouble();

        average = (SE1+ SE2+ SE3+ SE4+ SE5+ SE6+ SE7+ SE8)/8;

        student_details();



    }

    void student_details(){
        System.out.println("The average of "+ sname +" with USN "+ usn + " is " + average);
        count++;
    }
    void none(){
        
    }

}

public class marks {
    
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        System.out.println("How many students");
        Scanner i = new Scanner(System.in);
        int det = i.nextInt();
        i.close();

        while(det>0){
            Student s = new Student();
            s.none();
            det--;
        }
        

       
        
    }
}
