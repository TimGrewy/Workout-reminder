package dk.tim.workout.dao;

import dk.tim.workout.entity.Workout;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class WorkoutRepository implements PanacheRepository<Workout> {
}
