package TopCoder;

import icsV1dot1.Time;

public class Chessboard {

	public static void main(String[] args) {
		
		String cell = "16";
		Time.startTime();
		String res = changeNotation(cell);
//		Time.endTime();
		System.out.println(res);
	}
	public static String changeNotation(String cell){
		if (cell.matches(".*[a-h]+.")){
			int count = cell.charAt(0)-'a';
			int count1 = cell.charAt(1)-'1';
			return count1*8+count+1 + "";
		}
		else{
			int num = Integer.parseInt(cell)-1;
			char val1 = (char) ('a' + num%8);
			int val2 = num/8 +1;
			return val1+""+val2+"";
		}
	}
	public static String changeNotation1(String cell) {
	    if (Character.isDigit(cell.charAt(0))) {
	      int i = Integer.valueOf(cell) - 1;
	      return String.valueOf((char) ('a' + i % 8)) + String.valueOf(i / 8 + 1);
	    } else {
	      int col = cell.charAt(0) - 'a';
	      int row = cell.charAt(1) - '1';
	      return String.valueOf(row * 8 + col + 1);
	    }
	  }
}
