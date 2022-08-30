package ch08;

public class Order {
	
	public String orderNumber;
	public String phoneNumber;
	public String address;
	public String date;
	public String time;
	public int price;
	public String menuNumber;
	
	public void showOrder() {
		System.out.println("주문 접수 번호 : " + orderNumber);
		System.out.println("주문 핸드폰 번호 : " + phoneNumber);
		System.out.println("주문 집 주소 : " + address);
		System.out.println("주문 날짜 : " + date);
		System.out.println("주문 시간 : " + time);
		System.out.println("주문 가격 : " + price);
		System.out.println("메뉴 번호 : " + menuNumber);
	}
}
