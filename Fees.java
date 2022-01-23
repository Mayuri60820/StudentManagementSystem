package StudentMangement;

import java.util.Scanner;

public class Fees {
      double Totalfees=80000;
      String date;
      Scanner Scan=new Scanner(System.in);
	public Fees(int totalfees, String date) {
		super();
		Totalfees = totalfees;
		this.date = date;
	}
	public Fees() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Fees [Totalfees=" + Totalfees + ", date=" + date + "]";
	}
      void TotalFee()
      {
    	  synchronized (this) {
    	  System.out.println("Course total fees:"+Totalfees);
    	  this.notify();
    	  }
    	  
      }
      void Instalment()
      {  synchronized(this) {
    	  System.out.println("Enter date");
           date=Scan.next();
    	   System.out.println("Enter amount of fees payment");
    	   int amount=Scan.nextInt();
    	   Totalfees=Totalfees-amount;
    	   System.out.println("Remaining Fees"+Totalfees);
    	   
    	   this.notify();
      }
      }
      
      
}
