package TopCoder;

import java.util.Arrays;

public class LittleElephantAndBooks {

	public static void main(String[] args) {
		int[] pages = {74, 7, 4, 47, 44};
		int number = 3;
		int res = getNumber(pages, number);
		System.out.println(res);
	}

	public static int getNumber(int[] pages, int number) {
		Arrays.sort(pages);
		int res = 0;
		for (int i = 0; i < number-1; i++) res += pages[i];
		return res+pages[number];
	}
}
