package com.nt;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PersoonJava3 {

	public static void main(String[] args)throws Exception
	{
		//read inputs
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Date: ");
		String dob=sc.next();
		
		//convert String date value to java.util.Date class obj
		SimpleDateFormat sdfl=new SimpleDateFormat ("dd-mm-yyyy");
		Date udob=sdfl.parse(dob);
		
		//get system date
		Date sysdate=new Date();
		
		//Calculate age
		
		long ms=System.currentTimeMillis()-udob.getTime();
		
		long age=(long)((long)ms/(1000.0*60*60*24*365));
		
		System.out.println("Sidian Kon� : "+age);
	}//main
} //Class	 
