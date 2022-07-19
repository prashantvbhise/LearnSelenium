package schoolManagementSystem;

public class SchoolManagement {

	public static void main(String[] args) {
// TODO Auto-generated method stub
//		int a;
//		a=10;
//		int b =20;
//		System.out.println("Primitive data type value - "+a);
//		System.out.println("Primitive data type value - "+b);
		
		Student std1= new Student();
		std1.firstName ="Prashant";
		std1.fatherName="Vishnupant";
		std1.lastName="Bhise";
		std1.className= "1st";
		std1.age = 35;
		std1.printStudentDetails("Akola");
		//System.out.println("Derived Data Type Value -"+std1.firstName +" "+std1.fatherName+ " "+std1.lastName);
		
		Student std2= new Student();
		std2.firstName ="Prathamesh";
		std2.fatherName="Prashant";
		std2.lastName="Bhise";
		std2.className= "1st";
		std2.age = 4;
		std2.printStudentDetails("Amaravti");
		//System.out.println("Derived Data Type Value -"+std2.firstName +" "+std2.fatherName+ " "+std2.lastName);

	}

}
