package StringAndArray;

import java.util.ArrayList;
import java.util.Stack;

public class Daily_Temperature {

	static int[] arr = { 19, 20, 20, 19, 19, 30 };
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length - 1; i++) {
			if (stack.empty()) {
				stack.add(i);
			}

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					list.add(j - stack.pop());
					break;
				}

				if (j == arr.length - 1) {
					list.add(0);
				}

			}

		}
		list.add(0);
		for (int res : list) {
			System.out.print(res + " ");
		}
	}

}
