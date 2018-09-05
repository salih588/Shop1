package MainClass;

import java.util.ArrayList;

import Controller.ShopController;
import Model.Customer;
import Model.Employee;
import Model.Storage;
import Model.Store;
import View.ShopView;

public class Shop {
	static ArrayList<Customer> customerlist;
	static ArrayList<Employee> employeelist;
	static ArrayList<Storage> storagelist;
	static ArrayList<Store> storelist;

	
	public static void main(String[] args){
		
		customerlist = new ArrayList();
		employeelist = new ArrayList();
		storagelist = new ArrayList();
		storelist = new ArrayList();

		
		Customer model1 = new Customer("Customer 1",0);
	    customerlist.add(model1);
	    
	    model1 = new Customer("Customer 2",0);
	    customerlist.add(model1);
	    
	    model1 = new Customer("Customer 3",0);
	    customerlist.add(model1);
	    
		Employee model2 = new Employee("Employee 1");
		employeelist.add(model2);
		
		model2 = new Employee("Employee 2");
		employeelist.add(model2);
		
		Storage model3 = new Storage("A",15,20);
		storagelist.add(model3);
		
		model3 = new Storage("B",10,10);
		storagelist.add(model3);
		
		model3 = new Storage("C",5,5);
		storagelist.add(model3);
		
		Store model4 = new Store("A",8,20);
		storelist.add(model4);
		
		model4 = new Store("B",8,10);
		storelist.add(model4);
		
		model4 = new Store("C",3,5);
		storelist.add(model4);
	
		ShopView view = new ShopView();
		
		ShopController controller = new ShopController(customerlist,employeelist,storagelist,storelist,view);
		
		controller.updateView();
		
		
	}

	
	



}
