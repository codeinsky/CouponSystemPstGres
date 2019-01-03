package couponSystem.repos;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import couponSystem.beans.Coupon;
import couponSystem.beans.Customer;
// TODO: Auto-generated Javadoc

/**
 * The Interface CouponsRepo.
 */
public interface CouponsRepo extends CrudRepository <Coupon , Integer>{
	
	/**
	 * Exists by title.
	 *
	 * @param title the title
	 * @return true, if successful
	 */
	public boolean existsByTitle(String title);
	
	/**
	 * Find by customers id.
	 *
	 * @param customerId the customer id
	 * @return the array list
	 */
	public ArrayList<Coupon> findByCustomers_id(int customerId);

}
