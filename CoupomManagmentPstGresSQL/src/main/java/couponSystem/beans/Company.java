package couponSystem.beans;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

// TODO: Auto-generated Javadoc
/**
 * The Class Company.
 * Company Class 
 *  - Attributes : id , compName , password , email, collection for Coupons; 
 *  - Coupon Collection : not used; instead exists Method "get all coupons" from DataBase 
 *  - Constructor with each attribute 
 *  - Getters and setters for each Attribute 
 */
@Entity(name="COMPANY")
@XmlRootElement
public class Company {
	
	/** The id. */
	@Id 
	@GeneratedValue
	private int id;
	
	/** The comp name. */
	@Column
	private String compName;
	
	/** The password. */
	@Column
	private String password;
	
	/** The email. */
	@Column
	private String email;
	
	/** Many To Many relationship annotation. 
	 * Each company could has collection of coupons, 
	 * and each coupon could has only one company */
	
	@OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
	@JoinColumn(name="COMPANY_ID")
	@JsonIgnore 
	 private Collection<Coupon> coupons ;
	/**
	 * Instantiates a new company.
	 */
	public Company() {
		
	}

	/**
	 * Instantiates a new company.
	 *
	 * @param id the id
	 * @param compName the comp name
	 * @param password the password
	 * @param email the email
	 */
	public Company(int id, String compName, String password, String email) { // if need construct to collection ??
		super();
		this.id = id;
		this.compName = compName;
		this.password = password;
		this.email = email;
		// this.coupon = coupon;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}
 
	/**Getter for coupons */
	public Collection<Coupon> getCoupons() {
		return coupons;
	}
	/**Setter  for coupons */
	public void setCoupons(Collection<Coupon> coupons) {
		this.coupons = coupons;
	}
	/** Method adds new coupons to collection*/
	public void addCoupon(Coupon coupon) {
		this.coupons.add(coupon);
		
	}
	
	/** Checks if some @param coupons Id already 
	 * exists in collection , returns true or false */
	 public boolean   checkCoupon(int id) {
		 boolean result = false; 
		 for (Coupon checkedCoupon : this.coupons) {
			 if (checkedCoupon.getId() == id) {
				 result = true ;
				 
			 }
		 }
		return result;
	 }
	 
	 /** Method clears all coupons from the collection*/
	 public void clearAllCoupon() {
		 this.coupons.removeAll(this.coupons);
	 }
	 
	 /** Method removes single coupon with @param Id from the collection*/
	 public void removeCoupon(int id) {
		 for (Coupon checkedCoupon : this.coupons) {
			 if (checkedCoupon.getId() == id) {
				 this.coupons.remove(checkedCoupon);
				 break;
			 }
		 }
	 }

	/**
	 * Gets the comp name.
	 *
	 * @return the comp name
	 */
	public String getCompName() {
		return compName;
	}

	/**
	 * Sets the comp name.
	 *
	 * @param compName the new comp name
	 */
	public void setCompName(String compName) {
		this.compName = compName;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Company [id=" + id + ", compName=" + compName + ", password=" + password + ", email=" + email
				+ ", coupons=" + coupons + "]";
	}	
	

	

}
