
package soap.models.whitetest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exam", propOrder = {
    "code",
    "name"
})
public class Exam {

    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String name;


    public String getCode() {
        return code;
    }

    
    public void setCode(String value) {
        this.code = value;
    }

   
    public String getName() {
        return name;
    }

    
    public void setName(String value) {
        this.name = value;
    }

	public Exam(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public Exam() {
		super();
	}

}
