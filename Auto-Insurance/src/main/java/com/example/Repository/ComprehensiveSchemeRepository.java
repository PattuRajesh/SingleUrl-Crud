package com.example.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.ComprehensiveScheme;

@Repository
public interface ComprehensiveSchemeRepository extends JpaRepository<ComprehensiveScheme,Integer>{

  ComprehensiveScheme findByPlanId(int planId);

}
