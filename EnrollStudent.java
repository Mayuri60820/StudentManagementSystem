package StudentMangement;

import java.util.Scanner;

public class EnrollStudent {
	long Enroll_No;
	String Name;
	String Contact;
	String Email;
	String Address;

	public EnrollStudent(long enroll_No, String name, String contact, String email, String address) {
		super();
		this.Enroll_No = enroll_No;
		this.Name = name;
		this.Contact = contact;
		this.Email = email;
		this.Address = address;
	}

	public long getEnroll_No() {
		return Enroll_No = (long) (Math.random() * 10000);
	}

	public void setEnroll_No(int enroll_No) {
		Enroll_No = enroll_No;
	}

	public EnrollStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EnrollStudent(long enroll_No) {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EnrollStudent [Enroll_No=" + Enroll_No + ", Name=" + Name + ", Contact=" + Contact + ", Email=" + Email
				+ ", Address=" + Address + "]";
	}

	public EnrollStudent AddData() {
		Scanner Scan = new Scanner(System.in);
		// System.out.println("Enter Student Enrollment Number");
		// long Enroll_No=(long) (Math.random()*100000);
		System.out.println("Enter Student Name");
		String Name = Scan.next();
		System.out.println("Enter Student Contact Number");
		String Contact = Scan.next();
		System.out.println("Enter Student Mail Id");
		String Email = Scan.next();
		System.out.println("Enter Student Address");
		String Address = Scan.next();
		return new EnrollStudent(Enroll_No, Name, Contact, Email, Address);

	}

}
