package javaTask;

public class ConstructerOverloading {
	
	int id;
	String name;
	int age;
	 ConstructerOverloading(int i,String n){
		id=i;
		name=n;
	}
	 ConstructerOverloading(int i,String n,int a){
		 id=i;
		 name=n;
		 age=a;
	 }
	 
	 void display() {
		 System.out.println(id+" "+name+" "+age);
	 }
	public static void main(String[] args) {
		
		ConstructerOverloading object=new ConstructerOverloading(23, "hari", 23);
		ConstructerOverloading object1=new ConstructerOverloading(16 ,"priya");
		object.display();
		object1.display();
	}

}
