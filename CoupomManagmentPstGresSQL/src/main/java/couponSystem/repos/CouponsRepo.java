package couponSystem.repos;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import couponSystem.beans.Coupon;
public interface CouponsRepo extends CrudRepository <Coupon , Integer>{
	
	public boolean existsByTitle(String title);

}
