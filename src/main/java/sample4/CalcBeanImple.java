package sample4;

public class CalcBeanImple implements CalcBean{
	
	private int su1; //setter:5
	private int su2; //������:14
	
	
	public CalcBeanImple(int x) { 
		//������ ���� ����. int x=�Ű�����. �ڹٸ� ���� �� ��. su2�� �־����ϱ�
		this.su2=x;
	}
	
	public void setSu(int su1) { //set�̿�
		this.su1=su1;
	}
	
	
	@Override
	public void calculate() {
		System.out.println("����:"+(su1+su2));
		System.out.println("����:"+(su1-su2));
		System.out.println("����:"+(su1*su2));
		System.out.println("������:"+(su1/su2));
		
	}

}
