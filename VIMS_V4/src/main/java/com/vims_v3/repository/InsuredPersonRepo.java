package com.vims_v3.repository;

import com.vims_v3.model.InsuredPerson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InsuredPersonRepo extends CrudRepository<InsuredPerson,Integer> {
}
