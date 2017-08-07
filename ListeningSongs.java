package TopCoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListeningSongs {

	public static void main(String[] args) {
		int []durations1 = 
				{196,147,201,106,239,332,165,130,205,221,248,108,60}
		;
		int []durations2 = 
			{280,164,206,95,81,383,96,255,260,244,60,313,101}
		;
		int minutes = 60;
		int T = 3;
		int res = listen(durations1,durations2, minutes, T);
		System.out.println(res);
	}
	public static int listen(int[] durations1, int[] durations2, int minutes, int T){
		minutes *=60;
		int total = 0; 
		if (T>durations1.length || T>durations2.length) return -1;
		Arrays.sort(durations1);
		Arrays.sort(durations2);
		for (int i = 0; i < T; i++) {
			total+=durations1[i];
			total+=durations2[i];
			if (total>minutes) return -1;
		}
		if (total==minutes) return 2*T;
		
		ArrayList<Integer> arrayList = new ArrayList<>();

		for (int i = T; i < durations1.length; i++) 
			arrayList.add(durations1[i]);
		for (int i = T; i < durations2.length; i++) 
			arrayList.add(durations2[i]);
		Collections.sort(arrayList);
		int counter = 2*T;
		while (total<minutes && arrayList.size()>0) {
			total+=arrayList.get(0);
			if (total>minutes) return counter;
			arrayList.remove(0);
			counter++;
		}
		return counter;
	}
}