package sample1;

public class TestMain {

	public static void main(String[] args) {
		
		double radius = 10.0;
		Point p = new Point(); //point Ŭ���� ���� �����ϱ� ȣ��
		p.setXpos(3.0);
		p.setYpos(4.0);
		
		Circle c = new Circle(radius,p);
		c.display();
	}//

}//
