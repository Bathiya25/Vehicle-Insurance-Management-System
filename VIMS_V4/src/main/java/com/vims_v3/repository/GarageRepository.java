package com.vims_v3.repository;

import com.vims_v3.model.Garage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarageRepository extends CrudRepository<Garage,Integer>{
}
