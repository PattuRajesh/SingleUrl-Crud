package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.State;

@Repository
public interface StateRepository extends JpaRepository <State,Integer>{

		   
}
