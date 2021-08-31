package sample2;

public class TestMain {

	public static void main(String[] args) {
		
		double radius=10.0;
		PointImpl p = new PointImpl(); //point가 부모임 point 부모타입의 변수에 넣을 수 있따
		p.setXpos(3.0);
		p.setYpos(4.0);
		
		CircleImpl c = new CircleImpl(radius,p);
		c.display();
	}  

}
