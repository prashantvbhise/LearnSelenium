package libraryManagement;

public class Book {
	String bookName;
	String writer;
	String issuerName;
	String issueDate;
	int issueDays;
	
	public void BookDetails() {
		
		System.out.println("Book Name is "+bookName); 
		System.out.println("Writer Name is "+writer);
		System.out.println("Issuer Namr is "+issuerName);
	}

}
