package soap.models.whitetest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Student", propOrder = {
    "id",
    "name",
    "address"
})
public class Student {

    protected int id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected Student.Address address;

   
    public int getId() {
        return id;
    }

   
    public void setId(int value) {
        this.id = value;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String value) {
        this.name = value;
    }

    
    public Student.Address getAddress() {
        return address;
    }

    
    public void setAddress(Student.Address value) {
        this.address = value;
    }


    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "street",
        "city",
        "posteCode"
    })
    public static class Address {

        @XmlElement(required = true)
        protected String street;
        @XmlElement(required = true)
        protected String city;
        @XmlElement(name = "poste-code", required = true)
        protected String posteCode;

        
        public String getStreet() {
            return street;
        }

        
        public void setStreet(String value) {
            this.street = value;
        }

        
        public String getCity() {
            return city;
        }

        
        public void setCity(String value) {
            this.city = value;
        }

        
        public String getPosteCode() {
            return posteCode;
        }

        
        public void setPosteCode(String value) {
            this.posteCode = value;
        }

    }


	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Student() {
		super();
	}
    
    

}
