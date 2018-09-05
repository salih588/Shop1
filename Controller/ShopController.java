package Controller;

import java.util.ArrayList;

import Model.Customer;
import Model.Employee;
import Model.Storage;
import Model.Store;
import View.ShopView;

public class ShopController {
	
	private ArrayList<Customer> customerlist = new ArrayList();
	private ArrayList<Employee> employeelist = new ArrayList();
	private ArrayList<Storage> storagelist = new ArrayList();
	private ArrayList<Store> storelist = new ArrayList();
	private ShopView view;
	
	public ShopController(ArrayList<Customer> customerlist,ArrayList<Employee> employeelist,ArrayList<Storage> storagelist,ArrayList<Store> storelist,ShopView view){
		
		this.customerlist = customerlist;
		this.employeelist = employeelist;
		this.storagelist = storagelist;
		this.storelist = storelist;
		this.view = view;
		
	}
	
    public ArrayList<Customer> getCustomerList(){
		
		return customerlist;
		
	}
	
	public void setCustomerList(ArrayList<Customer> customerlist){
		
		this.customerlist = customerlist;
		
	}
	
	
    public ArrayList<Employee> getEmployeeList(){
		
		return employeelist;
		
	}
	
	public void setEmployeeList(ArrayList<Employee> employeelist){
		
		this.employeelist = employeelist;
		
	}
	
    public ArrayList<Storage> getStorageList(){		
		return storagelist;	
	}	
	public void setStoragelist(ArrayList<Storage> storagelist){		
		this.storagelist = storagelist;
	}

	public ArrayList<Store> getStoreList() {
		return storelist;
	}

	public void setStoreList(ArrayList<Store> storelist) {
		this.storelist = storelist;
	}

	public void updateView(){
		
		view.displayDetails(customerlist,employeelist,storagelist,storelist);
		view.printInitDetails(customerlist,employeelist,storagelist,storelist);
		view.finalResult(customerlist,employeelist,storagelist,storelist);
	}

}
