package ShopModel;

public class Customer {
	
	private String name;
	private int rate;
	private int total;
	
	
	public Customer(String name, int rate, int total) {
		
		this.name = name;
		this.rate = rate;
		this.total = total;
	
		
	}

	public String getName(){
		
		return name;
		
	}
	
	public void setName(String name){
		
		this.name = name;
		
	}

	public int getTotal() {
		
		return total;
		
	}

	public void setTotal(int total) {
		
		this.total = total;
		
	}

	public int getRate() {
		
		return rate;
		
	}

	public void setRate(int rate) {
		
		this.rate = rate;
		
	}

	
	
	

}
