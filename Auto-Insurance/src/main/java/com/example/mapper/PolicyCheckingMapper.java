package com.example.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.Model.PolicyChecking;
import com.example.dto.PolicyCheckingDTO;

@Mapper
public interface PolicyCheckingMapper {
	
	PolicyCheckingDTO toPolicyCheckingDTO(PolicyChecking policy);

    List<PolicyChecking> toPolicyCheckingDTOs(List<PolicyChecking> policys);

    PolicyChecking toPolicyChecking(PolicyCheckingDTO policyDTO);
}