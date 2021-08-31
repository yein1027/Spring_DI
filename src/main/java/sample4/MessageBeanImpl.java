package sample4;

public class MessageBeanImpl implements MessageBean {

	private String name; //생성자 주입 아이유
	private String greeting; //setter 주입 Hello
	
	
	public MessageBeanImpl(String name) {
		this.name=name;
	}
	
	public void setGreeting(String greeting) {
		this.greeting=greeting;
	}

	
	
	@Override
	public void sayHello() {
		System.out.println(name+" "+greeting+"!");
		
	}

	
	
	
}
