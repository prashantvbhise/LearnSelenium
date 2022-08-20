package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadData1 {

	public static void main(String[] args) throws IOException {
		File file= new File("C:\\Users\\Pooja\\SeleniumClass\\OrangeHRMDemoPom\\src\\common\\testDataFile.txt");
		
		FileReader fr= new FileReader(file);
		
		BufferedReader br= new BufferedReader(fr);
		
		String st;
		
		int numberOfRows = getNumberOfRows();
		int numberOfColoum = getNumberOfColoumns();
				
		String loginData[][]= new String [numberOfRows][numberOfColoum];
		int i=0;			
		while((st=br.readLine()) !=null) {
			String[] lineArray= st.split(",");
			loginData[i]=lineArray;
			i=i+1;
		}	
	}

	private static int getNumberOfRows() throws IOException {
		int rows =0;
		
		File file= new File("C:\\Users\\Pooja\\SeleniumClass\\OrangeHRMDemoPom\\src\\common\\testDataFile.txt");
		
		FileReader fr= new FileReader(file);
		
		BufferedReader br= new BufferedReader(fr);
		
		String st;
		while((st=br.readLine()) !=null) {
			
			String[] lineArray= st.split(",");
			rows=rows+1;		
			/*
			 * // for (int i = 0; i < lineArray.length; i++) { // rows++; // } // String[]
			 * lineArray= st.split(","); // String[] a=lineArray; // int noOfRows =a.length;
			 * // rows = noOfRows; // break;
			 */		}return rows;
		
			
	}

	private static int getNumberOfColoumns() throws IOException {
		int columns =0;
		
		File file= new File("C:\\Users\\Pooja\\SeleniumClass\\OrangeHRMDemoPom\\src\\common\\testDataFile.txt");
		
		FileReader fr= new FileReader(file);
		
		BufferedReader br= new BufferedReader(fr);
		
		String st;
		
		while((st=br.readLine()) !=null) {
		String[] lineArray= st.split(",");
		int noOfColumns =lineArray.length;
		columns = noOfColumns;
		break;
		}return columns;
	}

}
