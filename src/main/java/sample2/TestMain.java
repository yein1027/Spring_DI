package sample2;

public class TestMain {

	public static void main(String[] args) {
		
		double radius=10.0;
		PointImpl p = new PointImpl(); //point�� �θ��� point �θ�Ÿ���� ������ ���� �� �ֵ�
		p.setXpos(3.0);
		p.setYpos(4.0);
		
		CircleImpl c = new CircleImpl(radius,p);
		c.display();
	}  

}
