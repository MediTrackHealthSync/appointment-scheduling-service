package com.healthsync.appointment_scheduling_service.service;

import com.healthsync.appointment_scheduling_service.model.Appointment;

import java.util.List;
import java.util.Optional;

public interface AppointmentService {
    List<Appointment> getAllAppointments();
    Appointment createAppointment(Appointment appointment);
    Optional<Appointment> getAppointmentById(String id);
    Optional<Appointment> updateAppointment(String id, Appointment appointment);
    void deleteAppointment(String id);
}
