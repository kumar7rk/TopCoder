package topCoderV1dot1;

import java.util.HashMap;

import icsV1dot1.FrequencyOfAlphabets;

public class ChessFloor {
	static String s = "";
	public static void main(String[] args) {
		String[] floor =   	
			{"helloand",
					 "welcomet",
					 "osingler",
					 "oundmatc",
					 "hsixhund",
					 "redandsi",
					 "xtythree",
					 "goodluck"};
		int result = minimumChanges(floor);
		System.out.println(result);
	}

	private static int minimumChanges(String[] floor) {
		int counter = 0;
		HashMap<Character, Integer> hashMap = new HashMap<>();
		hashMap = FrequencyOfAlphabets.frequency(concatStringArray(floor));
		
		System.out.println(hashMap);

		
		for (int i = 0; i < floor.length; i++) {
//			System.out.println();
		}
		return counter;
	}
	public static String concatStringArray(String[]floor){
		for (int i = 0; i < floor.length; i++)
			s = s.concat(floor[i]);
		return s;
	}
}
