package org.medhead.emergencysystem.apihospitals.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.medhead.emergencysystem.apihospitals.model.Hospital;
import org.medhead.emergencysystem.apihospitals.service.HospitalService;

@RestController
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    /**
     * Create - Add a new hospital
     *
     * @param hospital An object hospital
     * @return The hospital object saved
     */
    @PostMapping("/hospital")
    public Hospital createHospital(@RequestBody Hospital hospital) {
        return hospitalService.saveHospital(hospital);
    }

    /**
     * Read - Get one hospital
     *
     * @param id The id of the hospital
     * @return A Hospital object fulfilled
     */
    @GetMapping("/hospital/{id}")
    public Hospital getHospital(@PathVariable("id") final Long id) {
        Optional<Hospital> hospital = hospitalService.getHospital(id);
        if (hospital.isPresent()) {
            return hospital.get();
        } else {
            return null;
        }
    }

    /**
     * Read - Get all hospitals
     *
     * @return - An Iterable object of Hospital fulfilled
     */
    @GetMapping("/hospitals")
    public Iterable<Hospital> getHospitals() {
        return hospitalService.getHospitals();
    }

    /**
     * Update - Update an existing hospital
     *
     * @param id       - The id of the hospital to update
     * @param hospital - The hospital object updated
     * @return
     */
    @PutMapping("/hospital/{id}")
    public Hospital updateHospital(@PathVariable("id") final Long id, @RequestBody Hospital hospital) {
        Optional<Hospital> h = hospitalService.getHospital(id);
        if (h.isPresent()) {
            Hospital currentHospital = h.get();

            String name = hospital.getName();
            if (name != null) currentHospital.setName(name);

            String longitude = hospital.getLongitude();
            if (longitude != null) currentHospital.setLongitude(longitude);

            String latitude = hospital.getLatitude();
            if (latitude != null) currentHospital.setLatitude(latitude);

            String bedsQuantity = hospital.getBedsQuantity();
            if (bedsQuantity != null) currentHospital.setBedsQuantity(bedsQuantity);

            String bedsAvailable = hospital.getBedsAvailable();
            if (bedsAvailable != null) currentHospital.setBedsAvailable(bedsAvailable);

            String speciality = hospital.getSpeciality();
            if (speciality != null) currentHospital.setSpeciality(speciality);

            String incidentId = hospital.getIncidentId();
            if (incidentId != null) currentHospital.setIncidentId(incidentId);

            String attributedBy = hospital.getAttributedBy();
            if (attributedBy != null) currentHospital.setAttributedBy(attributedBy);

            hospitalService.saveHospital(currentHospital);
            return currentHospital;
        } else {
            return null;
        }
    }

    /**
     * Delete - Delete an hospital
     *
     * @param id - The id of the hospital to delete
     */
    @DeleteMapping("/hospital/{id}")
    public void deleteHospital(@PathVariable("id") final Long id) {
        hospitalService.deleteHospital(id);
    }

}