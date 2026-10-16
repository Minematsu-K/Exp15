
public class Product {
	String name;
	int price;
	int stock;
	String category;
	
	Product(){
		this.name="未設定";
		this.price=0;
		this.stock=0;
		this.category="未分類";
	}
	
	Product(String name,int price){
		this.name=name;
		this.price=price;
		this.stock=0;
		this.category="未分類";
	}
	
	Product(String name,int price,int stock){
		this.name=name;
		this.price=price;
		this.stock=stock;
		this.category="未分類";
	}
	
	Product(String name,int price,int stock,String category){
		this.name=name;
		this.price=price;
		this.stock=stock;
		this.category=category;
	}
	
	void showInfo() {
		System.out.println("商品名："+this.name);
		System.out.println("価格："+this.price+"円");
		System.out.println("在庫数："+this.stock);
		System.out.println("カテゴリ："+this.category);
	}
}
