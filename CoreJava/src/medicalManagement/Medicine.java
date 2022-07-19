package medicalManagement;

public class Medicine {
	String medicineName;
	int batchID;
	String medicineType;
	float price;
	String expiry;
	
	public void printMedicineDetails() {
		
		System.out.println("Medicice Name is "+medicineName);
		System.out.println("Batch ID is "+batchID);
		System.out.println("Price of Medicine is "+price);
	}

}
