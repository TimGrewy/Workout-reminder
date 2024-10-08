package dk.tim.workout.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

import java.util.List;


/**
 * Example JPA entity defined as a Panache Entity.
 * An ID field of Long type is provided, if you want to define your own ID field extends <code>PanacheEntityBase</code> instead.
 *
 * This uses the active record pattern, you can also use the repository pattern instead:
 * .
 *
 * Usage (more example on the documentation)
 *
 * {@code
 *     public void doSomething() {
 *         MyEntity entity1 = new MyEntity();
 *         entity1.field = "field-1";
 *         entity1.persist();
 *
 *         List<MyEntity> entities = MyEntity.listAll();
 *     }
 * }
 */
@Entity
public class Workout extends PanacheEntity {
    private String name;
    private List<Integer> notificationHours;

    public Workout() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getNotificationHours() {
        return notificationHours;
    }

    public void addNotificationHours(Integer notificationHour) {
        this.notificationHours.add(notificationHour);
    }

    @Override
    public String toString() {
        return "Workout{" +
                "name='" + name + '\'' +
                ", notificationHours=" + notificationHours +
                '}';
    }
}
