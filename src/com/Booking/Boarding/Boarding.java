package com.Booking.Boarding;

import java.util.Scanner;

import com.Booking.BusDetails.BusDetails;
import com.Booking.BusDetails.CreateBusDetails;
import com.Booking.TrainDetails.CreateTrainDetails;
import com.Booking.TrainDetails.TrainDetails;

public class Boarding
{
	private String DepatureName;
	private String EndingName;
public void Boardingdetails(int n)
{
	String[] a= {"Thanjavur","Chennai","Bangalore","Coimbatore","Trichy","Madurai","Tirunelveli"};
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter depature name:");
	DepatureName=sc.next(); 
	for(int i=0;i<a.length;i++)
	{
		if(a[i].equals(DepatureName))
		{
			break;
		}
		else if(i==a.length-1 && a[i]!=DepatureName)
		{
			System.out.println("Sorry we not provide service for your place");
		}
	}
	System.out.println("Enter Ending name:");
	EndingName=sc.next();
	for(int i=0;i<a.length;i++) {
		if(a[i].equals(EndingName))
		{
			break;
		}
		else if(i==a.length-1 && a[i]!=EndingName)
		{
			System.out.println("Sorry we not provide servicr for your place");
		}
	}
	if(n==1)
	{
		CreateBusDetails bd=new CreateBusDetails();
		bd.BusNames(DepatureName,EndingName,a,n);
	}
	else if(n==2)
	{
			CreateTrainDetails td=new CreateTrainDetails();
			td.TrainNames(DepatureName,EndingName,a,n);
	}
	
}
}
