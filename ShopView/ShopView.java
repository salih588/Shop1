package ShopView;

import java.util.ArrayList;

import ShopModel.Customer;
import ShopModel.Employee;
import ShopModel.ShoppingCart;
import ShopModel.Storage;
import ShopModel.Store;

public class ShopView {

	int total;
	int rem;
	int totalRateOfItem;
	int totalRateOfItem1;
	int remainingMoney;
	
	public void printInitDetails(ArrayList<Customer> customerlist,ArrayList<Employee> employeelist,ArrayList<ShoppingCart> shoppingcartList,ArrayList<Storage> storagelist,ArrayList<Store> storelist ) {
		
		calculationPart(customerlist,employeelist,shoppingcartList,storelist,storagelist);
			

	}

	public int totalRate( int i,int k ){
		
		total = i*k; 
		return total;
		
	}
	
	public int remainingTotal( int i , int k){
		return 0; 
	}
	
	public void calculationPart(ArrayList<Customer> customerlist,ArrayList<Employee> employeelist,ArrayList<ShoppingCart> shoppingcartList,ArrayList<Store> storelist,ArrayList<Storage> storagelist){
		
	
		for( int i = 0 ; i <= 3 ; i++ ){
			
			Customer customer = customerlist.get(i);
			
			System.out.println(customer.getName());
		
				ShoppingCart shoppingcart = shoppingcartList.get(i);
			
				for( int k  = 0 ; k < 3 ; k++ ){
				
				Store store = storelist.get(k);
				Storage storage = storagelist.get(k);
				
				if( shoppingcart.getItem1().equals(store.getItem())){
					
					if( shoppingcart.getQuandity1() <= store.getQuandity()){
						
						rem = store.getQuandity() - shoppingcart.getQuandity1();
						totalRateOfItem = totalRate(shoppingcart.getQuandity1(),store.getRate());
						customer.setTotal(totalRateOfItem);
						store.setQuandity(rem);
						System.out.println("Total Rate= "+ customer.getTotal());
						System.out.println("Remaining quandity of "+store.getItem()+" in store "+store.getQuandity());
						System.out.println("Remaining quandity of "+store.getItem()+" in storage "+storage.getQuandity());
						
					}else if(shoppingcart.getQuandity1() > store.getQuandity()){
						
                        System.out.println(customer.getName()+" select "+"employee");
						
				        store.setQuandity(store.getQuandity()+storage.getQuandity());
				        
				        
						if(shoppingcart.getQuandity3() > store.getQuandity()){
							rem = store.getQuandity();
							totalRateOfItem = totalRate(store.getQuandity(),store.getRate());
						    customer.setTotal(totalRateOfItem);
						    store.setQuandity(0);
						
						}else{
							rem = store.getQuandity() - shoppingcart.getQuandity3();
							totalRateOfItem = totalRate(shoppingcart.getQuandity3(),store.getRate());
						    customer.setTotal(totalRateOfItem);
						    store.setQuandity(rem);
						}
						storage.setQuandity(0);
						System.out.println("Total Rate= "+ customer.getTotal());
						System.out.println("Remaining quandity of "+store.getItem()+" in store "+store.getQuandity());
						System.out.println("Remaining quandity of "+store.getItem()+" in storage "+storage.getQuandity());
						
					}
				}else if( shoppingcart.getItem2().equals(store.getItem()) ){
					
                     if( shoppingcart.getQuandity2() <= store.getQuandity()){
						
						rem = store.getQuandity() - shoppingcart.getQuandity2();
						totalRateOfItem = totalRate(shoppingcart.getQuandity2(),store.getRate());
						customer.setTotal(totalRateOfItem);
						store.setQuandity(rem);
						System.out.println("Total Rate= "+ customer.getTotal());
						System.out.println("Remaining quandity of "+store.getItem()+" in store "+store.getQuandity());
						System.out.println("Remaining quandity of "+store.getItem()+" in storage "+storage.getQuandity());
						
					}else if(shoppingcart.getQuandity2() > store.getQuandity()){
						
                        System.out.println(customer.getName()+" select "+"employee");
						
				        store.setQuandity(store.getQuandity()+storage.getQuandity());
				        
				        
						if(shoppingcart.getQuandity3() > store.getQuandity()){
							rem = store.getQuandity();
							totalRateOfItem = totalRate(store.getQuandity(),store.getRate());
						    customer.setTotal(totalRateOfItem);
						    store.setQuandity(0);
						
						}else{
							rem = store.getQuandity() - shoppingcart.getQuandity3();
							totalRateOfItem = totalRate(shoppingcart.getQuandity3(),store.getRate());
						    customer.setTotal(totalRateOfItem);
						    store.setQuandity(rem);
						}
						storage.setQuandity(0);
						System.out.println("Total Rate= "+ customer.getTotal());
						System.out.println("Remaining quandity of "+store.getItem()+" in store "+store.getQuandity());
						System.out.println("Remaining quandity of "+store.getItem()+" in storage "+storage.getQuandity());
						
					}
				}else if( shoppingcart.getItem3().equals(store.getItem()) ){
					
                    if( shoppingcart.getQuandity3() <= store.getQuandity()){
                    	
						rem = store.getQuandity() - shoppingcart.getQuandity3();
						totalRateOfItem = totalRate(shoppingcart.getQuandity3(),store.getRate());
						customer.setTotal(totalRateOfItem);
						store.setQuandity(rem);
						System.out.println("Total Rate= "+ customer.getTotal());
						System.out.println("Remaining quandity of "+store.getItem()+" in store "+store.getQuandity());
						System.out.println("Remaining quandity of "+store.getItem()+" in storage "+storage.getQuandity());
						
					}else if(shoppingcart.getQuandity3() > store.getQuandity()){
						
				        System.out.println(customer.getName()+" select "+"employee");
						
				        store.setQuandity(store.getQuandity()+storage.getQuandity());
				        
				        
						if(shoppingcart.getQuandity3() > store.getQuandity()){
							rem = store.getQuandity();
							totalRateOfItem = totalRate(store.getQuandity(),store.getRate());
						    customer.setTotal(totalRateOfItem);
						    store.setQuandity(0);
						
						}else{
							rem = store.getQuandity() - shoppingcart.getQuandity3();
							totalRateOfItem = totalRate(shoppingcart.getQuandity3(),store.getRate());
						    customer.setTotal(totalRateOfItem);
						    store.setQuandity(rem);
						}
						storage.setQuandity(0);
						System.out.println("Total Rate= "+ customer.getTotal());
						System.out.println("Remaining quandity of "+store.getItem()+" in store "+store.getQuandity());
						System.out.println("Remaining quandity of "+store.getItem()+" in storage "+storage.getQuandity());
						
					}
				}
				System.out.println("");
				
			}
			
				System.out.println("Shopping is succesfull");
				System.out.println("");
		}

	    }
	public void displayDetails(ArrayList<Customer> customerlist,ArrayList<Employee> employeelist,ArrayList<Storage> storagelist,ArrayList<Store> storelist){
		
		System.out.println("Coustomer      Total");
		System.out.println("");
		System.out.println(customerlist.get(0).getName()+"      "+customerlist.get(0).getRate());
		System.out.println(customerlist.get(1).getName()+"      "+customerlist.get(1).getRate());
		System.out.println(customerlist.get(2).getName()+"      "+customerlist.get(2).getRate());
		System.out.println(customerlist.get(3).getName()+"      "+customerlist.get(3).getRate());
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
		System.out.println("Item      "+"Quandity    "+"Rate");
		System.out.println("");
		System.out.println(storelist.get(0).getItem()+"       "+storelist.get(0).getQuandity()+"        "+storelist.get(0).getRate());
		System.out.println(storelist.get(1).getItem()+"       "+storelist.get(1).getQuandity()+"        "+storelist.get(1).getRate());
		System.out.println(storelist.get(2).getItem()+"       "+storelist.get(2).getQuandity()+"        "+storelist.get(2).getRate());
		System.out.println("");
		System.out.println("");
		
		System.out.println("Storage");
		System.out.println("");
		System.out.println("Item     "+"Quandity    ");
		System.out.println("");
		System.out.println(storagelist.get(0).getItem()+"       "+storagelist.get(0).getQuandity());
		System.out.println(storagelist.get(1).getItem()+"       "+storagelist.get(1).getQuandity());
		System.out.println(storagelist.get(2).getItem()+"       "+storagelist.get(2).getQuandity());
		System.out.println("");
		System.out.println("");
		
		
	}
	
