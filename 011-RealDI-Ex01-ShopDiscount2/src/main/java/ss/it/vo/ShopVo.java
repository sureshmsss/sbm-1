package ss.it.vo;

public class ShopVo {

	// properties
	private String id;
	private String name;
	private String bill;
	private String discount;

	// setters and getters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBill() {
		return bill;
	}

	public void setBill(String bill) {
		this.bill = bill;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "ShopVo [id=" + id + ", name=" + name + ", bill=" + bill + ", discount=" + discount + "]";
	}

}
