package kjs_project0914;

import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		System.out.print("수를 입력하시오 : ");
		int number = in.nextInt();
		if(number % 3 == 0)
		 System.out.println("3 의 배수입니다.");
		else
		 System.out.println("3 의 배수가 아닙니다.");
		
		scanner.close();
	}

}
