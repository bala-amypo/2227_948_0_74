// package com.example.demo.repository;
// import com.example.demo.entity.studentEntity;
// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.*;

// public interface studentRepo extends JpaRepository<studentEntity,Long>{
    
// }
package com.example.demo.repository;

import com.example.demo.entity.studentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepo extends JpaRepository<studentEntity, Long> {
}
