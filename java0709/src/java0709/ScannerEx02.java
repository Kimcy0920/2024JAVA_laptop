package java0709;

import java.util.Scanner;

public class ScannerEx02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 수 입력: ");
		String input = scan.nextLine();
		int A = Integer.parseInt(input);
		
		System.out.print("두번째 수 입력: ");
		input = scan.nextLine();
		int B = Integer.parseInt(input);
		
		if (A > B) {
			System.out.printf("%d", A);
		} else if (A < B) {
			System.out.printf("%d", B);
		} else {
			System.out.println("같은 숫자입니다.");
		}
		// 직접 한 거
	}

}
// 3. 두 개의 값을 받아서 큰 수를 출력하세요. (단, 같으면 0으로 출력)