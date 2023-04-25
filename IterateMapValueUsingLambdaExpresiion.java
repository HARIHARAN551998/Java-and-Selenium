package javaTask;

import java.util.HashMap;
import java.util.Map;

public class IterateMapValueUsingLambdaExpresiion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> details=new HashMap<>();
		details.put(001, "Hari");
		details.put(002, "Haran");
		details.put(003, "Priya");
		details.put(004, "Dharshni");
		
		details.forEach((k,v)->System.out.println("ID: "+k+" NAME:"+v));
		
	}

}
