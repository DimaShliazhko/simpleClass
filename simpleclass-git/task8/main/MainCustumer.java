package by.htp.task.simpleclass.main;

import by.htp.task.simpleclass.bean.Custumer;
import by.htp.task.simpleclass.bean.Shop;
import by.htp.task.simpleclass.logic.LogicCustumer;
import by.htp.task.simpleclass.view.ViewCustemer;

public class MainCustumer {
	
	public static void main(String[] args) {
		
		ViewCustemer view = new ViewCustemer();
		LogicCustumer logic = new  LogicCustumer();
		Shop market1 = new Shop("market1");
		Shop market2 = new Shop("market2");
		 Custumer custumer1= new Custumer("Дмитрий","Сергеевич", "г.Минск", 66, 123456780);
		 Custumer custumer2= new Custumer("Дмитрий2","Сергеевич2", "г.Минск2",55 , 123456782);
		 Custumer custumer3= new Custumer("Дмитрий3","Сергеевич3", "г.Минск3", 11, 123456783);
		
		 Custumer custumer4= new Custumer("Петров","Сергеевич4", "г.Минск4", 10, 123456784);
		 Custumer custumer5= new Custumer("Акулов","Сергеевич5", "г.Минск5", 20, 123456785);
		 Custumer custumer6= new Custumer("Баранов","Сергеевич6", "г.Минск6", 30, 123456786);
		
		 market1.addCustomerToShopCustumer(custumer1);	
		 market1.addCustomerToShopCustumer(custumer2);	
		 market1.addCustomerToShopCustumer(custumer3);	
		 market2.addCustomerToShopCustumer(custumer4);
		 market2.addCustomerToShopCustumer(custumer5);	
		 market2.addCustomerToShopCustumer(custumer6);	
		 
		// market2.getCustomerToShopCustumer();
		 ;
		// view.printCustomerToShopCustumer(market2);
		 view.printCustomerToShopCustumer(logic.sortACustumer(market2));
		 view.printCustomerToShopCustumer(logic.creditInterval(market2));
		
	}
	 

}
