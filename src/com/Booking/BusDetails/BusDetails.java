package com.Booking.BusDetails;
import java.util.ArrayList;

import com.Booking.Boarding.*;
public class BusDetails {
	private String BusName;
	private int BusNo;
public BusDetails(String BusName,int BusNo){
	this.BusName=BusName;
	this.BusNo=BusNo;
}
public String getBusName() {
	return BusName;
}
public void setBusName(String busName) {
	BusName = busName;
}
public int getBusNo() {
	return BusNo;
}
public void setBusNo(int busNo) {
	BusNo = busNo;
}
public String toString() {
	return BusName +" "+BusNo ;
}
}
