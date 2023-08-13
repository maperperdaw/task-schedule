package xyz.maperperdaw.taskschedule.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@PropertySource("classpath:application.properties")
@Configuration
public class ThreadPoolConfig {
	
	@Value("${app.core.pool.size}")
	private int corePoolSize;
	
	@Value("${app.max.pool.size}")
	private int maxPoolSize;
	
	@Value("${app.queue.capacity}")
	private int queueCapacity;


	
	@Bean(name = "threadPoolTaskExecutor")
	public ThreadPoolTaskExecutor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(corePoolSize);
        executor.setMaxPoolSize(maxPoolSize);
        executor.setQueueCapacity(queueCapacity);
        executor.initialize();
        return executor;
	}
}
