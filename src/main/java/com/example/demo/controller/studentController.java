
package com.example.demo.controller;
import org.springframwork.web.bind
import com.example.demo.entity.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController; 
import java.util.List;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class studentController {


@Autowired
studentService service;

@GetMapping("/getAllStudent")l
public List<studentEntity> getAll(){
      return service.getAll();
   }
  
  @PostMapping("/add")
  public studentEntity addStudent(@Valid @Requestody studentEntity student){
    return service.addStudent(student);
  }
}