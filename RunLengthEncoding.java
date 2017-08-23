package TopCoder;

import java.util.LinkedList;
import java.util.Queue;

public class RunLengthEncoding {

	public static void main(String[] args) {
		String text = "50A";
		String res = decode(text);
		System.out.println(res);
	}

	public static String decode(String text) {
		String res = ""; 
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < text.length(); i++) {
			String s = "";
			int num = 1;
			char c = text.charAt(i);
			if (Character.isDigit(c)) q.add(Integer.parseInt(c+""));
			else {
				if (q.isEmpty()) q.add(1);
				if (q.size()>2) return "TOO LONG";
				for (Integer integer : q) s +=integer;
				num = Integer.parseInt(s);
				for (int j = 0; j < num; j++) res+=c;
				q.clear();
			}
		}
		if (res.length()<51) return res;
		return "TOO LONG";
	}
}