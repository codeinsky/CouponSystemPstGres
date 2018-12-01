package couponSystem.repos;



import org.springframework.data.repository.CrudRepository;

import couponSystem.beans.Company;

public interface CompanyRepo extends CrudRepository<Company,Integer>{
	public boolean existsByCompName(String companyName);
	Company findCompanyByCompName (String compName);

}
