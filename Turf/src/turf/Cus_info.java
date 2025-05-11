package turf;

import java.util.Scanner;

public class Cus_info {
	String Cname;
	String Mob;
	
	
	public  void Cus_Add() throws Exception {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		Cname = s.nextLine();
		
		System.out.println("Enter ur Moblie no:");
		Mob = s.nextLine();
		
		CusDAO.insert(this);
	}
}
