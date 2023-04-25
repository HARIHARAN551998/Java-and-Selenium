package javaTask;

public class Dog extends Animal{
	String color="black";
	void printColor() {
		System.out.println("when called the dog color: "+color);
	}

	public static void main(String[] args) {

		Dog d=new Dog();
		d.printColor();
		
	}

}
