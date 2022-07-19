package libraryManagement;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk1 = new Book();
		bk1.bookName ="Chava";
		bk1.writer="Shivaji Sawant";
		bk1.issuerName ="Prashant";
		bk1.issueDate="3-Jul-2022";
		bk1.issueDays =15;
		bk1.BookDetails();
		//System.out.println(bk1.issuerName+" issue book "+bk1.bookName+" writen by "+bk1.writer+" on "+bk1.issueDate+" for "+bk1.issueDays+" days.");

	}

}
	