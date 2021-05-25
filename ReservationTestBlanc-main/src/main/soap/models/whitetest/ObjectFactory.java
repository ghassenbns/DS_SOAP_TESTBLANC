package soap.models.whitetest;

import javax.xml.bind.annotation.XmlRegistry;



@XmlRegistry
public class ObjectFactory {


    public ObjectFactory() {
    }

    
    public Student createStudent() {
        return new Student();
    }

    
    public ExamsRequest createExamsRequest() {
        return new ExamsRequest();
    }

   
    public ExamsResponse createExamsResponse() {
        return new ExamsResponse();
    }

 
    public Exam createExam() {
        return new Exam();
    }

   
    public StudentRequest createStudentRequest() {
        return new StudentRequest();
    }

    
    public WhiteTestResponse createWhiteTestResponse() {
        return new WhiteTestResponse();
    }

    
    public Student.Address createStudentAddress() {
        return new Student.Address();
    }

}
