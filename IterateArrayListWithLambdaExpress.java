package javaTask;

import java.util.ArrayList;
import java.util.List;

public class IterateArrayListWithLambdaExpress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>nameList =new ArrayList<>();
		nameList.add("chennai");
		nameList.add("cuddalore");
		nameList.add("villupuram");
		nameList.add("salem");
		
		//using lambda expression
		nameList.forEach((name)->System.out.println(name));  //more no. of code reduced
					
	}		
}
