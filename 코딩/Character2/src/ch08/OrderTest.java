package ch08;

public class OrderTest {

	public static void main(String[] args) {

		Order orderT = new Order();
		
		orderT.orderNumber = "202011020003";
		orderT.phoneNumber = "01023450001";
		orderT.address = "서울시 강남구 역삼동 111-333";
		orderT.date = "20221102";
		orderT.time = "130258";
		orderT.price = 35000;
		orderT.menuNumber = "0003";
		
		orderT.showOrder();
	}

}
