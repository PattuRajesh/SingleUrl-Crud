package com.example.demo.service;
import java.util.List;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Service
public  class ProductService {
    @Autowired
	private ProductRepository productRepository;
	
	public Product saveProduct(Product product) {
		 return productRepository.save(product);
		
	}
	public List<Product> saveProducts(List<Product> products) {
		 return (List<Product>) productRepository.saveAll(products);
		 
	}
	public List<Product>getProducts(){
		return (List<Product>) productRepository.findAll();
		
	}
	public Product getProductByAcm_sys_id(int acm_sys_id){
		return productRepository.findById(acm_sys_id).orElse(null);
	}
	
	
	public String deleteProduct(int acm_sys_id) {
		productRepository.deleteById(acm_sys_id);
		return "product removed !!"+acm_sys_id;
	}
  public Product updateProduct(Product product){
     Product existingProduct= productRepository.findById(product.getAcm_sys_id()).get();
      existingProduct.setAcm_comp_code((String)product.getAcm_comp_code());
      existingProduct.setAcm_prod_code((String)product.getAcm_prod_code());
      existingProduct.setAcm_sch_fm_code((String)product.getAcm_sch_fm_code());
      existingProduct.setAcm_sch_to_code((String)product.getAcm_sch_to_code());
      existingProduct.setAcm_agent_code((String)product.getAcm_agent_code());
      existingProduct.setAcm_rm_agent_code((String)product.getAcm_rm_agent_code());
      existingProduct.setAcm_level((int)product.getAcm_level());
      existingProduct.setAcm_level_desc((String)product.getAcm_level_desc());
      existingProduct.setAcm_pol_term_fm((Long)product.getAcm_pol_term_fm());
      existingProduct.setAcm_pol_term_to((Long)product.getAcm_pol_year_to());
      existingProduct.setAcm_pol_year_fm((Long)product.getAcm_pol_year_fm());
      existingProduct.setAcm_pol_term_to((Long)product.getAcm_pol_year_to());
      existingProduct.setAcm_comm_rate((int)product.getAcm_comm_rate());
      existingProduct.setAcm_comm_target_rate((int)product.getAcm_comm_target_rate());
      existingProduct.setAcm_eff_fm_dt((Date)product.getAcm_eff_fm_dt());
      existingProduct.setAcm_eff_to_dt((Date)product.getAcm_eff_to_dt());
      existingProduct.setAcm_status((String)product.getAcm_status());
      existingProduct.setAcm_comm_type((String)product.getAcm_comm_type());
      return productRepository.save(existingProduct);
    
  }

}



