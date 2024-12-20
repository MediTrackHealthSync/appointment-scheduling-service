package com.healthsync.appointment_scheduling_service.service.impl;

import com.healthsync.appointment_scheduling_service.model.Doctor;
import com.healthsync.appointment_scheduling_service.repository.DoctorRepository;
import com.healthsync.appointment_scheduling_service.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor createDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public Optional<Doctor> getDoctorById(String id) {
        return doctorRepository.findById(id);
    }

    @Override
    public Optional<Doctor> updateDoctor(String id, Doctor updatedDoctor) {
        return doctorRepository.findById(id).map(doctor -> {
            doctor.setDoctorName(updatedDoctor.getDoctorId());
            doctor.setDoctorName(updatedDoctor.getDoctorName());
            doctor.setAvailabilityDate(updatedDoctor.getAvailabilityDate());
            doctor.setDoctorName(updatedDoctor.getSpeciality());
            doctor.setStartTime(updatedDoctor.getStartTime());
            doctor.setEndTime(updatedDoctor.getEndTime());
            return doctorRepository.save(doctor);
        });
    }

    @Override
    public void deleteDoctor(String id) {
        doctorRepository.deleteById(id);
    }
}
