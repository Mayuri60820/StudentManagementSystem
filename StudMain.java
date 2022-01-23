package StudentMangement;

import java.util.HashMap;
import java.util.Map.Entry;

import MultiTheading.BankMangement;

import java.util.Scanner;

public class StudMain extends Thread {
	public void run() {

	}

	HashMap<Integer, EnrollStudent> Map = new HashMap<>();
	EnrollCourse course=new EnrollCourse();
	void addInList() {
		EnrollStudent obj = new EnrollStudent().AddData();
		int flag = 0;

		for (Entry<Integer, EnrollStudent> i : Map.entrySet()) {
			if (i.getKey() == obj.getEnroll_No()) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			Map.put((int) obj.getEnroll_No(), obj);
			System.out.println(Map);

		} else
			System.out.println("member is already registered");
	}
	void Verification() {
		System.out.println("enter enrollment number for verification");
		int num = new  Scanner(System.in).nextInt();//101
		int flag=0;

	for( Entry<Integer, EnrollStudent> i : Map.entrySet()) {
		if(i.getKey() == num){//101
		 flag =1;
		 break;
		}
	}		
		if(flag == 0) {
			System.out.println("Enrollment no. is NOt registered");
		}
		else
		{
		System.out.println("Enrollment no. is registered");
		course.AddCourse();
		//System.out.println(Map1);
		}
	}
	void Payment() {
		System.out.println("enter enrollment number for verification");
		int num = new  Scanner(System.in).nextInt();//101
		int flag=0;

	for( Entry<Integer, EnrollStudent> i : Map.entrySet()) {
		if(i.getKey() == num){//101
		 flag =1;
		 break;
		}
	}		
		if(flag == 0) {
			System.out.println("Enrollment no. is NOt registered");
		}
		else
		{
		System.out.println("Enrollment no. is registered");
		//fee.TotalFee();
		Thread t1 = new Thread() {
			public void run() {
				Fees fee=new Fees();
				fee.TotalFee();
			}

		};
		t1.start();
		synchronized (t1) {
			try {
				t1.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Thread t2 = new Thread() {
			public void run() {
				Fees fee1=new Fees();
				fee1.Instalment();
			}

		};
		t2.start();
		synchronized (t2) {
			try {
				t2.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		StudMain std = new StudMain();
		char choice;
		do {
			System.out.println("1 - Enroll The Student Details");
			System.out.println("2 - Enroll Cource Details of Student");
			System.out.println("3 - Enroll Fees Details of Student");
			System.out.println("0 - Exit");
			int option = scanner.nextInt();

			switch (option) {
			case 1:
				std.addInList();
				break;
			case 2:
				// member.addInList();
				std.Verification();
				break;
			case 3:
				std.Payment();
				break;
			}

			System.out.println("want more operation?(y/n)");
			choice = scanner.next().charAt(0);

		} while (choice == 'Y' || choice == 'y');

		/*
		 * HashMap<Integer,EnrollStudent> Map=new HashMap<>(); EnrollStudent obj = new
		 * EnrollStudent().AddData(); Map.put(obj.getEnroll_No(), obj);
		 * System.out.println(Map);
		 */

	}

}
