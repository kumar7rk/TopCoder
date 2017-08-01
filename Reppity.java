package TopCoder;

public class Reppity{
	public static void main(String[]args){
		String input = "ABABA";
		int res = longest(input);
		System.out.println(res);
	}
	public static int longest(String input){
		int x = input.length();
		int max = 0;
		String maxS = "";
		for(int i = 0;i<x-1;i++){
			for(int j = i+1;j<x;j++){
				String temp = input.substring(i,j);
				if (overlapping(input, temp)) {
					if (max < temp.length()) {
						max = temp.length();
						maxS = temp;
					}
				}
			}
		}
		System.out.println(maxS);
		return max;
	}
	//checks overlapping and if the substring exists twice
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