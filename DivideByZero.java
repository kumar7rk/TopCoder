package TopCoder;

import java.util.ArrayList;
import java.util.Collections;

public class DivideByZero {

	public static void main(String[] args) {
		int[] numbers = 
			{2, 100}			
		;
		int res = CountNumbers(numbers);
		System.out.println(res);
	}

	public static int CountNumbers(int[] numbers) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (Integer integer : numbers) arrayList.add(integer);
		for (int i = 0; i < arrayList.size(); i++) {
			for (int j = 0; j < arrayList.size(); j++) {
				Collections.sort(arrayList);
				if (i==j) continue;
				if (arrayList.get(j)!=0){
					int div = arrayList.get(i)/arrayList.get(j);
//					System.out.println(div+ " "+i + " "+j);
					if (!arrayList.contains(div)&&div!=0){
						arrayList.add(div);
						i = 0;
						j = 0;
					}
				}
			}
		}
		Collections.sort(arrayList);
		for (Integer integer : arrayList) {
			System.out.print(integer+ " ");
		}
		System.out.println();
		return arrayList.size();
	}
}