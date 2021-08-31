package sample2;


public class CircleImpl implements Circle {
	private double radius;
	private Point point;
	
	public CircleImpl(double radius, Point point) { //생성자 통해 위에 두개 주입
		super();
		this.radius = radius;
		this.point = point;
	}
	
	@Override
	public void display() {
		System.out.println("원의 중심:"+point.getXpos()+","+point.getYpos());
		System.out.println("원의 면적:"+getArea()); 
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2.0);
	}

	

}
