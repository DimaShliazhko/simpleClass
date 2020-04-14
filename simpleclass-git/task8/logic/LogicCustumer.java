package by.htp.task.simpleclass.logic;

import java.util.ArrayList;

import by.htp.task.simpleclass.DataReader.IntervalCardReader;
import by.htp.task.simpleclass.bean.Custumer;
import by.htp.task.simpleclass.bean.Shop;

/*
 * a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 * 
 */

public class LogicCustumer {

	public Shop sortACustumer(Shop shop) {

		ArrayList<Custumer> newArr = new ArrayList<Custumer>();
		newArr = shop.getShopCustumer();

		for (int i = newArr.size() - 1; i >= 0; i--) {

			for (int j = 0; j < i; j++) {

				if (newArr.get(j).getSurname().compareTo(newArr.get(j + 1).getSurname()) > 0) {

					Custumer temp;
					temp = newArr.get(j);

					newArr.set(j, newArr.get(j + 1));
					newArr.set(j + 1, temp);

				}

			}
		}
		return shop;
	}

	public Shop creditInterval (Shop shop ) {
		
	//	Shop newShop = new Shop(); 
		 IntervalCardReader card =new IntervalCardReader(); 
		int a = card.readA();
		int b = card.readB();
		int idCard;
		
		for (int i = 0; i < shop.getShopCustumer().size(); i++) {
		
			idCard =  shop.getShopCustumer().get(i).getIdCredit();
		
		if ( idCard <  a || idCard > b) {
			
			shop.getShopCustumer().remove(i);
				}
		}
		return shop;
	}
	
	
}
