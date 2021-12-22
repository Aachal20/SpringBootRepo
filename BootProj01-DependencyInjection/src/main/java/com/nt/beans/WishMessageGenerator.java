package com.nt.beans;

import java.time.LocalDateTime;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private Calendar calander;
	//b.method
	public  String generateWishMessage(String user) {
		//get current hour of the day
		int hour= calander.get(calander.HOUR_OF_DAY);
		//GENERATE WISH MESSAGE
		if(hour<12)
			return "Good Morning:::::" +user;
		else if(hour<16)
			return "Good Afternoon:::::" +user;
		else if(hour<20)
			return "Good Evening:::::" +user;
		else
			return "Good Night::::" +user; 


	}
}
