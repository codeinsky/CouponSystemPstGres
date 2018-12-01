package couponSystem.repos;
import org.springframework.data.repository.CrudRepository;
import couponSystem.beans.Customer;

public interface CustomerRepo extends CrudRepository <Customer , Integer>{
	public boolean existsByCustName(String customerName);
	Customer findCustomerByCustName (String compName);
}
