package xyz.maperperdaw.taskschedule.entities;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "logging_tasks", schema = "task_schedule")
public class TaskScheduleJpa {
	
	@Id
	@Column(name = "id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "date")
	private Instant date;
	
	@Column(name = "random_text")
	private String randomText;
	
	public TaskScheduleJpa() {}

	public TaskScheduleJpa(Instant date, String randomText) {
		super();
		this.date = date;
		this.randomText = randomText;
	}

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}

	public String getRandomText() {
		return randomText;
	}

	public void setRandomText(String randomText) {
		this.randomText = randomText;
	}

	
	
}
