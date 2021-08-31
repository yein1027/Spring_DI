package sample5;

public class ServiceImpl implements Service {
	private OrderDao odao; //setter
	private DeliveryDao ddao; //setter
	
	public void setOdao(OrderDao odao) {
		this.odao=odao;
	}
	
	public void setDdao(DeliveryDao ddao) {
		this.ddao=ddao;
	}
	
	public ServiceImpl() {
		System.out.println("ServiceImpl »ý¼ºÀÚ");
	}
	
	@Override
	public void order() {		
		odao.insertOrder();
		ddao.insertAddress();
	}

	@Override
	public void cancel() {
		odao.removeOrder();
		ddao.removeAddress();
	}

}
