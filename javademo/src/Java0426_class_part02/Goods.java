package Java0426_class_part02;

public class Goods {
	String name;
	int price;
	int numberOfStock;
	int sold;

	public Goods(String name, int price,int sold, int numberOfStock) {
		super();
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}

	public void prn() {
		System.out.printf("%-14s %8d %5d %5d \n", name, price, numberOfStock, sold);
	}

}
