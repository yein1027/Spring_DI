package sample5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		/*
		OrderDaoImpl odao = new OrderDaoImpl(); //�̰� �����ؾ� �� �� �޼��� ����
		DeliveryDaoImpl ddao = new DeliveryDaoImpl();
		
		ServiceImpl service = new ServiceImpl();
		
		service.setOdao(odao); //���⿡�� impl������ service�� �ִ� odao�� �о�ִ°�
		service.setDdao(ddao);
		*/
		
		ApplicationContext factory = new GenericXmlApplicationContext("classpath:service.xml");
		Service service = (Service)factory.getBean("service");
		
		service.order();
		System.out.println();		
		service.cancel();
	}

}
