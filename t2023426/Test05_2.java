package t2023426;

// 배열에서 연속된 요소를 삭제
import java.util.Scanner;

public class Test05_2 {

	// --- 배열 a에서 a[idx]부터 n개의 요소를 삭제 --- //
	static void aryRmvN(int[] a, int idx, int n) {
		if (n > 0 && idx >= 0 && idx + n < a.length) {
			int idx2 = idx + n - 1;
			if (idx2 > a.length - n - 1)

				idx2 = a.length - n - 1;
			for (int i = idx; i <= idx2; i++)
				a[i] = a[i + n];
		}
	}

	public static void mian(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("요소 수: ");
		int num = stdIn.nextInt();
		int[] a = new int[num]; 		// 요소 수가 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.print("a[" + i + "]:");
			a[i] = stdIn.nextInt();

		}

		System.out.println("삭제를 시작할 인덱스: ");
		int idx = stdIn.nextInt();

		System.out.println("삭제할 요소의 수: ");
		int n = stdIn.nextInt();

		aryRmvN(a, idx, n);				 // 배열 a에서 a[idx]부터 n개의 요소를 삭제
		for (int i = 0; i < num; i++) 	// 배열 a표시
			System.out.println("a[" + i + "] = " + a[i]);
	}

}
