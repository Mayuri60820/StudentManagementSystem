package StudentMangement;

import java.util.Scanner;

public class EnrollCourse {
	int Course_Id;
	String Course_Name;
	
	public EnrollCourse() {
		super();
		
	}

	public EnrollCourse(int course_Id, String course_Name) {
		super();
		Course_Id = course_Id;
		Course_Name = course_Name;
	}


	@Override
	public String toString() {
		return "EnrollCourse [Course_Id=" + Course_Id + ", Course_Name=" + Course_Name + "]";
	}

	public void AddCourse() {
		Scanner Sc = new Scanner(System.in);
			System.out.println("The Student are Registerd");
			System.out.println("Enter Course Id");
			int Course_Id = Sc.nextInt();
			System.out.println("Enter Cource Name");
			String Course_Name = Sc.next();
		//return new EnrollCourse(Course_Id, Course_Name);
			System.out.println("Student Course ID="  +Course_Id);
			System.out.println("Student Course Name="  +Course_Name);
			
	}

}
