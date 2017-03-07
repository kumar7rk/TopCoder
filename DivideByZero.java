package TopCoder;

import java.util.ArrayList;

public class DivideByZero {

	public static void main(String[] args) {

		int[] numbers =
			{95, 17, 7, 86, 31, 11, 74, 45, 79, 36}	
		
		;
		
		int res = CountNumbers(numbers);
		System.out.println(res);
	}

	private static int CountNumbers(int[] numbers) {
		
		int res = addNumber(numbers);
		return res;
	}

	public static int addNumber(int[] numbers) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (Integer integer : numbers) {
			arrayList.add(integer);
		}
	
		for (int i = 0; i < arrayList.size(); i++) {
			for (int j = 0; j < arrayList.size(); j++) {

				if (arrayList.get(j)!=0){
					int div = arrayList.get(i)/arrayList.get(j);
					
					if (!arrayList.contains(div)&&div!=0)
						arrayList.add(div);
				}
			}
		}
		System.out.println(arrayList);
		return arrayList.size();
	}

}
