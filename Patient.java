package com.example.HealthInfoSystem.Controller.Prototype.Repository;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String gender;
    private String email;

    @ManyToMany
    @JoinTable(
            name = "patient_program", // The join table
            joinColumns = @JoinColumn(name = "patient_id"), // this entity's column
            inverseJoinColumns = @JoinColumn(name = "program_id") // the other entity's column
    )
    private List<Program> programs;

    // Getters and setters
}
