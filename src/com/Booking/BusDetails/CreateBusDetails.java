package com.Booking.BusDetails;

import java.util.ArrayList;
import java.util.Scanner;

import com.Booking.BookingDetails;
import com.Booking.Boarding.Boarding;

public class CreateBusDetails {
public void BusNames(String DepatureName,String EndingName,String[] a,int n) {
	Scanner sc=new Scanner(System.in);
	BusDetails bd1=new BusDetails("Volvo",101);
	BusDetails bd2=new BusDetails("Scania",102);
	BusDetails bd3=new BusDetails("benz",103);
	BusDetails bd4=new BusDetails("bmw",104);
	BusDetails bd5=new BusDetails("audi",105);
	BusDetails bd6=new BusDetails("ashok leyland",106);
	BusDetails bd7=new BusDetails("Bharat Benz",107);
	BusDetails bd8=new BusDetails("Volvo1",108);
	BusDetails bd9=new BusDetails("Volvo2",109);
	ArrayList<BusDetails>al=new ArrayList<BusDetails>();
	al.add(bd1);
	al.add(bd2);
	al.add(bd3);
	al.add(bd4);
	al.add(bd5);
	al.add(bd6);
	al.add(bd7);
	al.add(bd8);
	al.add(bd9);
	for(BusDetails b:al) {
		
	}
BookingDetails btd=new BookingDetails();
Boarding b=new Boarding();

if(DepatureName .equals(a[0])) {
	System.out.println("available buses are" + al.get(0) + al.get(1));
	 int bno=sc.nextInt();
     if(bno==al.get(0).getBusNo() || bno==al.get(1).getBusNo()) {
 	btd.seatCapacity();

     }else {
     	System.out.println("Service not required");
     	b.Boardingdetails(n);
     }
}
if(DepatureName .equals(a[1])) {
	System.out.println("available buses are" + al.get(2) + al.get(3));
	 int bno=sc.nextInt();
     if(bno==al.get(2).getBusNo() || bno==al.get(3).getBusNo()) {
 	btd.seatCapacity();

     }else {
     	System.out.println("Service not required");
     	b.Boardingdetails(n);
     }
}if(DepatureName .equals(a[2])) {
	System.out.println("available buses are" + al.get(4));
	 int bno=sc.nextInt();
    if(bno==al.get(4).getBusNo()) {
	btd.seatCapacity();

    }else {
    	System.out.println("Service not required");
    	b.Boardingdetails(n);
    }
}if(DepatureName .equals(a[3])) {
	System.out.println("available buses are" + al.get(4) + al.get(5));
	 int bno=sc.nextInt();
    if(bno==al.get(4).getBusNo() || bno==al.get(5).getBusNo()) {
	btd.seatCapacity();

    }else {
    	System.out.println("Service not required");
    	b.Boardingdetails(n);
    }
}if(DepatureName .equals(a[4])) {
	System.out.println("available buses are" + al.get(6));
	 int bno=sc.nextInt();
    if(bno==al.get(6).getBusNo()) {
	btd.seatCapacity();

    }else {
    	System.out.println("Service not required");
    	b.Boardingdetails(n);
    }
}	
} 
}
