package com.example.Service;

import java.util.Date;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.CustomerInfo;
import com.example.Repository.CustomerInfoRepository;

@Service
public  class CustomerInfoService {
   
	@Autowired
	private CustomerInfoRepository customerRepository;
	
	public CustomerInfo saveCustomerInfo(CustomerInfo customer) {
		 return customerRepository.save(customer);
		
	}
	public List<CustomerInfo> saveCustomerInfos(List<CustomerInfo> customers) {
		 return (List<CustomerInfo>) customerRepository.saveAll(customers);
		 
	}
	public List<CustomerInfo>getCustomerInfos(){
		return (List<CustomerInfo>) customerRepository.findAll();
		
	}
	public CustomerInfo getCustomerInfoById(Long bikeId){
		return customerRepository.findById(bikeId).orElse(null);
	}
	public String deleteCustomerInfo(Long bikeId) {
		customerRepository.deleteById(bikeId);
		return "product removed !!"+bikeId;
	}
  public CustomerInfo updateCustomerInfo(CustomerInfo customer){
	  CustomerInfo existingCustomerInfo= customerRepository.findById(customer.getBikeId()).get();
      existingCustomerInfo.setFirstName((String)customer.getFirstName());
      existingCustomerInfo.setMiddleName((String)customer.getMiddleName());
      existingCustomerInfo.setLastName((String)customer.getLastName());
      existingCustomerInfo.setDateOfBirth((Date)customer.getDateOfBirth());
      existingCustomerInfo.setFatherName((String)customer.getFatherName());
      existingCustomerInfo.setMotherName((String)customer.getMotherName());
      existingCustomerInfo.setNationality((String)customer.getNationality());
      existingCustomerInfo.setMartialStatus((String)customer.getMartialStatus());
      existingCustomerInfo.setSpouse((String)customer.getSpouse());
      existingCustomerInfo.setPanCardNo((Long)customer.getPanCardNo());
      existingCustomerInfo.setStateId((int)customer.getStateId());
      existingCustomerInfo.setCityId((int)customer.getCityId());
      existingCustomerInfo.setAddressId((int)customer.getAddressId());
      existingCustomerInfo.setPinCodeId((int)customer.getPinCodeId());
      existingCustomerInfo.setMobileNo((Long)customer.getMobileNo());
      existingCustomerInfo.setEmailId((String)customer.getEmailId());
      existingCustomerInfo.setLincenseIdNo((Long)customer.getLincenseIdNo());
      existingCustomerInfo.setLincenseDueDate((Date)customer.getLincenseDueDate());
      existingCustomerInfo.setLincenseValidDate((Date)customer.getLincenseValidDate());
      existingCustomerInfo.setOccupation((String)customer.getOccupation());
      existingCustomerInfo.setCompanyName((String)customer.getCompanyName());
      return customerRepository.save(existingCustomerInfo);
    
  }


}
