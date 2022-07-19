package schoolManagementSystem;

public class Student {
	int rollNumber;
	int age;
	String firstName;
	String lastName;
	String fatherName;
	String className;
	String Address;

	public void printStudentDetails(String city) 
	{

		city="Pune";
		System.out.println("First Name is "+firstName);
		System.out.println("Last Name is "+lastName);
		System.out.println("Father Name is "+fatherName);
		System.out.println("Class is "+className);
		System.out.println("City is "+city);
	}

}
