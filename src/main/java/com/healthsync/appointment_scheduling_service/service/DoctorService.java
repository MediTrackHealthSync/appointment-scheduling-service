package com.healthsync.appointment_scheduling_service.service;

import com.healthsync.appointment_scheduling_service.model.Doctor;

import java.util.List;
import java.util.Optional;

public interface DoctorService {
    List<Doctor> getAllDoctors();
    Doctor createDoctor(Doctor doctor);
    Optional<Doctor> getDoctorById(String id);
    Optional<Doctor> updateDoctor(String id, Doctor doctor);
    void deleteDoctor(String id);
}
