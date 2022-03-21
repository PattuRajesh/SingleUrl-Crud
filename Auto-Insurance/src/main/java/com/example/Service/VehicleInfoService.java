package com.example.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Model.VehicleInfo;
import com.example.Repository.VehicleInfoRepository;

@Service
public class VehicleInfoService {
	
	
	@Autowired
	private VehicleInfoRepository vehicleRepository;
	
	public VehicleInfo saveVehicleInfo(VehicleInfo vehicle) {
		 return vehicleRepository.save(vehicle);
		
	}
	
	public List<VehicleInfo> saveVehicleInfos(List<VehicleInfo> vehicles) {
		 return (List<VehicleInfo>) vehicleRepository.saveAll(vehicles);
		 
	}
	public List<VehicleInfo>getVehicleInfos(){
		return (List<VehicleInfo>) vehicleRepository.findAll();
		
	}
	
	public VehicleInfo getVehicleInfoById(Long regId){
		return vehicleRepository.findById(regId).orElse(null);
	}
	
	public String deleteVehicleInfo(Long regId) {
		vehicleRepository.deleteById(regId);
		return "product removed !!"+regId;
	}
	
	 public VehicleInfo updateVehicleInfo(VehicleInfo vehicle){
		 VehicleInfo existingVehicleInfo= vehicleRepository.findById(vehicle.getRegId()).get();
//		  existingVehicleInfo.setBikeId((Long)vehicle.getBikeId());
	      existingVehicleInfo.setModel((String)vehicle.getModel());
	      existingVehicleInfo.setColor((String)vehicle.getColor());
	      existingVehicleInfo.setYearOfReg((Date)vehicle.getYearOfReg());
	      existingVehicleInfo.setSeatingCapacity((int)vehicle.getSeatingCapacity());
	      existingVehicleInfo.setEngineNo((int)vehicle.getEngineNo());
	      existingVehicleInfo.setUsePrivate((String)vehicle.getUsePrivate());
	      existingVehicleInfo.setChassisNumber((Long)vehicle.getChassisNumber());
	      return vehicleRepository.save(existingVehicleInfo);
	    
	  }


	
	

}
