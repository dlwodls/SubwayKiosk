package model;

public class Menus {
	private String menuname;
	private int calorie;
	private int price_15;
	private int price_30;
	private int price_salad;
	private int price_wrap;
	
	public Menus() {}
	
	public Menus(String menuname, int calorie, int price_15, int price_30, 
			int price_salad, int price_wrap) {
		this.menuname = menuname;
		this.calorie = calorie;
		this.price_15 = price_15;
		this.price_30 = price_30;
		this.price_salad = price_salad;
		this.price_wrap = price_wrap;
	}
	
	public String getMenuName() {
		return menuname;
	}
	
	public void setMenuName(String menuname) {
		this.menuname = menuname;
	}
	
	public int getCalorie() {
		return calorie;
	}
	
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	
	public int getPrice_15() {
		return price_15;
	}
	
	public void setPrice_15(int price_15) {
		this.price_15 = price_15;
	}
	
	public int getPrice_30() {
		return price_30;
	}
	
	public void setPrice_30(int price_30) {
		this.price_30 = price_30;
	}
	
	public int getPrice_salad() {
		return price_salad;
	}
	
	public void setPrice_salad(int price_salad) {
		this.price_salad = price_salad;
	}
	
	public int getPrice_wrap() {
		return price_wrap;
	}
	
	public void setPrice_wrap(int price_wrap) {
		this.price_wrap = price_wrap;
	}
}
