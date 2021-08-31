package sample3;

public class PointImpl implements Point { //꼭 만들어야 하는 애들을 point로 만들어서
	private double xpos;
	private double ypos;
	
	@Override
	public double getXpos() {
		return xpos;
	}
	@Override
	public void setXpos(double xpos) {
		this.xpos=xpos;
		
	}
	@Override
	public double getYpos() {
		return ypos;
	}
	@Override
	public void setYpos(double ypos) {
		this.ypos=ypos;
		
	}
}
