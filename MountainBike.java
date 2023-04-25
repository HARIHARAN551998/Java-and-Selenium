package javaTask;

public class MountainBike extends MotorBike{
	
	// implementation of abstract method
		  public void brake() {
		    System.out.println("MountainBike Brake");
		  }
		
		  public static void main(String[] args) {
		    MountainBike m1 = new MountainBike();
		    m1.brake();
		    SportsBike s1 = new SportsBike();
		    s1.brake();
		  }
}
