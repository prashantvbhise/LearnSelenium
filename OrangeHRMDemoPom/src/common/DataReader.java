package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	
		File file= new File("C:\\Users\\Pooja\\SeleniumClass\\OrangeHRMDemoPom\\src\\common\\testDataFile.txt");
		
		FileReader fr= new FileReader(file);
		
		BufferedReader br= new BufferedReader(fr);
		
		String st;
		
		while((st=br.readLine()) !=null) {
		String[] lineArray= st.split(",");
		int noOfRows =lineArray[0].indexOf(st);
		//rows = noOfRows+1;
		
		System.out.println(noOfRows);
		};
		
		/*
		 * File file= new File(
		 * "C:\\Users\\Pooja\\SeleniumClass\\OrangeHRMDemoPom\\src\\common\\testDataFile.txt"
		 * );
		 * 
		 * FileReader fr= new FileReader(file);
		 * 
		 * BufferedReader br= new BufferedReader(fr);
		 * 
		 * String st;
		 */
		
		//int numberOfRows;
		//int numberOfColoum;
		
		//String loginData[][]= new String [numberOfRows][numberOfColoum];
		
		/*String loginData[][]= new String [3][3];
		
		int i=0;
		while((st=br.readLine()) !=null) {			
			//System.out.println(st);
			String[] lineArray= st.split(",");
			loginData[i]=lineArray;
			i= i+1;*/
			//System.out.println(loginData[i][i+1]);
			/*System.out.println(st);
			System.out.println(st.split(",")[0]+" "+st.split(",")[1] +" "+st.split(",")[2]);
			String data= new String(st.split(",")[0]+" "+st.split(",")[1] +" "+st.split(",")[2]);
			int rows= br.readLine().length();
			String[] newdata= new String[rows];
			String[][] nd= new String[rows][];
			System.out.println(newdata);*/
			
		}	
		
		/*
		 * public void getNumberOfRows() {
		 * 
		 * File file= new File(
		 * "C:\\Users\\Pooja\\SeleniumClass\\OrangeHRMDemoPom\\src\\common\\testDataFile.txt"
		 * );
		 * 
		 * FileReader fr= new FileReader(file);
		 * 
		 * BufferedReader br= new BufferedReader(fr);
		 * 
		 * String st;
		 * 
		 * while((st=br.readLine()) !=null) { String[] lineArray= st.split(",");
		 * 
		 * i= i+1;
		 * 
		 * } }
		 */
		//public void getNumberOfColoums() {
			
		//}

	}


