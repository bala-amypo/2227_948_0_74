package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.*;
import com.example.demo.service.repository.*;
import com.example.demo.service.*;
import java.util.*;

@Service
public class studentServiceImpl implements studentService {
    

    @Autowired
    studentRepo repo;
    
    @Override
    public List<studentEntity> getAll() {
        return repo.findAll();
    }

//     @Override
//     public studentEntity addStudent(studentEntity stu) {
//    return repo.save(stu);
//     }

//    @Override
//    public studentEntity addStudent(studentEntity stu) {
//    return repo.save(stu);
//    }

//    @Override
//    public studentEntity getById(@PathVariable Long id){
//     Optional<studentEntity> data = repo.findById(id);
//        if(data.isPresent()){
//          return data.get();
//        }else{
//             return null;
//              }
//             }

//    @Override
//    public String updateStudent(Long id, studentEntity newstu) {
//    if(repo.existsById(id)){
//    newstu.setId(id);
//          repo.save(newstu);
//          return "Student updated";
//    }
  
//    return "Student not found"
// } 

//    @Override
//    public String deleteStudent(long id){
//     if(repo.existsById(id)){
//         repo.deleteById(id);
//         return "Student deleted";
//     }
   
//     return "Student not found";
// }
   }