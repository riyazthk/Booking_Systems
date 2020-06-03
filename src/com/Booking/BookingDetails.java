package com.Booking;
import java.util.Scanner;

import com.Booking.Others.seatCapacity;
import com.UserDetails.PrintDetails;
import com.UserDetails.userDetails;

public class BookingDetails implements seatCapacity {

    	PrintDetails pd =new PrintDetails();
		int n=10,e=0,a=0,f;
		String s;
		Scanner sc=new Scanner(System.in);
		userDetails ud=new userDetails();
	     public void seatCapacity() {
	    	 System.out.println("booked your seat");
	    	 a=sc.nextInt();
	    	 
	    	 n-=a;
	    	 System.out.println("available seats are" + n);
	    	 System.out.println("1.continue booking 2.next");
	    	 int d=sc.nextInt();
	    	 switch(d) {
	    	 case 1:
	    		 seatCapacity();
	    	 case 2:
	    		 acNonAc();
	    	 }
	    		 
	     }
	     public void acNonAc() {
	    	 System.out.println("1.AC 2.Non-AC");
	    	  e=sc.nextInt();
	    	 switch(e) {
	    	 case 1:
	    		 ticketFare();
	    	 case 2:
	    		 ticketFare();
	    	 }
	    	 
	     }
	     public void ticketFare() {
	    	 if(e==1) {
	    		 System.out.println("per head fare is 800");
	    		  f=a*800;
	    		  s="AC";
	    		 System.out.println(f);
	    		
	    	 }else if(e==2) {
	    		 System.out.println("per head fare is 500");
	    		  f=a*500;
	    		  s="Non-AC";
	    		 System.out.println(f);
	    	 }ud.userDetail(a,e,s,f);    	   
	     }
		
	}


