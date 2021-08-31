package sample1;

public class Circle {
	private double radius; //������ ���� ���� �� ���� 3.4 �̷� ��
	
	private Point point; //xpos,ypos. point class��

	public Circle(double radius, Point point) {
		super();
		this.radius = radius;
		this.point = point;
	}
	
	public void display() { //�Ϲ� �޼���ϱ� �ҹ��ڷ� ����
		System.out.println("���� �߽�:"+point.getXpos()+","+point.getYpos());
		System.out.println("���� ����:"+getArea()); //���� Ŭ������ �����ϱ� get �� ���� �ٷ� ȣ��
	}
	
	private double getArea() { //���� ���� ���ϴ� �޼���
 		//���� * �������� ����
		
		return Math.PI * Math.pow(radius, 2.0); //������ ���� 2(�����̴ϱ�)
	}
	
	
}//
