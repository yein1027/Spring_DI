package sample5;

public class DeliveryDaoImpl implements DeliveryDao {

	public DeliveryDaoImpl() {
		System.out.println("DeliveryDaoImpl ������");
	}
	
	@Override
	public void insertAddress() {
		System.out.println("����� ���� �߰�");		
	}

	@Override
	public void removeAddress() {
		System.out.println("����� ���� ����");		
	}

}
