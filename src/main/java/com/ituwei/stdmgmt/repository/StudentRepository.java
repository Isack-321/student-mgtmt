package com.ituwei.stdmgmt.repository;

import com.ituwei.stdmgmt.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;



public interface StudentRepository extends JpaRepository<Student, Long>{

}