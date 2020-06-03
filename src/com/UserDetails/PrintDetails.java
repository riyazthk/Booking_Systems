package com.UserDetails;

import com.Booking.Booking;

public class PrintDetails {
	Booking b=new Booking();
	public void print(String FirstName,String LastName,String Gender,int age,long phNum,int a,int e,String s,int f ) {
		System.out.println(FirstName+" "+LastName+" "+Gender+" "+age+" "+phNum+" "+a+" "+e+" "+s+" "+f);
		System.out.println("Happy journey");
		b.main(null);
		
		
	}

}
