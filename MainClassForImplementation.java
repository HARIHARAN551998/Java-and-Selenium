package javaTask;

public class MainClassForImplementation implements Interface1,Interface2  {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClassForImplementation main=new MainClassForImplementation();
		
		main.show();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Interface1.super.show();
		
		Interface2.super.show();
	}
	

}
