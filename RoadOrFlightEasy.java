package TopCoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class RoadOrFlightEasy{

	public static void main(String [] args){
		int N = 47;
		int[] roadTime = 
			{127, 198, 603, 331, 739, 462, 126, 328, 280, 943, 950, 740, 133, 336, 127, 532, 251, 659, 327, 302, 677, 965, 976, 461, 802, 690, 867, 250, 912, 307, 869, 482, 40, 25, 868, 284, 358, 977, 536, 233, 552, 55, 340, 428, 12, 941, 539}	
		;
		int[] flightTime = 
			{540, 984, 75, 558, 14, 744, 551, 85, 225, 933, 500, 879, 74, 828, 584, 688, 377, 761, 836, 775, 710, 860, 882, 397, 221, 910, 606, 268, 666, 380, 718, 81, 821, 187, 306, 770, 887, 177, 747, 680, 531, 562, 23, 134, 765, 344, 59}
		;
		int K = 22;
		int res = minTime(N,roadTime, flightTime, K);
		System.out.print("Res :");
		System.out.println(res);
	}

	public static int minTime(int N, int[] roadTime, int[]flightTime, int K){
		int sum = 0;
		int diff[] = new int[N];
		int count = 0;
		ArrayList<Integer> arrayList = new ArrayList<>();
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		HashMap<Integer, Integer> hashMap1 = new HashMap<>();
		for (int i = 0; i < flightTime.length; i++) {
			diff[i] = roadTime[i]-flightTime[i];
			hashMap.put(i, diff[i]);
		}
		hashMap1 = sortHashMapByValues(hashMap);
		
		for (Integer integer : hashMap1.keySet()){
			if (count==K) break;
			System.out.println(integer + " " + hashMap1.get(integer));
			if (hashMap1.get(integer)>0) {
				arrayList.add(integer);
				count++;
			}
		}
		System.out.println("Arraylist begin");
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
		System.out.println("Arraylist ends");
		for (int i = 0; i < N; i++) {
			System.out.println(sum);
			if (arrayList.contains(i)) 
				sum+=flightTime[i];
			else
				sum+=roadTime[i];
		}
		return sum;
	}
	public static HashMap<Integer, Integer> sortHashMapByValues(
	        HashMap<Integer, Integer> hashMap) {
	    List<Integer> mapKeys = new ArrayList<>(hashMap.keySet());
	    List<Integer> mapValues = new ArrayList<>(hashMap.values());
	    Collections.sort(mapValues);
	    Collections.sort(mapKeys);
	    Collections.reverse(mapValues);
	    Collections.reverse(mapKeys);

	    LinkedHashMap<Integer, Integer> sortedMap =
	        new LinkedHashMap<>();

	    Iterator<Integer> valueIt = mapValues.iterator();
	    while (valueIt.hasNext()) {
	    	Integer val = valueIt.next();
	        Iterator<Integer> keyIt = mapKeys.iterator();

	        while (keyIt.hasNext()) {
	            Integer key = keyIt.next();
	            Integer comp1 = hashMap.get(key);
	            Integer comp2 = val;

	            if (comp1.equals(comp2)) {
	                keyIt.remove();
	                sortedMap.put(key, val);
	                break;
	            }
	        }
	    }
	    return sortedMap;
	}

}
