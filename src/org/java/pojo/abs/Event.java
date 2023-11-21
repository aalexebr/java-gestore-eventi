package org.java.pojo.abs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Event {
	
	private String title;
	private LocalDate date;
	private int totSeats;
	private int reservedSeats = 0;
	
	public Event(String title, int year,int month, int day, int totSeats) throws Exception{
		setTitle(title);
		setDate(year,month,day);
		setTotSeats(totSeats);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(int year,int month, int day) throws Exception{
		LocalDate today = LocalDate.now();
		LocalDate expectedDate = LocalDate.of(year, month, day);
		if(expectedDate.isBefore(today)) {
			 throw new Exception("Date inserted has passed");
		}
		else {
			this.date = LocalDate.of(year, month, day);
		}
		
	}

	public int getTotSeats() {
		return totSeats;
	}

	private void setTotSeats(int totSeats) {
		this.totSeats = totSeats;
	}

	public int getReservedSeats() {
		return reservedSeats;
	}
	
	
	
	public void reserveSeat() throws Exception{
//		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd ");
//		Date todayDate = new Date();
		LocalDate today = LocalDate.now();
		if(getDate().isAfter(today) || getDate().isEqual(today)) {
			this.reservedSeats++;
			return;
		}
		throw new Exception("The event date has already passed");
	}
	
	public void cancelReservation () throws Exception{
		LocalDate today = LocalDate.now();
		if(getReservedSeats()<=0) {
			throw new Exception("No reservations to cancel");
		}
		if(getDate().isAfter(today) || getDate().isEqual(today) && getReservedSeats()>0) {
			this.reservedSeats--;
			return;
		}
		throw new Exception("The event date has already passed");
	}
	
	public void makeMultipleReservations(int n) throws Exception{
		
		LocalDate today = LocalDate.now();
		if(n>getTotSeats()) {
			throw new Exception("reserving more seats than available");
		}
		if(getDate().isAfter(today) || getDate().isEqual(today)) {
			this.reservedSeats = n;
			return;
		}
		throw new Exception("The event date has already passed");
	}
	
	public void cancelMultipleReservations(int n ) throws Exception{
		LocalDate today = LocalDate.now();
		if(getReservedSeats()<=0) {
			throw new Exception("No reservations to cancel");
		}
		else if(getReservedSeats()<= n) {
			throw new Exception("number of reserved seats is less than the number you are trying to cancel");
		}
		if(getDate().isAfter(today) || getDate().isEqual(today)) {
			this.reservedSeats -= n;
			return;
		}
		throw new Exception("The event date has already passed");
		
	}

	public String getFormatDate() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		Date date = new Date();
//		System.out.println(dateFormat.format(getDate()));
//		return dateFormat.format(getDate());
		
		String pattern = "dd-MM-yyyy";

        // Create a DateTimeFormatter with the desired pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        // Format the LocalDate using the formatter
        String formattedDate = getDate().format(formatter);
        return formattedDate;
	}
	
	public String getReservationsAndTotalSeats() {
		return "tot seats: " +getTotSeats() +"\n"+
				"reserved: "+ getReservedSeats();
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "EVENT \n"+
				"name: "+getTitle()+ "\n"+
				"date: "+ getDate()+ "\n"+
				"tot seats "+getTotSeats()+ "\n"+
				"reserved: "+getReservedSeats() + "\n"+
				"format: " +getFormatDate();
		
	}
	
}
