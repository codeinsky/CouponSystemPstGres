package couponSystem.repos;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import couponSystem.beans.Coupon;
public interface CouponsRepo extends CrudRepository <Coupon , Integer>{
	List<Coupon>findByType(String type);
	public boolean existsByTitle(String title);

}
