package com.example.demo.service;

import com.example.demo.entity.studentEntity;

public interface studentService {
    List<studentEntity> getAll();

    String updateStudent(Long id, studentEntity newstu);

}
