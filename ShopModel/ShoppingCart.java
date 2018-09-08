package ShopModel;

public class ShoppingCart {
	
	private String item1;
	private String item2;
	private String item3;
	private int quandity1;
	private int quandity2;
	private int quandity3;
	
	
	public ShoppingCart(String item1,String item2,String item3,int quandity1,int quandity2,int quandity3){
		
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.quandity1 = quandity1;
		this.quandity2 = quandity2;
		this.quandity3 = quandity3;

	}

	public String getItem1() {
		return item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getItem2() {
		return item2;
	}

	public void setItem2(String item2) {
		this.item2 = item2;
	}

	public String getItem3() {
		return item3;
	}

	public void setItem3(String item3) {
		this.item3 = item3;
	}

	public int getQuandity1() {
		return quandity1;
	}

	public void setQuandity1(int quandity1) {
		this.quandity1 = quandity1;
	}

	public int getQuandity2() {
		return quandity2;
	}

	public void setQuandity2(int quandity2) {
		this.quandity2 = quandity2;
	}

	public int getQuandity3() {
		return quandity3;
	}

	public void setQuandity3(int quandity3) {
		this.quandity3 = quandity3;
	}

	
}
