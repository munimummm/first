package ch4;

public class For2 {

	public static void main(String[] args) {
		// 1���� 100���� �ڿ����� Ȧ��
		int i;
		System.out.println("1~100������ Ȧ��");
		for(i=1;i<=100;i++) {
			if(i%2!=1) {
				System.out.print(i+"\t");
			}
			if(i%10==0) {
				System.out.println();
			}
		}
	}

}