	public void finalResult(ArrayList<Customer> customerlist,ArrayList<Employee> employeelist,ArrayList<Storage> storagelist,ArrayList<Store> storelist){
		
		System.out.println("Coustomer     "+"Total Rate");
		System.out.println("");
		System.out.println(customerlist.get(0).getName()+"     "+customerlist.get(0).getTotal());
		System.out.println(customerlist.get(1).getName()+"     "+customerlist.get(1).getTotal());
		System.out.println(customerlist.get(2).getName()+"     "+customerlist.get(2).getTotal());
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
		System.out.println("Item      "+"Quandity    "+"Rate");
		System.out.println("");
		System.out.println(storelist.get(0).getItem()+"       "+storelist.get(0).getQuandity()+"       "+storelist.get(0).getRate());
		System.out.println(storelist.get(1).getItem()+"       "+storelist.get(1).getQuandity()+"        "+storelist.get(1).getRate());
		System.out.println(storelist.get(2).getItem()+"       "+storelist.get(2).getQuandity()+"         "+storelist.get(2).getRate());
		System.out.println("");
		System.out.println("");
		
		System.out.println("Storage");
		System.out.println("");
		System.out.println("Item     "+"Quandity    ");
		System.out.println("");
		System.out.println(storagelist.get(0).getItem()+"       "+storagelist.get(0).getQuandity());
		System.out.println(storagelist.get(1).getItem()+"       "+storagelist.get(1).getQuandity());
		System.out.println(storagelist.get(2).getItem()+"       "+storagelist.get(2).getQuandity());
		System.out.println("");
		System.out.println("");
	}

}
