package couponSystem.repos;



import org.springframework.data.repository.CrudRepository;

import couponSystem.beans.Company;

// TODO: Auto-generated Javadoc
/**
 * The Interface CompanyRepo.
 */
public interface CompanyRepo extends CrudRepository<Company,Integer>{
	
	/**
	 * Exists by comp name.
	 *
	 * @param companyName the company name
	 * @return true, if successful
	 */
	public boolean existsByCompName(String companyName);
	
	/**
	 * Find company by comp name.
	 *
	 * @param compName the comp name
	 * @return the company
	 */
	Company findCompanyByCompName (String compName);

}
