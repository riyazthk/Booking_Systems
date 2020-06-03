
package com.UserDetails;

import java.util.Scanner;

public class userDetails {
	int age;
	String Gender,FirstName,LastName;
	long phNum;
public void userDetail(int a,int e,String s,int f){
	int n=0;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter First Name");
     FirstName=sc.next();
	System.out.println("Enter Last Name");
	LastName=sc.next();
	System.out.println("Enter a gender");
	for(int i=0;i<1;i++) {
	System.out.println("1.Male 2.Female");
	n=sc.nextInt();
	if(n>2 && n==0) {
		System.out.println("invalid number");
		i=0;
	}else {
		break;
	}
	}
	switch(n) {
	case 1:
		Gender="Male";
		break;
	case 2:
		Gender="Female";
		break;
	}
	System.out.println("Enter a age");
	age=sc.nextInt();
	System.out.println("Enter a phone number");
	for(int i=0;i<1;i++) {
		 phNum=sc.nextLong();
	  String d=Long.toString(phNum);
	 long[] c=new long[d.length()];
	  if(c.length>10 && c.length<10) {
		  System.out.println("invalid phone number");
		 i=0;
	  }
	}
	PrintDetails pd=new PrintDetails();
	pd.print(FirstName,LastName,Gender,age,phNum,a,e,s,f);
}
}
