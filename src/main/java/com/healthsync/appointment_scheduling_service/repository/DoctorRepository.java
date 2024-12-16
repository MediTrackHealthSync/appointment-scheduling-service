package com.healthsync.appointment_scheduling_service.repository;

import com.healthsync.appointment_scheduling_service.model.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends MongoRepository<Doctor, String> {
}
