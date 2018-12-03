package model;

public class Recommend {
	private int id;
	private int type;//1条幅 2热销 3新品
	private Goods goods;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	} 
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public Recommend(int id, int type, Goods goods) {
		super();
		this.id = id;
		this.type = type;
		this.goods = goods;
	}
	public Recommend() {
		super();
	}
	
	
}
