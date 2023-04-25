package javaTask;

public class LengthConcatenatandReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getLength();
		addConcate();
		replaceString();
		
	}

	private static void replaceString() {
		String str = "Hello, World!";
		String result = str.replace("World", "Hari");
		System.out.println(result); 
		
	}

	private static void addConcate() {
		String str1 = "Hari";
		String str2 = "Haran";
		String result1 = str1 + ", " + str2 + "!";
		String result2 = str1.concat(", ").concat(str2).concat("!");
		System.out.println(result1); 
		System.out.println(result2); 
		
	}

	private static void getLength() {
		String str = "Hari, Haran!";
		int length = str.length();
		System.out.println("The length of the string is: " + length); 

	}
	

}
