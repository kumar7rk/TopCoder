package TopCoder;

import icsV1dot1.Time;

public class BearPaints {

	public static void main(String[] args) {
		Time.startTime();
		int W = 99678;
		int H = 93467;
		long M = 1999444332L;
		long result = maxArea(W,H,M);
		System.out.println(result);
		Time.endTime();
	}
	public static long maxArea(int w, int h, long m) {
		long max = 0;
		for (int i = w,count = 0; i >0 && count<10000 ; i--){
			max = Math.max(Math.min(h,(m/i))*i, max);
			count++;
		}
		return max;
	}
	
	//topcoder
	public static long maxArea1(int w,int h,long m){
        long ans=1,W=(long)w,H=(long)h;
        for(long i=1;i<=W;i++){
          ans=Math.max(ans,Math.min(H,(m/i))*i);
        }
        return ans;
    }

}
