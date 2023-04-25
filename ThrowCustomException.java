package javaTask;

import jxl.read.biff.PasswordException;

public class ThrowCustomException extends Exception{

	//just for password exception 
	public void verifyPassword(int num) throws ThrowCustomException {
		String pwd=String.valueOf(num);
		if(pwd.length() <8) {
			ThrowCustomException pe=new ThrowCustomException();
			throw pe;			
		}
		System.out.println("strong password :)");
	}
	
	public static void main(String[] args) throws PasswordException {

		ThrowCustomException pe=new ThrowCustomException();
		try {
			pe.verifyPassword(1234);
		} catch (ThrowCustomException e) {
			System.out.println("Too short your password!");
		}

	}

}
