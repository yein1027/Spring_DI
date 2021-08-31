package sample3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestMain {

	public static void main(String[] args) {
		/*
		 * �̰Ÿ� ���� DI.xml�� ����
		double radius=10.0;
		PointImpl p = new PointImpl(); //point�� �θ��� point �θ�Ÿ���� ������ ���� �� �ֵ�
		p.setXpos(3.0);
		p.setYpos(4.0);
		
		CircleImpl c = new CircleImpl(radius,p);
		c.display();
		*/
		
		Resource resource = new ClassPathResource("DIExam.xml"); 
		//bean ���� �ڵ尡 ���� �ִ�=resource
		BeanFactory factory = new XmlBeanFactory(resource);
		//�̰ͱ��� �ؾ� bean ���� �Ϸ�. �ΰ��� bean ������ factory�� ��
		
		Point point = (Point)factory.getBean("pt");
		//PointImple�� �θ��� point�� ���� �� ����. getbean�� object �����̶� �ٿ� ĳ����
		System.out.println("x��ǥ:"+point.getXpos());
		System.out.println("y��ǥ:"+point.getYpos());
		
		Circle circle = (Circle)factory.getBean("ct");
		circle.display();
		
	}  

}
