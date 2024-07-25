package com.sandbox.insuranceapplication.repositories;

import com.sandbox.insuranceapplication.repositories.entities.DriverEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends ListCrudRepository<DriverEntity, Long> {

    @Query("SELECT d FROM DriverEntity d WHERE d.driversLicence = :driversLicense")
    DriverEntity findByDriversLicense(@Param("driversLicense") String driversLicense);

}
