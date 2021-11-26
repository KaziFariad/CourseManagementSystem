package io.gramming.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<CourseModel> getAllCourses() {
        List<CourseModel> courses = new ArrayList<>();
        courseRepository.findAll().forEach(courses::add);
        return courses;
    };

    public Optional<CourseModel> getCourseById(String courseId){
        return courseRepository.findById(courseId);
    }


    public void addCourse(CourseModel newCourse){
        courseRepository.save(newCourse);
    }

    public void updateCourse(String id, CourseModel course){
        courseRepository.save(course);
        }

    public void deleteCourse(String id){

            courseRepository.deleteById(id);

    };
}
