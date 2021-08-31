package sample1;

public class Circle {
	private double radius; //반지름 정보 넣을 수 있음 3.4 이런 식
	
	private Point point; //xpos,ypos. point class임

	public Circle(double radius, Point point) {
		super();
		this.radius = radius;
		this.point = point;
	}
	
	public void display() { //일반 메서드니까 소문자로 시작
		System.out.println("원의 중심:"+point.getXpos()+","+point.getYpos());
		System.out.println("원의 면적:"+getArea()); //같은 클래스에 있으니까 get 안 쓰고 바로 호출
	}
	
	private double getArea() { //원의 면적 구하는 메서드
 		//파이 * 반지름의 제곱
		
		return Math.PI * Math.pow(radius, 2.0); //반지름 쓰고 2(제곱이니까)
	}
	
	
}//
