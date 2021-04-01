// Name: Jeffery Hu
// Teacher name: Ms. Krasteva
// File name: AirplaneTester.java
// Date: February 18, 2021.
// Description: This class is a tester class for the Airplane class.

public class AirplaneTester{
   public static void main (String args[]){
      Airplane FlightOne = new Airplane();
      Airplane FlightTwo = new Airplane();
      
      //Flight One
      System.out.println("Flight One:");
      System.out.println("Boarding:");
      FlightOne.loadPass(29);
      System.out.println(FlightOne.getPassengers());
      System.out.println(FlightOne.getDoorStatus());
      System.out.println(FlightOne.getGasLevel());
      System.out.println(FlightOne.getLandingGear());
      System.out.println();
      
      System.out.println("Take off:");
      FlightOne.closeDoor();
      FlightOne.takeOff();
      System.out.println(FlightOne.getPassengers());
      System.out.println(FlightOne.getDoorStatus());
      System.out.println(FlightOne.getGasLevel());
      System.out.println(FlightOne.getLandingGear());
      System.out.println();
      
      System.out.println("In the air:");
      FlightOne.doneTakeOff();
      FlightOne.normalFlight(50);
      System.out.println(FlightOne.getPassengers());
      System.out.println(FlightOne.getDoorStatus());
      System.out.println(FlightOne.getGasLevel());
      System.out.println(FlightOne.getLandingGear());
      System.out.println();
      
      System.out.println("Landing:");
      FlightOne.prepLanding();
      FlightOne.land();
      System.out.println(FlightOne.getPassengers());
      System.out.println(FlightOne.getDoorStatus());
      System.out.println(FlightOne.getGasLevel());
      System.out.println(FlightOne.getLandingGear());
      System.out.println();
      
      System.out.println("Disembark:");
      FlightOne.openDoor();
      FlightOne.unloadPass();
      System.out.println(FlightOne.getPassengers());
      System.out.println(FlightOne.getDoorStatus());
      System.out.println(FlightOne.getGasLevel());
      System.out.println(FlightOne.getLandingGear());
      System.out.println();
      
      //Flight Two
      System.out.println("Flight Two:");
      System.out.println("Boarding:");
      FlightTwo.loadPass(50);
      System.out.println(FlightTwo.getPassengers());
      System.out.println(FlightTwo.getDoorStatus());
      System.out.println(FlightTwo.getGasLevel());
      System.out.println(FlightTwo.getLandingGear());
      System.out.println();
      
      System.out.println("Take off:");
      FlightTwo.closeDoor();
      FlightTwo.takeOff();
      System.out.println(FlightTwo.getPassengers());
      System.out.println(FlightTwo.getDoorStatus());
      System.out.println(FlightTwo.getGasLevel());
      System.out.println(FlightTwo.getLandingGear());
      System.out.println();
      
      System.out.println("In the air:");
      FlightTwo.doneTakeOff();
      FlightTwo.normalFlight(20);
      System.out.println(FlightTwo.getPassengers());
      System.out.println(FlightTwo.getDoorStatus());
      System.out.println(FlightTwo.getGasLevel());
      System.out.println(FlightTwo.getLandingGear());
      System.out.println();
      
      System.out.println("Landing:");
      FlightTwo.prepLanding();
      FlightTwo.land();
      System.out.println(FlightTwo.getPassengers());
      System.out.println(FlightTwo.getDoorStatus());
      System.out.println(FlightTwo.getGasLevel());
      System.out.println(FlightTwo.getLandingGear());
      System.out.println();
      
      System.out.println("Disembark:");
      FlightTwo.openDoor();
      FlightTwo.unloadPass();
      System.out.println(FlightTwo.getPassengers());
      System.out.println(FlightTwo.getDoorStatus());
      System.out.println(FlightTwo.getGasLevel());
      System.out.println(FlightTwo.getLandingGear());

   }
}