package TopCoder;
public class HillClimber{
	public static void main(String[] args){
		int[] height = 
		{ 1, 8, 9, 12 }
		;
		int res = longest(height);
		System.out.println(res);
	}
	public static int longest(int[]height){
		int counter = 0;
		int max = -1;
		for(int i = 1;i<height.length;i++){
			if(height[i] > height[i-1]){
				counter++;
			} 
			else{
				max = max<counter? counter:max;
				counter = 0;
			}
		}
		
		return max<counter? counter:max;
	}
}