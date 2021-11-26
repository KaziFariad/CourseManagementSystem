package io.gramming.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<CourseModel> getAllCourses(){
        return courseService.getAllCourses();
    };

    @GetMapping("/courses/{id}")
    public Optional<CourseModel> getCourseById(@PathVariable("id") String id){
        return courseService.getCourseById(id);
    }

    @PutMapping("/courses/{id}")
    public void updateCourse(@PathVariable("id") String id,@RequestBody CourseModel course){
        courseService.updateCourse(id, course);
    }

    @PostMapping("/courses")
    public void addCourse(@RequestBody CourseModel newCourse){
        courseService.addCourse(newCourse);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable("id") String id){
        courseService.deleteCourse(id);
    }

}
