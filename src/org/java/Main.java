package org.java;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import org.java.pojo.abs.Concert;
import org.java.pojo.abs.Event;
import org.java.pojo.abs.EventProgram;

public class Main {
	public static void main(String[] args) {

//		String name;
//		int day;
//		int month;
//		int year;
//		int totSeats;
//		Scanner in = new Scanner(System.in);
//		System.out.println("create event ");
//		
//		System.out.print("name of event:");
//		name = in.nextLine();
//		
//		System.out.print("day of event:");
//		String userDay = in.nextLine();
//		day = Integer.valueOf(userDay);
//		
//		System.out.print("month of event as number:");
//		String userMonth = in.nextLine();
//		month = Integer.valueOf(userMonth);
//		
//		System.out.print("year of event as number:");
//		String userYear = in.nextLine();
//		year = Integer.valueOf(userYear);
//		
//		System.out.print("event capacity:");
//		String userCapacity = in.nextLine();
//		totSeats = Integer.valueOf(userCapacity);
//		
//		Event event = null;
//		
//		try {
//			
//			 event = new Event(name, year, month, day, totSeats);
//			System.out.println(event);
//			
//			
//		} 
//		catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//			char choice;
//			System.out.print("do you want to make a reservation? y/n");
//			String userChoise = in.nextLine();
//			choice = userChoise.charAt(0);
//			if( choice == 'y') {
//				int res;
//				System.out.print("how many seats to reserve?");
//				String userRez = in.nextLine();
//				res = Integer.valueOf(userRez);
//				
//				try {
//					event.makeMultipleReservations(res);
//				} catch (Exception e) {
//					System.out.println(e.getMessage());
//				}
//				
//				System.out.println(event.getReservationsAndTotalSeats());
//				
//				int cancel;
//				
//				System.out.print("how many reservations to cancel?");
//				String userCancel = in.nextLine();
//				cancel = Integer.valueOf(userCancel);
//				
//				try {
//					event.cancelMultipleReservations(cancel);
//					
//				} catch (Exception e) {
//					System.out.println(e.getMessage());
//				}
//				System.out.println(event.getReservationsAndTotalSeats());
//				
//			}
//			else {
//				System.out.println("terminated");
//		}
//			System.out.println(event);
//		
//		
//		
//		in.close();
		
		
		
//		CONCERT MILESTONe3
//		try {
//			Concert concert1 = new Concert("event1", 2023,12,12, 1000,"99.12",12,30);
//			System.out.println(concert1);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
//		milestone 1
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
		
//		BONUS
		
		Concert concert1 = null;
		Event event1 = null;
		Concert concert2 = null;
		Event event2 = null;
		
		try {
			concert1 = new Concert("concert1", 2023, 12, 23, 101, "59.99", 12, 30);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			concert2 = new Concert("concert2", 2023, 12, 23, 500, "200.99", 21, 30);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			event1 = new Event("event1", 2023, 12, 24, 101);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			event2 = new Event("event2", 2023, 12, 24, 101);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		EventProgram prog = new EventProgram("Program1");
		System.out.println(prog.getProgramLength());
		
		prog.addEvent(concert1);
		System.out.println(prog.getProgramLength());
		prog.addEvent(concert2);
		prog.addEvent(event2);
		
		System.out.println(prog.eventsInDate(2023,12,23));
		
//		prog.deleteAllEvents();
		
		prog.printList();
		
	}

}
