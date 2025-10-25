package com.springboot_rest_mysql_app.repo;

import com.springboot_rest_mysql_app.binding.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.io.Serializable;

@Repository
public interface CourseRepository extends JpaRepository<Course, Serializable> {
}
