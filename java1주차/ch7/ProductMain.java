package ch7;

public class ProductMain {

	public static void main(String[] args) {
			
		Product p1; // p1����
		p1 = new Product(); // p2����
		p1.num = 1;
		p1.name = "��Ʈ��";
		
		Product p2 = new Product(); // p2 ���� �� ����
		p2.num = 2;
		p2.name = "Tv";
		
		System.out.println("��ü p1dml ���� ���");
		System.out.println("p1.num=" + p1.num);
		System.out.println("p1.naem=" + p1.name);
		
		System.out.println("��ü p2�� ���� ���");
		System.out.println("p2.num=" + p2.num);
		System.out.println("p2.name=" + p2.name);
		

	}

}
