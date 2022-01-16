package com.victor.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.victor.fleetapp.models.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
