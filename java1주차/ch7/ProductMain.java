package ch7;

public class ProductMain {

	public static void main(String[] args) {
			
		Product p1; // p1선언
		p1 = new Product(); // p2생성
		p1.num = 1;
		p1.name = "노트북";
		
		Product p2 = new Product(); // p2 선언 및 생성
		p2.num = 2;
		p2.name = "Tv";
		
		System.out.println("객체 p1dml 정보 출력");
		System.out.println("p1.num=" + p1.num);
		System.out.println("p1.naem=" + p1.name);
		
		System.out.println("객체 p2의 정보 출력");
		System.out.println("p2.num=" + p2.num);
		System.out.println("p2.name=" + p2.name);
		

	}

}
