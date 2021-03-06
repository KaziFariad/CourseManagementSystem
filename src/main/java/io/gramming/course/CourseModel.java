package io.gramming.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class CourseModel {

    @Id
    private String id;
    private String name;
    private String description;

    public CourseModel() {

    }

    public CourseModel(String id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof CourseModel))
            return false;
        CourseModel courseModel = (CourseModel) o;
        return Objects.equals(this.id, courseModel.id) && Objects.equals(this.name, courseModel.name)
                && Objects.equals(this.description, courseModel.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.description);
    }

    @Override
    public String toString() {
        return "CourseModel{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.description + '\'' + '}';
    }
}

