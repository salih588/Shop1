package ShopModel;

public class Store {
	
	private String item;
	private int quandity;
	private int rate;
	
	public Store(String item,int quandity,int rate){
		
		this.item = item;
		this.quandity = quandity;
		this.rate = rate;
		
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQuandity() {
		return quandity;
	}
	public void setQuandity(int quandity) {
		this.quandity = quandity;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}

}
