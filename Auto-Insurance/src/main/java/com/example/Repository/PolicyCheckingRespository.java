package com.example.Repository;

import java.util.Optional;

//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.example.Model.PolicyChecking;
//
//public interface PolicyCheckingRespository extends JpaRepository<PolicyChecking, Long> {
//
//	PolicyChecking findByBikeId(Long bikeId);
//}



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.PolicyChecking;
@Repository
public interface PolicyCheckingRespository extends JpaRepository<PolicyChecking, Long> {

	Optional<PolicyChecking> findByBikeId(Long bikeId);
}