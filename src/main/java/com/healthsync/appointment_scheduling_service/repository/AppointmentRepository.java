package com.healthsync.appointment_scheduling_service.repository;

import com.healthsync.appointment_scheduling_service.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment, String> {
}
