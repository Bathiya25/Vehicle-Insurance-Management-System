package com.vims_v3.service;

import com.vims_v3.model.EmergencyVehicleDriver;
import com.vims_v3.repository.EmergencyVehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SetAvailabiltyEmv {
    @Autowired
    EmergencyVehicleRepo emergencyVehicleRepo;

    public void setAvailability(int emvId,String lat,String longt,Integer availability){
        EmergencyVehicleDriver emergencyVDriver = emergencyVehicleRepo.findOne(emvId);
        emergencyVDriver.setAvailability(availability);
        emergencyVDriver.setLatitude(lat);
        emergencyVDriver.setLongtitude(longt);          ///////add to new
        emergencyVehicleRepo.save(emergencyVDriver);
    }
}
