package DS_WS.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import DS_WS.service.ExamsListService;
import DS_WS.service.WhiteTestService;
import soap.models.whitetest.Exam;
import soap.models.whitetest.ExamsRequest;
import soap.models.whitetest.ExamsResponse;
import soap.models.whitetest.StudentRequest;

import java.util.List;


@Endpoint
public class ExamsListEndPoint {

	public static final String nameSpace = "http://www.tekup.de/soap/models/whitetest";
	
	@Autowired
	private ExamsListService service;
	
	@PayloadRoot(namespace = nameSpace, localPart = "ExamsRequest")
	@ResponsePayload
	public ExamsResponse getExams(@RequestPayload ExamsRequest examsRequest)
	{
		return service.examsList(examsRequest);
	}

}
