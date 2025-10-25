package com.springboot_rest_mysql_app.binding;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "COURSE_DTLS")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cid;
    private String name;
    private Double price;
}
