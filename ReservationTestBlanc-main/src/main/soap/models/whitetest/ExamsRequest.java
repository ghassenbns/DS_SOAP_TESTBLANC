

package soap.models.whitetest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listExams"
})
@XmlRootElement(name = "ExamsRequest")
public class ExamsRequest {

    @XmlElement(name = "ListExams")
    protected boolean listExams;

    
    public boolean isListExams() {
        return listExams;
    }

    
    public void setListExams(boolean value) {
        this.listExams = value;
    }

}
