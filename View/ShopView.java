package View;

import java.util.ArrayList;

import Model.Customer;
import Model.Employee;
import Model.Storage;
import Model.Store;

public class ShopView {

	int total;
	int rem;
	int totalRateOfItem;
	int totalRateOfItem1;
	
	public void printInitDetails(ArrayList<Customer> customerlist,ArrayList<Employee> employeelist,ArrayList<Storage> storagelist,ArrayList<Store> storelist ) {
		System.out.println(customerlist.get(0).getName()+" select "+employeelist.get(0).getName());
		System.out.println(customerlist.get(0).getName() +" select item "+storelist.get(0).getItem()+" quandity : "+8+", rate of one item "+storelist.get(0).getRate());
		
		if( 8 <= storelist.get(0).getQuandity()){
			
			rem = storelist.get(0).getQuandity() - 8;
			totalRateOfItem = totalRate(8,storelist.get(0).getRate());
			customerlist.get(0).setTotal(totalRateOfItem);
			storelist.get(0).setQuandity(rem);
			System.out.println("Total Rate= "+ customerlist.get(0).getTotal());
			System.out.println("Remaining quandity in store "+storelist.get(0).getQuandity());
			
		}
		
		System.out.println(customerlist.get(0).getName()+ " select item "+storelist.get(1).getItem()+" quandity : "+5+", rate of one item "+storelist.get(1).getRate());
		
if( 5 <= storelist.get(1).getQuandity()){
			
			rem = storelist.get(1).getQuandity() - 5;
			totalRateOfItem = totalRate(5,storelist.get(1).getRate());
			customerlist.get(0).setTotal(customerlist.get(0).getTotal()+totalRateOfItem);
			storelist.get(1).setQuandity(rem);
			System.out.println("Total Rate= "+customerlist.get(0).getTotal());
			System.out.println("Remaining quandity in store "+storelist.get(1).getQuandity());
			
		}
System.out.println(customerlist.get(1).getName()+" select "+employeelist.get(0).getName());
System.out.println(customerlist.get(0).getName()+" Waiting");
System.out.println(customerlist.get(0).getName()+" select "+employeelist.get(1).getName());
System.out.println(customerlist.get(1).getName()+ " select item "+storelist.get(2).getItem()+" quandity : "+6+", rate of one item "+storelist.get(2).getRate());

if( 6 > storelist.get(2).getQuandity()){
	
	int a = 6-storelist.get(2).getQuandity();
	rem = storagelist.get(2).getQuandity()-a;
	totalRateOfItem = totalRate(6,storelist.get(2).getRate());
	customerlist.get(1).setTotal(customerlist.get(1).getTotal()+totalRateOfItem);
	storagelist.get(2).setQuandity(rem);
	storelist.get(2).setQuandity(0);
	System.out.println("Total Rate= "+customerlist.get(1).getTotal());
	System.out.println("Remaining quandity in store "+storelist.get(2).getQuandity());
	System.out.println("Remaining quandity in storage "+storagelist.get(2).getQuandity());
	
}

System.out.println(customerlist.get(0).getName()+ " select item "+storelist.get(2).getItem()+" quandity : "+6+", rate of one item "+storelist.get(2).getRate());

if( storagelist.get(2).getQuandity() < 6){
	
	rem = storagelist.get(2).getQuandity();
	totalRateOfItem = totalRate(rem,storelist.get(2).getRate());
	customerlist.get(0).setTotal(customerlist.get(0).getTotal()+totalRateOfItem);
	storagelist.get(2).setQuandity(0);
	storelist.get(2).setQuandity(0);
	System.out.println("Total Rate= "+customerlist.get(0).getTotal());
	System.out.println("Remaining quandity in store "+storelist.get(2).getQuandity());
	System.out.println("Remaining quandity in storage "+storagelist.get(2).getQuandity());
	
}
System.out.println("");
System.out.println("");
System.out.println("Toatal rate of "+customerlist.get(0).getName()+" is "+customerlist.get(0).getTotal());
System.out.println("Shopping successfull");
System.out.println("");
System.out.println("");
System.out.println("Toatal rate of "+customerlist.get(1).getName()+" is "+customerlist.get(1).getTotal());
System.out.println("Shopping successfull");
System.out.println("");
System.out.println("");

System.out.println(customerlist.get(2).getName()+" select "+employeelist.get(1).getName());
System.out.println(customerlist.get(2).getName()+ " select item "+storelist.get(1).getItem()+" quandity : "+10+", rate of one item "+storelist.get(1).getRate());

if( 10 > storelist.get(2).getQuandity()){
	
	int a = 10-storelist.get(1).getQuandity();
	rem = storagelist.get(1).getQuandity()-a;
	totalRateOfItem = totalRate(10,storelist.get(1).getRate());
	customerlist.get(2).setTotal(customerlist.get(2).getTotal()+totalRateOfItem);
	storagelist.get(1).setQuandity(rem);
	storelist.get(1).setQuandity(0);
	System.out.println("Total Rate= "+customerlist.get(2).getTotal());
	System.out.println("Remaining quandity in store "+storelist.get(1).getQuandity());
	System.out.println("Remaining quandity in storage "+storagelist.get(1).getQuandity());
	
}

System.out.println("");
System.out.println("");
System.out.println("Toatal rate of "+customerlist.get(2).getName()+" is "+customerlist.get(2).getTotal());
System.out.println("Shopping successfull");
	}

