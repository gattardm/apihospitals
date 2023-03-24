package org.medhead.emergencysystem.apihospitals.service;

import java.util.Optional;

import org.medhead.emergencysystem.apihospitals.model.Hospital;
import org.medhead.emergencysystem.apihospitals.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;


@Data
@Service
public class HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    public Optional<Hospital> getHospital(final Long id) { return hospitalRepository.findById(id); }

    public Iterable<Hospital> getHospitals() { return hospitalRepository.findAll(); }

    public void deleteHospital(final Long id) { hospitalRepository.deleteById(id); }

    public Hospital saveHospital(Hospital hospital) {
        Hospital savedHospital = hospitalRepository.save(hospital);
        return savedHospital;
    }

}