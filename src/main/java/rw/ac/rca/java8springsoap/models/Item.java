package rw.ac.rca.java8springsoap.models;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    public String name;

    public String itemCode;
    
    public String status;
    
    public long price;
    
    public long supplier;

    public Item() {
    }

    
	public Item(String name, String itemCode, String status, long price, long supplier) {
        
		this.name = name;
		this.itemCode = itemCode;
		this.status = status;
		this.price = price;
		this.supplier = supplier;
	}


	public  long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public long getSupplier() {
		return supplier;
	}

	public void setSupplier(long supplier) {
		this.supplier = supplier;
	}

    
}
