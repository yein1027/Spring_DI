package sample5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		/*
		OrderDaoImpl odao = new OrderDaoImpl(); //이걸 생성해야 이 안 메서드 생성
		DeliveryDaoImpl ddao = new DeliveryDaoImpl();
		
		ServiceImpl service = new ServiceImpl();
		
		service.setOdao(odao); //여기에서 impl정보를 service에 있는 odao에 밀어넣는거
		service.setDdao(ddao);
		*/
		
		ApplicationContext factory = new GenericXmlApplicationContext("classpath:service.xml");
		Service service = (Service)factory.getBean("service");
		
		service.order();
		System.out.println();		
		service.cancel();
	}

}
