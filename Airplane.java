// Name: Jeffery Hu
// Teacher name: Ms. Krasteva
// File name: Airplane.java
// Date: February 18, 2021.
// Description: This class represents an Airplane, and can make it perform regular airplane functions during its flight (e.g. close door, take off, fly, land, bring landing gear up, etc.).

public class Airplane{
   private int gasLevel;
   private String landingGear;
   private String doorStatus;
   private int passengers;
   
   public Airplane(){
      gasLevel = 100;
      landingGear = "Down";
      doorStatus = "Open";
      passengers = 100;
   }
   
   public void openDoor(){
      doorStatus = "Open";
   }
   
   public void closeDoor(){
      doorStatus = "Closed";
   }
   
   public void fillUp(){
      gasLevel = 100;
   }
   
   public void takeOff(){
      gasLevel -= 30;
   }
   
   public void doneTakeOff(){
      landingGear = "Up";
   }
   
   public void normalFlight(int percentUsed){
      gasLevel -= percentUsed;
   }
   
   public void prepLanding(){
      landingGear = "Down";
   }
   
   public void land(){
      gasLevel -= 15;
   }
   
   public void loadPass(int numPass){
      passengers += numPass;
   }
   
   public void unloadPass(){
      passengers = 0;
   }
   
   public int getGasLevel(){
      return gasLevel;
   }
   
   public String getDoorStatus(){
      return doorStatus;
   }
   
   public int getPassengers(){
      return passengers;
   }
   
   public String getLandingGear(){
      return landingGear;
   }
}