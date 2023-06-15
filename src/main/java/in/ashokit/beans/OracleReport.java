package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("Dao")
public class OracleReport implements ReportDao{

	public void getData() {
		System.out.println("Oracle DB Report Data");
		
	}

}
