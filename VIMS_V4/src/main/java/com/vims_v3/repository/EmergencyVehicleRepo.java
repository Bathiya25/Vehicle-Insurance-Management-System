package com.vims_v3.repository;

import com.vims_v3.model.EmergencyVehicleDriver;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmergencyVehicleRepo extends CrudRepository<EmergencyVehicleDriver,Integer> {
}
