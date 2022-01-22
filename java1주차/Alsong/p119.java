package Alsong;

import java.util.Scanner;

public class p119 {

	public static void main(String[] args) {
		// 키보드에서 입력한 정숫값에 10을 더한 갑과 뺀 값을 출력하자.
		Scanner stdIn = new Scanner(System.in);
				
		System.out.print("정수값: ");
		int x= stdIn.nextInt();    //x에 입력받은 정숫값을 저장한다.
		
		System.out.println("10을 더한 값은" + (x + 10)+ "입니다.");
		System.out.println("10을 뺀 값은" +(x - 10)+ "입니다.");
			

	}

}
