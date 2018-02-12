package ConvertingObjectintoXML;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Service {
	public static void main(String []args) {
		  
		try {
			JAXBContext contextObj = JAXBContext.newInstance(School.class);
			Marshaller marshallerObj = contextObj.createMarshaller();
			  marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			  List<Student> students = new ArrayList<Student>();
			  students.add(new Student(1,"Abdo","go1@gmail.com"));
			  students.add(new Student(2,"kamel","go2@gmail.com"));
			  students.add(new Student(3,"Samir","go5@gmail.com"));
			  students.add(new Student(4,"Soam","go9@gmail.com"));
			  students.add(new Student(5,"Belal","go10@gmail.com"));
			  students.add(new Student(6,"Doa","go541@gmail.com"));
			  School tahrirSchool =  new School(1,"Tahrir","kamel street","tahrir@school.com",students);
			  marshallerObj.marshal(tahrirSchool, new FileOutputStream("School.xml"));  
		} catch (JAXBException e) {
			e.printStackTrace();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	  
	}
	

}
