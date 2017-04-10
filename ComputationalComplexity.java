package TopCoder;
public class ComputationalComplexity{
	public static void main(String[] args){
		int[] constant = 
			{5, 50, 45}
			;
		int[] power = {2, 1, 1}
		;
		int[] logPower = 		{0, 1, 1};
		int N = 400 ;
		int res = fastestAlgo(constant, power, logPower, N);
		System.out.println(res);
	}
	public static int fastestAlgo(int[] constant, int[] power, int[] logPower, int N){
		int fastest = 10;
		double min = Double.MAX_VALUE;
		for(int i = 0; i< constant.length;i++){
			double value = constant[i]* Math.pow(N,power[i]) * Math.pow(Math.log(N),logPower[i]);
			if(value < min ){
				min = value;
				fastest = i;
			}
		}
		return fastest;
	}
}