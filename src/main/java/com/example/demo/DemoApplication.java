package com.example.demo;

import com.example.demo.annotationsaop.AnnotatedTransfer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		ScheduledTransferModule scheduledTransferModule = applicationContext.getBean(ScheduledTransferModule.class);
//		scheduledTransferModule.doSomethingFancy("dummy argument");
		AnnotatedTransfer  annotatedTransfer = applicationContext.getBean(AnnotatedTransfer.class);
		annotatedTransfer.doAnnotatedTransfer();

	}

}
