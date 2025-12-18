
// package com.example.demo.controller;
// import org.springframwork.web.bind;
// import com.example.demo.entity.*;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController; 
// import java.util.List;
// import jakarta.validation.Valid;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;


// @RestController
// public class studentController {


// @Autowired
// studentService service;

// @GetMapping("/getAllStudent")l
// public List<studentEntity> getAll(){
//       return service.getAll();
//    }
  
//   @PostMapping("/add")
//   public studentEntity addStudent(@Valid @Requestody studentEntity student){
//     return service.addStudent(student);
//   }
// }

package com.example.demo.controller;

import com.example.demo.entity.studentEntity;
import com.example.demo.service.studentService;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class studentController {

    @Autowired
    studentService service;

    @GetMapping("/getAllStudent")
    public List<studentEntity> getAll() {
        return service.getAll();
    }

    @PostMapping("/add")
    public studentEntity addStudent(
            @Valid @RequestBody studentEntity student) {
        return service.addStudent(student);
    }

    @GetMapping("/get/{id}")
    public studentEntity getStudentById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/update/{id}")
    public String updateStudent(
            @PathVariable Long id,
            @RequestBody studentEntity student) {
        return service.updateStudent(id, student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable long id) {
        return service.deleteStudent(id);
    }
}
