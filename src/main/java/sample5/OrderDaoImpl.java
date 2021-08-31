package sample5;

public class OrderDaoImpl implements OrderDao {

	public OrderDaoImpl() {
		System.out.println("OrderDaoImpl 생성자");
	}
	
	@Override
	public void insertOrder() {
		System.out.println("주문 정보 추가");		
	}

	@Override
	public void removeOrder() {
		System.out.println("주문 정보 삭제");		
	}

}
