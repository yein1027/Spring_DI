package sample5;

public class DeliveryDaoImpl implements DeliveryDao {

	public DeliveryDaoImpl() {
		System.out.println("DeliveryDaoImpl 생성자");
	}
	
	@Override
	public void insertAddress() {
		System.out.println("배송지 정보 추가");		
	}

	@Override
	public void removeAddress() {
		System.out.println("배송지 정보 삭제");		
	}

}
