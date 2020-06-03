package com.Booking;

import java.util.Scanner;

import com.Booking.Bus.Bus;
import com.Booking.Train.Train;

public class Booking {
public static void main(String arg[]) {
	Scanner sc=new Scanner(System.in);
	 System.out.println("1.BUS 2.TRAIN 3.exit"); 
	 int n=sc.nextInt();
	 switch(n) {
	 case 1:
		Bus b=new Bus();
		b.Busterminal(n);
		 break;
	 case 2:
		 Train t=new Train();
		 t.Trainterminal(n);
		 break;
	 case 3:
		 System.out.println("Thank You!!!");
		 break;
	 }
}
}