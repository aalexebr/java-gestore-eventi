package org.java;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.java.pojo.abs.Event;

public class Main {
	public static void main(String[] args) {
		System.out.println("test");
		
//		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd ");
//		Date date = new Date();
//		System.out.println(dateFormat.format(date));
		
		Event x = new Event("event1", 2023,12,12, 1000);
		System.out.println(x);
		x.getFormatDate();
//		try {
//			x.cancelReservation();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		try {
//			x.reserveSeat();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println(x);
//		
//		try {
//			x.cancelReservation();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		System.out.println(x);
		
		
		
	}

}
