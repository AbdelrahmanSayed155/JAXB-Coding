package ConvertingObjectintoXML;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class School {
	
	private int id;
	private String name;
	private String address;
	private String email;
	private List<Student> students;
	
	public School(){
		
	}
	
    public School(int id,String name,String address,String email,List<Student> students){
		this.id =id;
		this.name= name;
		this.address = address;
		this.email =email;
		this.students = students;
	}
    @XmlAttribute 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@XmlElement
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@XmlElement
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
