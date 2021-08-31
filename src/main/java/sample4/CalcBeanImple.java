package sample4;

public class CalcBeanImple implements CalcBean{
	
	private int su1; //setter:5
	private int su2; //생성자:14
	
	
	public CalcBeanImple(int x) { 
		//생성자 통한 주입. int x=매개변수. 자바면 오류 안 남. su2에 넣었으니까
		this.su2=x;
	}
	
	public void setSu(int su1) { //set이용
		this.su1=su1;
	}
	
	
	@Override
	public void calculate() {
		System.out.println("덧셈:"+(su1+su2));
		System.out.println("뺄셈:"+(su1-su2));
		System.out.println("곱셈:"+(su1*su2));
		System.out.println("나눗셈:"+(su1/su2));
		
	}

}
