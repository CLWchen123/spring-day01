package test;

import java.util.Calendar;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Calendar call = Calendar.getInstance();
		System.out.println("call:"+call);
		
		Date date1 = call.getTime();
		System.out.println("date1:"+date1);
	}
}


