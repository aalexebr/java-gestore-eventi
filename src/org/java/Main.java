package org.java;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.java.pojo.abs.Event;

public class Main {
	public static void main(String[] args) {
		
//		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd ");
//		Date date = new Date();
//		System.out.println(dateFormat.format(date));
		
//		try {
//			Event x = new Event("event1", 2023,8,12, 1000);
//			System.out.println(x);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
//		System.out.println(x);
//		x.getFormatDate();
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
		String name;
		int day;
		int month;
		int year;
		int totSeats;
		Scanner in = new Scanner(System.in);
		System.out.println("create event ");
		
		System.out.print("name of event:");
		name = in.nextLine();
		
		System.out.print("day of event:");
		String userDay = in.nextLine();
		day = Integer.valueOf(userDay);
		
		System.out.print("month of event as number:");
		String userMonth = in.nextLine();
		month = Integer.valueOf(userMonth);
		
		System.out.print("year of event as number:");
		String userYear = in.nextLine();
		year = Integer.valueOf(userYear);
		
		System.out.print("event capacity:");
		String userCapacity = in.nextLine();
		totSeats = Integer.valueOf(userCapacity);
		
		Event event = null;
		
		try {
			
			 event = new Event(name, year, month, day, totSeats);
			System.out.println(event);
			
			
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
			char choice;
			System.out.print("do you want to make a reservation? y/n");
			String userChoise = in.nextLine();
			choice = userChoise.charAt(0);
			if( choice == 'y') {
				int res;
				System.out.print("how many seats to reserve?");
				String userRez = in.nextLine();
				res = Integer.valueOf(userRez);
				
				try {
					event.makeMultipleReservations(res);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				System.out.println(event.getReservationsAndTotalSeats());
				
				int cancel;
				
				System.out.print("how many reservations to cancel?");
				String userCancel = in.nextLine();
				cancel = Integer.valueOf(userCancel);
				
				try {
					event.cancelMultipleReservations(cancel);
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				System.out.println(event.getReservationsAndTotalSeats());
				
			}
			else {
				System.out.println("terminated");
		}
		
		
		
		in.close();
		
		
		
	}

}
