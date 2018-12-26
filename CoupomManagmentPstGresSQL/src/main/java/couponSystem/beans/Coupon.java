package couponSystem.beans;
import java.sql.Date;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

// TODO: Auto-generated Javadoc

/**
 * The Class Coupon.
 * Coupon Class 
 *  - Attributes - id , startDate(yyyy-mm-dd), endDate, amount, 
 *  type(Enum) 
 *  @see Type Enum file beans.CouponType.java" 
 *  , message, price, image
 *  - Contractor with all attributes   
 *  - Getter and Setters for all attributes  
 */ 
@Entity(name="COUPON")
@XmlRootElement
public class Coupon  {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/** The title. */
	@Column
	private String title;
	
	/** The start date. */
	@Column
	private Date startDate;
	
	/** The end date. */
	@Column
	private Date endDate;
	
	/** The amount. */
	@Column
	private int amount;
	
	/** The type. */
	@Column
	private CouponType type;
	
	/** The message. */
	@Column
	private String message;
	
	/** The price. */
	@Column
	private Double price;
	
	/** The image. */
	@Column
	private String image;

	/**
	 * Instantiates a new coupon.
	 */
	@ManyToMany(fetch=FetchType.LAZY, cascade = {CascadeType.DETACH , CascadeType.REFRESH})
//	@JoinTable(name = "customer_coupon",
//				joinColumns = @JoinColumn(name = "customer_id"),
//				inverseJoinColumns = @JoinColumn(name = "coupon_id"))
	private Collection<Customer> customers;
	


	public Collection<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Collection<Customer> customers) {
		this.customers = customers;
	}

	public Coupon() {
	}

	/**
	 * Instantiates a new coupon.
	 *
	 * @param id the id
	 * @param title the title
	 * @param startDate the start date
	 * @param endDate the end date
	 * @param amount the amount
	 * @param type the type
	 * @param message the message
	 * @param price the price
	 * @param image the image
	 */
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	public void buyCoupon(Customer customer) {
		Collection<Customer> customers = null;
		customers =this.getCustomers();
		customers.add(customer);
		this.setCustomers(customers);
		// System.out.println("Who buy my coupon " + this.getCustomers());
	}
	
	public boolean ifSoldOut() {
		boolean result = false ;
		System.out.println("Coupon amount is " + this.getAmount());
		if (this.getAmount()<1) {
			result = true ; 
		}
		return result ; 
	}
	
	public boolean ifExpired() {
		long time = System.currentTimeMillis();
		Date date = new Date(time);
		boolean result = false;
		if (this.getEndDate().before(date)) {
			result = true; 
		}
		return result; 
	}

	

	public Coupon(int id, String title, Date startDate, Date endDate, int amount, CouponType type, String message,
			Double price, String image, Collection<Customer> customers) {
		super();
		this.id = id;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
		this.type = type;
		this.message = message;
		this.price = price;
		this.image = image;
		this.customers = customers;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the start date.
	 *
	 * @return the start date
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Sets the start date.
	 *
	 * @param startDate the new start date
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * Gets the end date.
	 *
	 * @return the end date
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Sets the end date.
	 *
	 * @param endDate the new end date
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * Gets the amount.
	 *
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * Sets the amount.
	 *
	 * @param amount the new amount
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * Gets the image.
	 *
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * Sets the image.
	 *
	 * @param image the new image
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public CouponType getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(CouponType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Coupon [id=" + id + ", title=" + title + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", amount=" + amount + ", type=" + type + ", message=" + message + ", price=" + price + ", image="
				+ image + ", customers=" + customers + "]";
	}

	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */


}
