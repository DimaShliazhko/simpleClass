package by.htp.task.simpleclass.bean;

import java.util.ArrayList;

public class Shop {
	private String shopname;
	private ArrayList<Custumer> shopCustumer = new ArrayList<Custumer>();

	public Shop(String shopname) {
		this.shopname = shopname;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public void addCustomerToShopCustumer(Custumer custumer) {
		shopCustumer.add(custumer);
	}


	public ArrayList<Custumer> getShopCustumer() {
		return shopCustumer;
	}
/*	public Custumer getShopCustumer(ArrayList<Custumer> Custumer) {
		return Custumer;
	}
*/	

	public void setShopCustumer(ArrayList<Custumer> shopCustumer) {
		this.shopCustumer = shopCustumer;
	}


}
