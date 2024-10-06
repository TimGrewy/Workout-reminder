package dk.tim.workout.api;

import dk.tim.workout.dao.WorkoutRepository;
import dk.tim.workout.entity.Workout;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/workouts")
public class WorkoutResource {

    @Inject
    WorkoutRepository workoutRepository;

    // Get all workouts
    @GET
    public List<Workout> getAll() {
        return workoutRepository.listAll();
    }

    // Create a new workout
    @POST
    @Transactional
    public Response create(Workout workout) {
        workoutRepository.persist(workout);
        return Response.status(Response.Status.CREATED).entity(workout).build();
    }
}
