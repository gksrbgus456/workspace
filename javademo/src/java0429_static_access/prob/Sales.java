package java0429_static_access.prob;
//-(private)    + (public)    #(protected)     X : default

/*   클래스명 : Sales
*   -item:String  private String item;
*   -qty:int
*   -cost:int
*   
*   +setItem(item String):void
*   +setQty(qty int):void
*   +setCost(cost int):void
*   +getItem():String
*   +getQty():int
*   +getCost():int
*   +toString():String         ==> 출력
*   +getPrice():int             ==> 수량 * 단가를 리턴
*/

public class Sales {
	
	public String getItem() {
		return item;
	}
	private String item;
	private int qty;
	private int cost;
	
	
	

	public void setItem(String item) {
		this.item = item;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	public String toStirng() {
		return "품목 :  " + item +" 수량 : "+qty + "단가 :" + cost + "금액 :" + qty*cost; 
	}
	
	public int getPrice() {
		return qty*cost;
	}
	
}