	public int totalRate( int i,int k ){
		
		total = i*k; 
		return total;
		
	}
	
	public void displayDetails(ArrayList<Customer> customerlist,ArrayList<Employee> employeelist,ArrayList<Storage> storagelist,ArrayList<Store> storelist){
		
		System.out.println("Coustomer");
		System.out.println("");
		System.out.println(customerlist.get(0).getName());
		System.out.println(customerlist.get(1).getName());
		System.out.println(customerlist.get(2).getName());
		System.out.println("");
		System.out.println("");
		System.out.println("Employee");
		System.out.println("");
		System.out.println(employeelist.get(0).getName());
		System.out.println(employeelist.get(1).getName());
		System.out.println("");
		System.out.println("");
		
		System.out.println("Store");
		System.out.println("");
		System.out.println("Item    "+"Quandity  "+"Rate");
		System.out.println("");
		System.out.println(storelist.get(0).getItem()+"         "+storelist.get(0).getQuandity()+"          "+storelist.get(0).getRate());
		System.out.println(storelist.get(1).getItem()+"         "+storelist.get(1).getQuandity()+"          "+storelist.get(1).getRate());
		System.out.println(storelist.get(2).getItem()+"         "+storelist.get(2).getQuandity()+"          "+storelist.get(2).getRate());
		System.out.println("");
		System.out.println("");
		
		System.out.println("Storage");
		System.out.println("");
		System.out.println("Item     "+"Quandity    "+"Rate");
		System.out.println("");
		System.out.println(storagelist.get(0).getItem()+"       "+storagelist.get(0).getQuandity()+"         "+storagelist.get(0).getRate());
		System.out.println(storagelist.get(1).getItem()+"       "+storagelist.get(1).getQuandity()+"         "+storagelist.get(1).getRate());
		System.out.println(storagelist.get(2).getItem()+"       "+storagelist.get(2).getQuandity()+"           "+storagelist.get(2).getRate());
		System.out.println("");
		System.out.println("");
		
		
	}
	
	public void finalResult(ArrayList<Customer> customerlist,ArrayList<Employee> employeelist,ArrayList<Storage> storagelist,ArrayList<Store> storelist){
		
		System.out.println("Coustomer     "+"Total Rate");
		System.out.println("");
		System.out.println(customerlist.get(0).getName()+"   "+customerlist.get(0).getTotal());
		System.out.println(customerlist.get(1).getName()+"   "+customerlist.get(1).getTotal());
		System.out.println(customerlist.get(2).getName()+"   "+customerlist.get(2).getTotal());
		System.out.println("");
		System.out.println("");
		System.out.println("Employee");
		System.out.println("");
		System.out.println(employeelist.get(0).getName());
		System.out.println(employeelist.get(1).getName());
		System.out.println("");
		System.out.println("");
		
		System.out.println("Store");
		System.out.println("");
		System.out.println("Item    "+"Quandity  "+"Rate");
		System.out.println("");
		System.out.println(storelist.get(0).getItem()+"         "+storelist.get(0).getQuandity()+"          "+storelist.get(0).getRate());
		System.out.println(storelist.get(1).getItem()+"         "+storelist.get(1).getQuandity()+"          "+storelist.get(1).getRate());
		System.out.println(storelist.get(2).getItem()+"         "+storelist.get(2).getQuandity()+"          "+storelist.get(2).getRate());
		System.out.println("");
		System.out.println("");
		
		System.out.println("Storage");
		System.out.println("");
		System.out.println("Item     "+"Quandity    "+"Rate");
		System.out.println("");
		System.out.println(storagelist.get(0).getItem()+"       "+storagelist.get(0).getQuandity()+"         "+storagelist.get(0).getRate());
		System.out.println(storagelist.get(1).getItem()+"       "+storagelist.get(1).getQuandity()+"         "+storagelist.get(1).getRate());
		System.out.println(storagelist.get(2).getItem()+"       "+storagelist.get(2).getQuandity()+"           "+storagelist.get(2).getRate());
		System.out.println("");
		System.out.println("");
	}

}
