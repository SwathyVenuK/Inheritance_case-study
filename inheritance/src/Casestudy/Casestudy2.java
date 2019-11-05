package Casestudy;

import java.util.Scanner;

public class Casestudy2 {

	public static void main(String[] args) {

			Scanner s=new Scanner(System.in); 
			System.out.println("Enter the num of persons");
			int n=s.nextInt();
			System.out.println("Enter the num of days");
			int d=s.nextInt();
			System.out.println("Enter the Room Type");
			String r=s.next();
			System.out.println("Enter the month");
			int t=s.nextInt();
			
			System.out.println("Enter the tariff for single person");
			double e=s.nextInt();
			
            Booking1 h=new Booking1();
            double di=h.book1(t);
            Booknnn h1=new Booknnn();
            h1.bookroom(n,d,e,di);
	}
}
class Boo{
	double total=0,tot=0;
	Scanner s=new Scanner(System.in); 
	double book1(int t)
	{
		double discount=0;
		
		if(t==1||t==3||t==7||t==8||t==9||t==10)
		{
			System.out.println("Enter the discount");
			discount=s.nextInt();
		}
		else {
		discount=0;}
		return discount;
		}
	public void bookroom(int n,int d,double e,double di)
	{
	if(di!=0)
	{
		total=n*d*e;
		tot=total-((total)*(di/100));
		System.out.printf("total:%.1f",tot);
	}
	else {
		System.out.println("Enter the peak charge");
	int v=s.nextInt();
	tot=n*d*e*v;
	System.out.printf("total:%.1f",tot);
	}
}

	
}
class  Booking1 extends Boo{
	


}
class  Booknnn extends Boo{
	


}
