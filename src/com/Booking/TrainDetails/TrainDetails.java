package com.Booking.TrainDetails;

import java.util.ArrayList;

public class TrainDetails {
	private String trainname;
	private int trainNo;
	
	public TrainDetails(String Trainname,int Trainno) {
		this.trainname=Trainname;
		this.trainNo=Trainno;
	}
	
	
    
	public String getTrainname() {
		return trainname;
	}



	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}



	public int getTrainNo() {
		return trainNo;
	}



	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
public String toString() {
	return "[TrainName=" + trainname + "TrainNo=" + trainNo +"]";
}

	
	
	
}
