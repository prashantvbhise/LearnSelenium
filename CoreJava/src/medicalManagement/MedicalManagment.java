package medicalManagement;

public class MedicalManagment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medicine med1= new Medicine();
		med1.medicineName ="Saridon";
		med1.medicineType ="Internal";
		med1.batchID=12343;
		med1.expiry ="July-2024";
		med1.price= 100.50f;
		med1.printMedicineDetails();
		//System.out.println(med1.medicineName +" is of Type "+med1.medicineType+" And Expiry date is "+med1.expiry +" And price is "+med1.price);
		
	}

}
