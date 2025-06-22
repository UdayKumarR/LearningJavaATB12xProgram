package exam_12Xb_22062025_OOPsJava;

public class Vehicle
 {
     public void start()
     {
         System.out.println("This is common roar of a vehicle at start ");
     }
 }

 class Car extends Vehicle
 {
     public void start() {
         System.out.print("Car engine starts with a roar! ");
     }
 }

 class Bike extends Vehicle
 {
     @Override
     public void start() {
         System.out.print("Bike engine starts with a purr! ");
     }
 }

 class exam6_vehicleInheritance
 {
    public static void main(String[] args)
    {
        Vehicle[] vehicles = {new Car(), new Bike()};
        vehicles[0].start();
        vehicles[1].start();
    }
}

