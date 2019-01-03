package couponSystem.repos;
import org.springframework.data.repository.CrudRepository;
import couponSystem.beans.Customer;

// TODO: Auto-generated Javadoc
/**
 * The Interface CustomerRepo.
 */
public interface CustomerRepo extends CrudRepository <Customer , Integer>{
	
	/**
	 * Exists by cust name.
	 *
	 * @param customerName the customer name
	 * @return true, if successful
	 */
	public boolean existsByCustName(String customerName);
	
	/**
	 * Find customer by cust name.
	 *
	 * @param compName the comp name
	 * @return the customer
	 */
	Customer findCustomerByCustName (String compName);
}
