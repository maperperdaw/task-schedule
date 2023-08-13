package xyz.maperperdaw.taskschedule.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import xyz.maperperdaw.taskschedule.entities.TaskScheduleJpa;

@Service
public interface TaskScheduleRepository extends JpaRepository<TaskScheduleJpa, Integer>{

}
