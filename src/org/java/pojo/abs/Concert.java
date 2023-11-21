package org.java.pojo.abs;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalTime;

public class Concert extends Event{
	
	private LocalTime time;
	private BigDecimal price;

	public Concert(String title, int year, int month, int day, int totSeats, String price, int hour, int min) throws Exception {
		super(title, year, month, day, totSeats);
		setTime(hour, min);
		setPrice(price);
		
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(int hour, int min) {
		LocalTime n = LocalTime.of(hour, min, 00);
		this.time = n;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(String price) {
		BigDecimal n = new BigDecimal(price);
		this.price = n;
	}
	
	public String getFormatPrice() {
		DecimalFormat decimalFormat = new DecimalFormat("##,##0.00£");
		String formattedPrice = decimalFormat.format(getPrice());
		return formattedPrice;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString()+
//				"time: " + getTime()+"\n"+
//				"price: " + getPrice();
		
		return "EVENT \n"+
		"name: "+ getTitle() + "\n"+
		"date: "+ getFormatDate() + " at "+getTime()+ "\n"+
		"price: "+ getFormatPrice()+ "\n";
	}
	
	

}
