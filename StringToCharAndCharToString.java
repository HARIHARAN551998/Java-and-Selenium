package javaTask;

import java.util.Arrays;

public class StringToCharAndCharToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			convertToString();
			convertToChar();
			
	}

	private static void convertToChar() {
		// TODO Auto-generated method stub
		String st = "i am hariharan";

        char[] chars = st.toCharArray();
        System.out.println(Arrays.toString(chars));
	}

	private static void convertToString() {
		// TODO Auto-generated method stub
		char[] ch = {'H', 'A', 'R', 'I'};

        String st = String.valueOf(ch);
        //String st2 = new String(ch);

        System.out.println(st);
        //System.out.println(st2);
	}

}
