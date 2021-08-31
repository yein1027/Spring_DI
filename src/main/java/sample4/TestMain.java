package sample4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestMain {

	public static void main(String[] args) {
		
		
		/*
		CalcBeanImple ci = new CalcBeanImple(5);
		ci.setSu1(14);
		ci.calculate();
		
		MessageBeanImpl mb = new MessageBeanImpl("������");
		mb.setGreeting("Hello");
		mb.sayHello();
		*/
		
		/*
		Resource source = new ClassPathResource("calc.xml");
		BeanFactory factory = new XmlBeanFactory(source);
		//bean���� �ȿ� ������ bean ������ ���´�
		*/
		
		
//		ApplicationContext factory = new FileSystemXmlApplicationContext("classpath:calc.xml");
	
		ApplicationContext factory = new GenericXmlApplicationContext("classpath:calc.xml");
		
		CalcBean calc = (CalcBean)factory.getBean("cb"); //xml�� �� id
		calc.calculate();
		
		MessageBeanImpl msgc = (MessageBeanImpl)factory.getBean("mess");
		msgc.sayHello();
	}

}
