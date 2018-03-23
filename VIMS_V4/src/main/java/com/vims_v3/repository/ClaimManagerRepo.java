package com.vims_v3.repository;

import com.vims_v3.model.ClaimAssessingManager;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClaimManagerRepo extends CrudRepository<ClaimAssessingManager,Integer>{
}
