import java.util.Scanner;

class Vehicle
{
    String carName;
    int seater;
    String carNo;
     

    Vehicle(){
        System.out.println("Constructor of parent class 'Vehicle' ");
        seater = 4;
        carName = "Mercedes";
        carNo = "KA-30-A-1987";
    }
}

class car extends Vehicle
{

    String ModelNumber;
    static String Steering_type = "Normal";

    car(){
        System.out.println("Constrictor of child class 'Car'");
        ModelNumber = "2019-Phantom";
    }


}

class SuperCar extends car
{
    // static String Steering_type = "Electric";
    // int seater = 2;
     Scanner sc = new Scanner(System.in);
    String Steering_type;
    int seater = 2;
    SuperCar(){

        Steering_type = "Electric";
        System.out.println("Constructor of child class of child class Car");

        System.out.println("Do you want to print car details?");
        if(sc.nextInt() == 1)
        {
            
            display_properties();
        }
        else{
            System.out.println("Visit Again!!");
        }

    }


    void display_properties()
    {
            System.out.println("Car Name is "+carName);
            System.out.println("Car Number is "+carNo);
            System.out.println("Car has total seating capacity of "+ seater);
            System.out.println("Car Model Number is "+ ModelNumber);
            System.out.println("Car Steering type is "+ Steering_type);
    }
} 


abstract class Animal{

    public void Hello(){
        System.out.println("My hello");
    }
    public abstract void bark();
    public abstract void swim();
}

abstract class Dog extends Animal{
    public void bark(){
        System.out.println("This normal dog is barking");
    }

    
}

class Labrodor extends Dog{
    

    public void swim()
    {
        System.out.println("This dog swims");
    }
}

public class inheritance {
    public static void main(String[] args) {
        // SuperCar SC = new SuperCar();

        Labrodor l = new Labrodor();
        l.bark();
        l.swim();
        l.Hello();
    }
}
