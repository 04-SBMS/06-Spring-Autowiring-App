package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("sqlDao")
public class MySQLReport implements ReportDao{

	public void getData() {
		System.out.println("MySQL DB Report Data");
		
	}
	
}
