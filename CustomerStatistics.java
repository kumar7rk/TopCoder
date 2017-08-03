package TopCoder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class CustomerStatistics {

	public static void main(String[] args) {
		String[] customerNames = 
			{"ANDREW", "BILL", "CINDY", "DOH", "ERGH", "FOO", "GOO", "HMPH"}
		;
		String [] res = reportDuplicates(customerNames);
		for (String s: res) System.out.println(s);
	}

	@SuppressWarnings("rawtypes")
	public static String[] reportDuplicates(String[] customerNames) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		for (String s : customerNames) {
			if (hashMap.containsKey(s)) hashMap.put(s, hashMap.get(s)+1);
			else
				hashMap.put(s,1);
		}
		int counter = 0;
		Map<String, Integer> map = new TreeMap<String, Integer>(hashMap);
		Iterator it = map.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        if((int)pair.getValue()>1){
	        	counter++;
	        }
	    }
	    String[] res = new String[counter];
	    Iterator it1 = map.entrySet().iterator();
	    while (it1.hasNext()) {
	        Map.Entry pair = (Map.Entry)it1.next();
	        if((int)pair.getValue()>1){
	        }
	    }
		return res;
		
	}

}
