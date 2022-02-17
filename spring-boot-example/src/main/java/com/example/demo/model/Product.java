package com.example.demo.model;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tasks")
public class Product
{
	
	@Id
	private int acm_sys_id;
	
	private String acm_comp_code;
	
	private String acm_prod_code;
	private String acm_sch_fm_code;
	private String acm_sch_to_code;
	private String acm_agent_code;
	private String acm_rm_agent_code;
	private int acm_level;
	private String acm_level_desc;
	private Long acm_pol_term_fm;
	private Long acm_pol_term_to;
	private Long acm_pol_year_fm;
	private Long acm_pol_year_to;
	private int acm_comm_rate;
	private int acm_comm_target_rate;
	private Date acm_eff_fm_dt;
	private Date acm_eff_to_dt;
	private String acm_status;
	private String acm_comm_type;
	public Product()
	{
		
	}
	public Product(int acm_sys_id, String acm_comp_code, String acm_prod_code, String acm_sch_fm_code,
			String acm_sch_to_code, String acm_agent_code, String acm_rm_agent_code, int acm_level,
			String acm_level_desc, Long acm_pol_term_fm, Long acm_pol_term_to, Long acm_pol_year_fm,
			Long acm_pol_year_to, int acm_comm_rate, int acm_comm_target_rate, Date acm_eff_fm_dt, Date acm_eff_to_dt,
			String acm_status, String acm_comm_type) {
		super();
		this.acm_sys_id = acm_sys_id;
		this.acm_comp_code = acm_comp_code;
		this.acm_prod_code = acm_prod_code;
		this.acm_sch_fm_code = acm_sch_fm_code;
		this.acm_sch_to_code = acm_sch_to_code;
		this.acm_agent_code = acm_agent_code;
		this.acm_rm_agent_code = acm_rm_agent_code;
		this.acm_level = acm_level;
		this.acm_level_desc = acm_level_desc;
		this.acm_pol_term_fm = acm_pol_term_fm;
		this.acm_pol_term_to = acm_pol_term_to;
		this.acm_pol_year_fm = acm_pol_year_fm;
		this.acm_pol_year_to = acm_pol_year_to;
		this.acm_comm_rate = acm_comm_rate;
		this.acm_comm_target_rate = acm_comm_target_rate;
		this.acm_eff_fm_dt = acm_eff_fm_dt;
		this.acm_eff_to_dt = acm_eff_to_dt;
		this.acm_status = acm_status;
		this.acm_comm_type = acm_comm_type;
	}
	public int getAcm_sys_id() {
		return acm_sys_id;
	}
	public void setAcm_sys_id(int acm_sys_id) {
		this.acm_sys_id = acm_sys_id;
	}
	public String getAcm_comp_code() {
		return acm_comp_code;
	}
	public void setAcm_comp_code(String acm_comp_code) {
		this.acm_comp_code = acm_comp_code;
	}
	public String getAcm_prod_code() {
		return acm_prod_code;
	}
	public void setAcm_prod_code(String acm_prod_code) {
		this.acm_prod_code = acm_prod_code;
	}
	public String getAcm_sch_fm_code() {
		return acm_sch_fm_code;
	}
	public void setAcm_sch_fm_code(String acm_sch_fm_code) {
		this.acm_sch_fm_code = acm_sch_fm_code;
	}
	public String getAcm_sch_to_code() {
		return acm_sch_to_code;
	}
	public void setAcm_sch_to_code(String acm_sch_to_code) {
		this.acm_sch_to_code = acm_sch_to_code;
	}
	public String getAcm_agent_code() {
		return acm_agent_code;
	}
	public void setAcm_agent_code(String acm_agent_code) {
		this.acm_agent_code = acm_agent_code;
	}
	public String getAcm_rm_agent_code() {
		return acm_rm_agent_code;
	}
	public void setAcm_rm_agent_code(String acm_rm_agent_code) {
		this.acm_rm_agent_code = acm_rm_agent_code;
	}
	public int getAcm_level() {
		return acm_level;
	}
	public void setAcm_level(int acm_level) {
		this.acm_level = acm_level;
	}
	public String getAcm_level_desc() {
		return acm_level_desc;
	}
	public void setAcm_level_desc(String acm_level_desc) {
		this.acm_level_desc = acm_level_desc;
	}
	public Long getAcm_pol_term_fm() {
		return acm_pol_term_fm;
	}
	public void setAcm_pol_term_fm(Long acm_pol_term_fm) {
		this.acm_pol_term_fm = acm_pol_term_fm;
	}
	public Long getAcm_pol_term_to() {
		return acm_pol_term_to;
	}
	public void setAcm_pol_term_to(Long acm_pol_term_to) {
		this.acm_pol_term_to = acm_pol_term_to;
	}
	public Long getAcm_pol_year_fm() {
		return acm_pol_year_fm;
	}
	public void setAcm_pol_year_fm(Long acm_pol_year_fm) {
		this.acm_pol_year_fm = acm_pol_year_fm;
	}
	public Long getAcm_pol_year_to() {
		return acm_pol_year_to;
	}
	public void setAcm_pol_year_to(Long acm_pol_year_to) {
		this.acm_pol_year_to = acm_pol_year_to;
	}
	public int getAcm_comm_rate() {
		return acm_comm_rate;
	}
	public void setAcm_comm_rate(int acm_comm_rate) {
		this.acm_comm_rate = acm_comm_rate;
	}
	public int getAcm_comm_target_rate() {
		return acm_comm_target_rate;
	}
	public void setAcm_comm_target_rate(int acm_comm_target_rate) {
		this.acm_comm_target_rate = acm_comm_target_rate;
	}
	public Date getAcm_eff_fm_dt() {
		return acm_eff_fm_dt;
	}
	public void setAcm_eff_fm_dt(Date acm_eff_fm_dt) {
		this.acm_eff_fm_dt = acm_eff_fm_dt;
	}
	public Date getAcm_eff_to_dt() {
		return acm_eff_to_dt;
	}
	public void setAcm_eff_to_dt(Date acm_eff_to_dt) {
		this.acm_eff_to_dt = acm_eff_to_dt;
	}
	public String getAcm_status() {
		return acm_status;
	}
	public void setAcm_status(String acm_status) {
		this.acm_status = acm_status;
	}
	public String getAcm_comm_type() {
		return acm_comm_type;
	}
	public void setAcm_comm_type(String acm_comm_type) {
		this.acm_comm_type = acm_comm_type;
	}
	
	
	
}