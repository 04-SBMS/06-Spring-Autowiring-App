package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.beans.ReportService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cxt = new AnnotationConfigApplicationContext(AutoConfig.class);
		ReportService reportService = cxt.getBean(ReportService.class);
		reportService.getData();
	}

}
