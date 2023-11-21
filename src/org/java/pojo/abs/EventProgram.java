package org.java.pojo.abs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EventProgram {
	
	private String title;
	private List <Event> events;
	
	public EventProgram(String title) {
		setEvents();
		setTitle(title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents() {
		this.events =  new ArrayList <>();;
	}
	
	public void addEvent(Event event) {
		getEvents().add(event);
	}
	
	public int getProgramLength() {
		return getEvents().size();
	}
	
	public void deleteAllEvents() {
		getEvents().clear();
	}
	
	public List eventsInDate(int year, int month, int day) {
		LocalDate date = LocalDate.of(year, month, day);
		List <Event> newList = new ArrayList<>();

		 for (int i = 0; i < getProgramLength(); i++) {
			 Event event = getEvents().get(i);

			 if(event.getDate().isEqual(date)) {
	            	newList.add(event);
	            }
	        }
        return newList;
	}
	
	public void printList() {
		
		Collections.sort(getEvents(), Comparator.comparing(Event::getDate));
		System.out.println("Program: " +getTitle());
		
		for (Event event : getEvents()) {
			 System.out.println(event.getFormatDate() + " - " + event.getTitle());
        }
//		for (int i = 0; i < getProgramLength(); i++) {
//			 Event event = getEvents().get(i);
//			 System.out.println(event.getTitle() + " - " + event.getFormatDate());
//	        }
	}
	


	
}
