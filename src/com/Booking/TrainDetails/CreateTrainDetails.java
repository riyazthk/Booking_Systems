package com.Booking.TrainDetails;

import java.util.ArrayList;
import java.util.Scanner;

import com.Booking.Booking;
import com.Booking.BookingDetails;
import com.Booking.Boarding.Boarding;
import com.UserDetails.userDetails;;
public class CreateTrainDetails {
public void TrainNames(String DepatureName,String EndingName,String[] a,int n) {
Boarding b=new Boarding();
	ArrayList<TrainDetails>l=new ArrayList<TrainDetails>();
	l.add(new TrainDetails("Thanjai express",1001));
	l.add(new TrainDetails("tirchy express",1002));
	l.add(new TrainDetails("bangalore express",1003));
	l.add(new TrainDetails("covai express",1004));
	l.add(new TrainDetails("madurai express",1005));
	l.add(new TrainDetails("tirunelveli express",1006));
	l.add(new TrainDetails("mannai express",1007));
	l.add(new TrainDetails("uzavan express",1008));
    l.add(new TrainDetails("pandian express",1009));
	
    Scanner sc=new Scanner(System.in);
    BookingDetails btd=new BookingDetails();
    if(DepatureName .equals(a[0])) {
    	System.out.println("available trains are" + l.get(0) + l.get(6));
        int tno=sc.nextInt();
        if(tno==l.get(0).getTrainNo() || tno==l.get(0).getTrainNo()) {
    	btd.seatCapacity();

        }else {
        	System.out.println("Service not required");
        	b.Boardingdetails(n);
        }
    }else if(DepatureName .equals(a[5])) {
    	System.out.println("available trains are" +l.get(5) + l.get(4));
    	int tno=sc.nextInt();
    	if(tno==l.get(5).getTrainNo() || tno==l.get(4).getTrainNo()) {
    		btd.seatCapacity();
    		}else {
    		System.out.println("Service not required");
    		b.Boardingdetails(n);
    	}
    }else if(DepatureName .equals(a[6])) {
    	System.out.println("available trains are" +l.get(5));
    	int tno=sc.nextInt();
    	if(tno==l.get(5).getTrainNo()) {
    		btd.seatCapacity();
    		}else {
    		System.out.println("Service not required");
    		b.Boardingdetails(n);
    	}
    }else if(DepatureName .equals(a[4])) {
    	System.out.println("available trains are" +l.get(0) + l.get(1) +l.get(4)+l.get(6)+l.get(5));
    	int tno=sc.nextInt();
    	if(tno==l.get(0).getTrainNo() || tno==l.get(1).getTrainNo() || tno==l.get(4).getTrainNo()|| tno==l.get(6).getTrainNo()|| tno==l.get(5).getTrainNo()) {
    		btd.seatCapacity();
    		}else {
    		System.out.println("Service not required");
    		b.Boardingdetails(n);
    	}
    }else if(DepatureName .equals(a[1])) {
    	System.out.println("available trains are" + l.get(7));
    	int tno=sc.nextInt();
    	if(tno==l.get(7).getTrainNo()) {
    		btd.seatCapacity();
    		}else {
    		System.out.println("Service not required");
    		b.Boardingdetails(n);
    	}
    }else if(DepatureName .equals(a[2])) {
    	System.out.println("available trains are" + l.get(8));
    	int tno=sc.nextInt();
    	if(tno==l.get(8 ).getTrainNo()) {
    		btd.seatCapacity();
    		}else {
    		System.out.println("Service not required");
    		b.Boardingdetails(n);
    	}
    }
}
}
