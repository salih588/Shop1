package MainClass;

import java.util.ArrayList;

import ShopController.ShopController;
import ShopModel.Customer;
import ShopModel.Employee;
import ShopModel.ShoppingCart;
import ShopModel.Storage;
import ShopModel.Store;
import ShopView.ShopView;

public class Shop {
	static ArrayList<Customer> customerlist;
	static ArrayList<Employee> employeelist;
	static ArrayList<Storage> storagelist;
	static ArrayList<Store> storelist;
	static ArrayList<ShoppingCart> shoppingCartList;
 	

	public static void main(String[] args){
		
		customerlist = new ArrayList<>();
		employeelist = new ArrayList<>();
		storagelist = new ArrayList<>();
		storelist = new ArrayList<>();
		shoppingCartList = new ArrayList<>();
	    
		customerDatabase();
		
		employeeDatabase();
		
		storageDatabase();
		
	    storeDatabase();
	
		ShopView view = new ShopView();
		
		ShopController controller = new ShopController(customerlist,employeelist,shoppingCartList,storagelist,storelist,view);
		
		controller.updateView();
		
		
	}

	private static void customerDatabase(){
		
		ShoppingCart shoppingCart = new ShoppingCart("item 1","item 2","item 3",8,5,5);
		shoppingCartList.add(shoppingCart);
		
		shoppingCart = new ShoppingCart("","item 2","item 3",0,5,2);
		shoppingCartList.add(shoppingCart);
		
		shoppingCart = new ShoppingCart("item 1","item 2","",8,6,0);
		shoppingCartList.add(shoppingCart);
		
		shoppingCart = new ShoppingCart("","","item 3",0,0,5);
		shoppingCartList.add(shoppingCart);
		
		Customer model1 = new Customer("Customer 1",250,0);
	    customerlist.add(model1);
	    
	    model1 = new Customer("Customer 2",100,0);
	    customerlist.add(model1);
	    
	    model1 = new Customer("Customer 3",150,0);
	    customerlist.add(model1);
	    
	    model1 = new Customer("Customer 4",60,0);
	    customerlist.add(model1);
	    
	}
	
	private static void employeeDatabase(){
		
		Employee model2 = new Employee("Employee 1");
		employeelist.add(model2);
		
		model2 = new Employee("Employee 2");
		employeelist.add(model2);
		
	}
	
	private static void storageDatabase(){
		
		Storage model3 = new Storage("item 1",15);
		storagelist.add(model3);
		
		model3 = new Storage("item 2",10);
		storagelist.add(model3);
		
		model3 = new Storage("item 3",5);
		storagelist.add(model3);
		
	}
	
	private static void storeDatabase(){
		
		Store model4 = new Store("item 1",8,20);
		storelist.add(model4);
		
		model4 = new Store("item 2",8,10);
		storelist.add(model4);
		
		model4 = new Store("item 3",3,5);
		storelist.add(model4);
		
	}
}
