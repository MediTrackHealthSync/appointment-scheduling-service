package com.healthsync.appointment_scheduling_service.service.impl;

import com.healthsync.appointment_scheduling_service.model.Appointment;
import com.healthsync.appointment_scheduling_service.repository.AppointmentRepository;
import com.healthsync.appointment_scheduling_service.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Optional<Appointment> getAppointmentById(String id) {
        return appointmentRepository.findById(id);
    }

    @Override
    public Optional<Appointment> updateAppointment(String id, Appointment updatedAppointment) {
        return appointmentRepository.findById(id).map(appointment -> {
            appointment.setPatientId(updatedAppointment.getPatientId());
            appointment.setDoctorId(updatedAppointment.getDoctorId());
            appointment.setAppointmentDate(updatedAppointment.getAppointmentDate());
            appointment.setStartTime(updatedAppointment.getStartTime());
            appointment.setEndTime(updatedAppointment.getEndTime());
            appointment.setStatus(updatedAppointment.getStatus());
            return appointmentRepository.save(appointment);
        });
    }

    @Override
    public void deleteAppointment(String id) {
        appointmentRepository.deleteById(id);
    }
}
