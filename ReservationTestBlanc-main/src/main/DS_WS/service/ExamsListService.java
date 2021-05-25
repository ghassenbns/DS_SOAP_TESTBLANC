package DS_WS.service;

import org.springframework.stereotype.Service;
import soap.models.whitetest.Exam;
import soap.models.whitetest.ExamsRequest;
import soap.models.whitetest.ExamsResponse;
import soap.models.whitetest.ObjectFactory;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExamsListService {
	public  List<Exam> AvailableExams = new ArrayList<Exam>();
	
	public ExamsResponse examsList(ExamsRequest examRequest)
	{
		AvailableExams.add(new Exam("code_OCA","OCA"));
		AvailableExams.add(new Exam("code_OCP","OCP"));
		ExamsResponse response = new ObjectFactory().createExamsResponse();
		if (examRequest.isListExams())
		{
			System.out.println("--------------------------- am here --------------------------------------");

			response.setExam(AvailableExams);
		}
		return response;
	}
}
