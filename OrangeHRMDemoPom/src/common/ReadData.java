
  package common;
  
  import java.io.File; import java.io.FileNotFoundException; import
  java.util.Scanner;
  
  public class ReadData {
  
  public static void main(String[] args) {
  
  File myFile= new File("C:\\Users\\Pooja\\Desktop\\Downloads\\TestFile.txt");
  
  try (Scanner myScanner = new Scanner(myFile)) { myScanner.hasNextLine();
  if(myScanner.hasNextLine()==true) { System.out.println(myScanner.nextLine());
  } } catch (FileNotFoundException e) { // TODO Auto-generated catch block
  e.printStackTrace(); }
  
  
  try (Scanner myScanner = new Scanner(myFile)) { String Text=
  myScanner.nextLine(); System.out.println(Text); } catch
  (FileNotFoundException e) { // TODO Auto-generated catch block
  e.printStackTrace(); }
  
  
  }
  
  
  }
  
 