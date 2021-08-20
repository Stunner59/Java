
class Employee{
    int id;
    String name;
    double salary;

    public double getsalary()
    {
        return salary;
    }

    public void getdetails(){
        System.out.println("id is " +id);
        System.out.println("Name is "+ name);

    }

    public void setdetails(String n){
        name = n;
    }
}


public class firstclass {

    public static void main(String[] args){

        Employee Sarwesh = new Employee();
        Employee Suresh = new Employee();

        Sarwesh.id = 1;
        Sarwesh.name = "Sarwesh Shenvi";
        Sarwesh.setdetails("Stunner59");
        Sarwesh.salary = 89000;
        Sarwesh.getdetails();
        System.out.println(Sarwesh.name + " salary is " +Sarwesh.getsalary());
        System.out.println();
        


        Suresh.id = 2;
        Suresh.name = "Suresh Bhagath";
        Suresh.salary = 8000;
        Suresh.getdetails();
        System.out.println(Suresh.name + " salary is " +Suresh.getsalary());          

    }
    
}
