package xyz.maperperdaw.taskschedule.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import xyz.maperperdaw.taskschedule.repositories.TaskScheduleRepository;

@Service
@PropertySource("classpath:application.properties")
public class ScheduleTaskRepository {
	
	@Value("${app.thread.name.prefix}")
	private String threadNamePrefix;

	@Autowired
	private ThreadPoolTaskExecutor threadPoolTaskExecutor;
	
	@Autowired
	private TaskScheduleRepository repository;
	
	@Scheduled(cron = "${app.thread.cron.conf}")
	public void executeTask() {
		for (int i = 0; i < 10; i++) {
			threadPoolTaskExecutor.execute(new Task(repository));
		}
			
	}
	
}
