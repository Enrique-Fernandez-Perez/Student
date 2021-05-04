package com.example.demoJPAMany.Controllers;

import com.example.demoJPAMany.Entities.Student;
import com.example.demoJPAMany.Interfaces.IPersistencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class StudentController{

    @Autowired
    IPersistencia iPersistencia;

    public List<Student> mostrarStudentsa(){
        return iPersistencia.findAll();
    }

    public ResponseEntity crearStudent(Student student){
        try{
            if(iPersistencia.findById(student.getId())!=null){
                iPersistencia.save(student);
                return ResponseEntity.ok().build();
            }else{
                return ResponseEntity.badRequest().build();
            }
        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
    }


    @GetMapping("/mostrar")
    public String mostrarStudents(){
        return "hola mundo";
    }

}
