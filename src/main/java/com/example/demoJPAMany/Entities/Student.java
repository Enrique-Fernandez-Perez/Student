package com.example.demoJPAMany.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private Date fecha_entrada;
    private String ciudad;
    private Date horas_semanales;
    private String especialidad;
    private String estado;


}
