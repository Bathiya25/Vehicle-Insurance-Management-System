package com.vims_v3.repository;

import com.vims_v3.model.InsuranceAdjuster;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InsuranceAdjusterRepository extends CrudRepository<InsuranceAdjuster,Integer>{
}
