package javaTask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringInToDateFormat {

	    public static void main(String[] args) {
	        String dateStr = "2023-04-25";
	      
	        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	        try {
	            Date date = formatter.parse(dateStr);
	            System.out.println("Date is: " + date);
	        } catch (ParseException e) {
	            System.out.println("Error occurred: " + e.getMessage());
	        }
	    }
	}
