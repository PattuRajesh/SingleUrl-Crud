package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.VehicleInfo;

@Repository
public interface VehicleInfoRepository extends JpaRepository <VehicleInfo,Long> {

}
