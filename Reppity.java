package TopCoder;

import icsV1dot1.Time;

public class Reppity{
	public static void main(String[]args){
		
		String input = "abcdabcdabcdabCD";
		Time.startTime();
		int res = longest(input);
		System.out.println(res);
		Time.endTime();
		
	}
	public static int longest(String input){
		
		int x = input.length();
		int max = 0;

		for(int i = 0;i<x;i++){
			for(int j = i+1;j<x+1;j++){
				String temp = input.substring(i,j);
				if (temp.length()>=2 && overlapping(input, temp)) {
					max = max < temp.length() ? temp.length() : max; 
				}
			}
		}
		return max;
	}
	
	
	public static boolean overlapping(String input, String temp){
		 int offset = 0, index = 0, indexTemp = 0;
		 index = input.indexOf(temp, offset);
		 offset = index + temp.length();
		 indexTemp = input.indexOf(temp, offset);
		 if (indexTemp!=-1) {
			return true;
		}
		return false;
	}
}