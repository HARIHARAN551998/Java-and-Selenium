package javaTask;

public class EncapsulationImplementation {

	 // private field
	  private int age;

	  // getter method
	  public int getAge() {
	    return age;
	  }

	  // setter method
	  public void setAge(int age) {
	    this.age = age;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    // create an object of Person
		EncapsulationImplementation p1 = new EncapsulationImplementation();

		    // change age using setter
		    p1.setAge(24);
		    // access age using getter
		    System.out.println("My age is " + p1.getAge());
	}

}
