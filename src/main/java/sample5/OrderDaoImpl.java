package sample5;

public class OrderDaoImpl implements OrderDao {

	public OrderDaoImpl() {
		System.out.println("OrderDaoImpl ������");
	}
	
	@Override
	public void insertOrder() {
		System.out.println("�ֹ� ���� �߰�");		
	}

	@Override
	public void removeOrder() {
		System.out.println("�ֹ� ���� ����");		
	}

}
