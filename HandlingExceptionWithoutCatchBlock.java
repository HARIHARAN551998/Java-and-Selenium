package javaTask;

public class HandlingExceptionWithoutCatchBlock {
	
	 static void doStringOperation() throws Exception{
	        try{
	            String text = null;
	            //Trying to replace character in null string. Exception is caused.
	            text = text.replaceAll("", "");
	        }finally{
	            //This code inside finally block will be executed always (Even if there is an exception)
	            System.out.println("Successfully completed string operation");
	        }
	    }
	    
	    public static void main(String[] args) throws Exception{
	        doStringOperation();
	    }
}
