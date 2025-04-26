package com.example.HealthInfoSystem.controller;

import com.example.HealthInfoSystem.Prototype.Patient;
import com.example.HealthInfoSystem.Repository.PatientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    private final PatientRepository patientRepository;

    public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    // 1. Search for a patient by name
    @GetMapping("/search")
    public List<Patient> searchPatients(@RequestParam("name") String name) {
        return patientRepository.findByNameContainingIgnoreCase(name);
    }

    // 2. View a patient's full profile (including programs)
    @GetMapping("/{id}")
    public Optional<Patient> getPatientProfile(@PathVariable Long id) {
        return patientRepository.findById(id);
    }
}
