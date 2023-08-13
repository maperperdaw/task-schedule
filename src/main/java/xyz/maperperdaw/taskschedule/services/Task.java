package xyz.maperperdaw.taskschedule.services;


import java.time.Instant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import xyz.maperperdaw.taskschedule.entities.TaskScheduleJpa;
import xyz.maperperdaw.taskschedule.repositories.TaskScheduleRepository;

@PropertySource("classpath:application.properties")
@Service
public class Task implements Runnable{

	private static final Logger logger = LoggerFactory.getLogger(Task.class);

	private TaskScheduleRepository repository;
	
	public Task(TaskScheduleRepository repository) {
		this.repository = repository;
	}
	

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		repository.saveAndFlush(new TaskScheduleJpa(Instant.now(), threadName));
		logger.info("ThreadName saved: " + threadName);
	}

}
