package com.kvtsoft.batchdemo.repository;

import com.kvtsoft.batchdemo.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
