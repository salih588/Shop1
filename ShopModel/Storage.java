package ShopModel;

public class Storage {
	
	private String item;
	private int quandity;
	
	public Storage(String item,int quandity ){
		
		this.item = item;
		this.quandity = quandity;
		
	}
	
	public String getItem(){
		
		return item;
		
	}
	
	public void setItem(String item){
		
		this.item = item;
		
	}

	public int getQuandity() {
		return quandity;
	}

	public void setQuandity(int quandity) {
		this.quandity = quandity;
	}


}
