package com.kvtsoft.batchdemo.processor;

import com.kvtsoft.batchdemo.domain.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student, Student> {


    @Override
    public Student process(Student student) throws Exception {
        return student;
    }
}
