
public class Exp15_1 {

	public static void main(String[] args) {
		Product product1=new Product("コーヒー",500,20,"飲料");
		Product product2=new Product();
		Product product3=new Product("紅茶",450);
		Product product4=new Product("コーヒー豆",1200,30);
		
		product1.showInfo();
		System.out.println();
		product2.showInfo();
		System.out.println();
		product3.showInfo();
		System.out.println();
		product4.showInfo();
	}

}
