package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class KillProcess {

	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

		String path="C:\\Users\\Pooja\\SeleniumClass\\OrangeHRMDemoPom\\books.xml";

		File file = new File(path);

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

		DocumentBuilder db = dbf.newDocumentBuilder();

		Document doc = db.parse(file);  

		doc.getDocumentElement().normalize();

		System.out.println("Root element name is: " + doc.getDocumentElement().getNodeName()); 
		
		NodeList nodeList = doc.getElementsByTagName("book"); 
		 
		 for (int i = 0; i< nodeList.getLength(); i++)   
		 {  
		    Node node = nodeList.item(i);  
		    System.out.println("\n"+"("+i+")" +" book Node Name :" + node.getNodeName());  
		    if (node.getNodeType() == Node.ELEMENT_NODE)   
		    {  
		       Element element = (Element) node;  
		       System.out.println("book id: "+ element.getElementsByTagName("book id").item(0).getTextContent());  
		       System.out.println("author Name: "+ element.getElementsByTagName("author").item(0).getTextContent());  
		       System.out.println("title Name: "+ element.getElementsByTagName("title").item(0).getTextContent());  
		       System.out.println("genre: "+ element.getElementsByTagName("genre").item(0).getTextContent());  
		       System.out.println("Book Price: "+ element.getElementsByTagName("price").item(0).getTextContent());
		 
		    }  

	}


}

}
