package xyz.maperperdaw.taskschedule;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TaskScheduleApplication {

	private static final Logger logger = LoggerFactory.getLogger(TaskScheduleApplication.class);

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(TaskScheduleApplication.class, args);
//		printLoadedBeans();
	}

	private void printLoadedBeans() {
		Arrays.asList(applicationContext.getBeanDefinitionNames()).forEach(elem -> logger.info(elem));
	}

//	@Override
//	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//		// TODO Auto-generated method stub
//		
//	}

}
