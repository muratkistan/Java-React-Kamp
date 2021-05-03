package interfaceAbstractDemo;

import interfaceAbstractDemo.abstracts.BaseCustomerManager;
import interfaceAbstractDemo.adapters.MerniseServiceAdapter;
import interfaceAbstractDemo.concrete.StarbucksCustomerManager;
import interfaceAbstractDemo.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MerniseServiceAdapter());
		Customer customer = new Customer(1,"Murat Ali" ,"Kýþtan",2021,"11111111111");
		baseCustomerManager.save(customer);
		
	}

}
