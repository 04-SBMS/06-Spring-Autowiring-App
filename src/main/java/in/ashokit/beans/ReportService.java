package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	
	@Autowired
	private ReportDao sqlDao;
	
	public void getData() {
		sqlDao.getData();
	}
}
