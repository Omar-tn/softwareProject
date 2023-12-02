package Application;

public class Product {
	private String Name;
	private String Descreption;
	private int Quantity;
	private int Price;
	private String CategoryName;
	
	
	
	public Product(String name, String descreption, int quantity, int price, String categoryName) {
		super();
		Name = name;
		Descreption = descreption;
		Quantity = quantity;
		Price = price;
		CategoryName = categoryName;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescreption() {
		return Descreption;
	}
	public void setDescreption(String descreption) {
		Descreption = descreption;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	
	public void AddProduct(String name, String descreption, int quantity, int price, String categoryName) {
		this.Name = name;
		this.Descreption = descreption;
		this.Quantity = quantity;
		this.Price = price;
		this.CategoryName = categoryName;
	}
}
