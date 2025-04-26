package com.example.HealthInfoSystem.Controller.Prototype.Repository;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Program {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @ManyToMany(mappedBy = "programs") // mappedBy = "programs" from Patient.java
    private List<Patient> patients;

    // Getters and setters
}
