package Casestudy;

import java.util.Scanner;

public class Casestudy {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in); 
	System.out.println("Enter the num of persons");
	int n=s.nextInt();
	System.out.println("Enter the num of days");
	int d=s.nextInt();
	System.out.println("Enter the tariff per day");
	double t=s.nextInt();
	System.out.println("Enter the Room Type");
	String r=s.next();
	Seasonbook p=new Seasonbook();
	p.book(n, d, t);

	}

}
class Booking{

	
		public void book(int n,int d,double t)
		{
			double set=(double)d*t*n;
		System.out.printf("total:"+set);
	}
	
	
}
class Seasonbook extends Booking
{
}
