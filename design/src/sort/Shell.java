package sort;

import java.util.Arrays;

public class Shell {
	public static void shellSort(int[] array) {
		int[] d = {5, 3, 1};
//		int[] d = { 1};
		for (int i = 0; i < d.length; i++) {
			shell(array, d[i]);
		}
	}

	private static void shell(int[] array, int gap) {
		int tmp = 0, j;
		for (int i = gap; i < array.length; i++) {
			tmp = array[i];
			for (j = i - gap; j >= 0; j = j - gap) {
				if (array[j] > tmp) {
					array[j + gap] = array[j];
				} else {
					break;
				}
			}
			array[j + gap] = tmp;
		}

	}

	public static void main(String[] args) {
//		int[] array = {4, 3, 5, 6, 234, 56, 2};
		int[] array = {5, 4, 3, 2, 1, 0, -1};
		shellSort(array);
		System.out.println(Arrays.toString(array));
	}

}