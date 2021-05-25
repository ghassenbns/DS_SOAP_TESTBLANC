

package soap.models.whitetest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "exam"
})
@XmlRootElement(name = "ExamsResponse")
public class ExamsResponse {

    @XmlElement(required = true)
    protected List<Exam> exam;

   
    public List<Exam> getExam() {
        if (exam == null) {
            exam = new ArrayList<Exam>();
        }
        return this.exam;
    }

	public void setExam(List<Exam> exam) {
		this.exam = exam;
	}
    
    

}
