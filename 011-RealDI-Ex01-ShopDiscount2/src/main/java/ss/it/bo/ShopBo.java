package ss.it.bo;

public class ShopBo {
	// properties
	private Integer id;
	private String name;
	private Double bill;
	private Double discount;

	// setters and getters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBill() {
		return bill;
	}

	public void setBill(Double bill) {
		this.bill = bill;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "ShopBo [id=" + id + ", name=" + name + ", bill=" + bill + ", discount=" + discount + "]";
	}

}
