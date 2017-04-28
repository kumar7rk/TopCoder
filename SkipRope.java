package TopCoder;

import java.util.Arrays;

import icsV1dot1.Time;

public class SkipRope {

	public static void main(String[] args) {

		int[] candidates = {150, 87, 175, 169, 86, 135, 163, 99, 88, 118, 118, 136, 136, 110, 123, 117, 97, 129, 154, 95, 83, 152, 123, 125, 128, 84, 152, 144, 85, 165, 141, 148, 153, 125, 165, 88, 91}	
				;
		int height = 98;
		Time.startTime();
		int []res = partners(candidates, height);
		Time.endTime();
		for (int h : res) System.out.print(h+" ");
	}

	public static int[] partners(int[] candidates, int height) {
		int []candDup = new int[candidates.length];
		
		for (int i = 0; i < candidates.length; i++) {
			candDup[i] = candidates[i];
		}
		int[]res = new int[2];
		int count = 0;
		for (int i = 0; i < candidates.length; i++) candidates[i] -= height;
		for (int i = 0; i < candDup.length; i++) {
			if (height==candDup[i]) res[count++] = candDup[i];
			if (count==2) {
				Arrays.sort(res);
				return res;
			}
		}
		for (int i = 1; i < 100; i++) {
			for (int j = 0; j < candidates.length; j++) {
				if (candidates[j]==i) res[count++] = candDup[j];
				if (count==2) {
					Arrays.sort(res);
					return res;
				}
			}
			for (int k = 0; k < candidates.length; k++) {
				if (candidates[k]== -i) res[count++] = candDup[k];
				if (count==2) {
					Arrays.sort(res);
					return res;
				}
			}
		}
		return res;
	}
	public static int []partners1(int[]candidates, int height){
	    int min1=1000;
	    int min2=1000;
	    int d1=0;
	    int d2=0;
	    int ret[]=new int[2];
	    for(int i=0;i<candidates.length;i++){
	      int current=Math.abs(candidates[i]-height);
	      if(current<min1){
	        min1=current;
	        d1=i;
	      }
	      if(current==min1&&candidates[i]>candidates[d1]){
	        d1=i;
	      }
	    }
	    for(int i=0;i<candidates.length;i++){
	      if(i==d1)
	      continue;
	      int current=Math.abs(candidates[i]-height);
	      if(current<min2){
	        min2=current;
	        d2=i;
	      }
	      if(current==min2&&candidates[i]>candidates[d2]){
	        d2=i;
	      }
	    }
	    ret[0]=candidates[d1];
	    ret[1]=candidates[d2];
	    Arrays.sort(ret);
	    return ret;
	  }
}