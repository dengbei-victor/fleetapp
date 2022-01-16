package com.victor.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.victor.fleetapp.models.VehicleStatus;

@Repository
public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Integer> {

}
