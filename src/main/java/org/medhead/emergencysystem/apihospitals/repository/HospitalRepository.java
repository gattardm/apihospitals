package org.medhead.emergencysystem.apihospitals.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import org.medhead.emergencysystem.apihospitals.model.Hospital;
@Repository
public interface HospitalRepository extends CrudRepository<Hospital, Long> {
}