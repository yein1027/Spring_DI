package sample3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestMain {

	public static void main(String[] args) {
		/*
		 * 이거를 전부 DI.xml에 썼음
		double radius=10.0;
		PointImpl p = new PointImpl(); //point가 부모임 point 부모타입의 변수에 넣을 수 있따
		p.setXpos(3.0);
		p.setYpos(4.0);
		
		CircleImpl c = new CircleImpl(radius,p);
		c.display();
		*/
		
		Resource resource = new ClassPathResource("DIExam.xml"); 
		//bean 생성 코드가 여기 있다=resource
		BeanFactory factory = new XmlBeanFactory(resource);
		//이것까지 해야 bean 설정 완료. 두개의 bean 정보가 factory에 들어감
		
		Point point = (Point)factory.getBean("pt");
		//PointImple의 부모인 point로 받을 수 있음. getbean은 object 리턴이라 다운 캐스팅
		System.out.println("x좌표:"+point.getXpos());
		System.out.println("y좌표:"+point.getYpos());
		
		Circle circle = (Circle)factory.getBean("ct");
		circle.display();
		
	}  

}
