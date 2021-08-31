package sample2;


public class CircleImpl implements Circle {
	private double radius;
	private Point point;
	
	public CircleImpl(double radius, Point point) { //������ ���� ���� �ΰ� ����
		super();
		this.radius = radius;
		this.point = point;
	}
	
	@Override
	public void display() {
		System.out.println("���� �߽�:"+point.getXpos()+","+point.getYpos());
		System.out.println("���� ����:"+getArea()); 
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2.0);
	}

	

}
