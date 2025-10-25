package com.springboot_rest_mysql_app.service;

import com.springboot_rest_mysql_app.binding.Course;
import com.springboot_rest_mysql_app.repo.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public String upsert(Course course) {
        courseRepository.save(course);  //  upsert (save course to a database based on insert / update based on a primary key)
        return "success";
    }

    @Override
    public Course getById(Integer cid) {
        Optional<Course> findById = courseRepository.findById(cid);

        if(findById.isPresent()) {
            return findById.get();
        }
        return null;
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public String deleteById(Integer cid) {
        if(courseRepository.existsById(cid)) {
            courseRepository.deleteById(cid);
            return "Delete Success";
        }
        else {
           return "No Record Found";
        }
    }
}
