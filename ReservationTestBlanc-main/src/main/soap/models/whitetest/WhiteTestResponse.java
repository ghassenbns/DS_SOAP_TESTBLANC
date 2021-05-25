package soap.models.whitetest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "student",
    "exam",
    "date"
})
@XmlRootElement(name = "WhiteTestResponse")
public class WhiteTestResponse {

    @XmlElement(required = true)
    protected Student student;
    @XmlElement(required = true)
    protected Exam exam;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;

    
    public Student getStudent() {
        return student;
    }

    
    public void setStudent(Student value) {
        this.student = value;
    }

    
    public Exam getExam() {
        return exam;
    }

    
    public void setExam(Exam value) {
        this.exam = value;
    }

    
    public XMLGregorianCalendar getDate() {
        return date;
    }

    
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

}
