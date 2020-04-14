package by.htp.task.simpleclass.view;

import java.util.ArrayList;

import by.htp.task.simpleclass.bean.Custumer;
import by.htp.task.simpleclass.bean.Shop;

public class ViewCustemer {
	
	
	public void printCustomerToShopCustumer(Shop shop) {
		
		
		shop.getShopCustumer();
		for(Custumer cust : shop.getShopCustumer()) {
			System.out.println(cust.toString());
		}		
		
	}


	}



