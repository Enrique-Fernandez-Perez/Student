package com.example.demoJPAMany.Interfaces;

import com.example.demoJPAMany.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersistencia extends JpaRepository<Student, Integer> {
}
