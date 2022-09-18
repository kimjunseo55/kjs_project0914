package kjs_project0914;

public class BitOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		short a = (short)0x55ff;
		short b = (short)0x00ff;

		System.out.println("[비트 연산 결과]");
		System.out.printf("%04x\n", (short)(a & b)); 
		System.out.printf("%04x\n", (short)(a | b)); // 비트 OR
		System.out.printf("%04x\n", (short)(a ^ b)); // 비트 XOR
		System.out.printf("%04x\n", (short)(~a)); // 비트 NOT
		byte c = 20; // 0x14
		byte d = -8; // 0xf8
	
		System.out.println("[시프트 연산 결과]");
		System.out.println(c <<2); // c 를 2 비트 왼쪽 시프트
		System.out.println(c >>2); // c 를 2 비트 오른쪽 시프트 . 0 삽입
		System.out.println(d >>2); // d 를 2 비트 오른쪽 시프트 . 1 삽입
		System.out.printf("%x\n", (d >>>2)); // d
	}

}
