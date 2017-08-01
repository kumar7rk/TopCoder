package TopCoder;

import java.util.Arrays;

public class ListeningSongs {

	public static void main(String[] args) {
		int []durations1 = {100, 200, 300, 400, 500, 600};
		int []durations2 = {100, 200};
		int minutes = 1000;
		int T = 3;
		int res = listen(durations1,durations2, minutes, T);
		System.out.println(res);
	}
	public static int listen(int[] durations1, int[] durations2, int minutes, int T){
		int res = 0;
		int total_time = minutes*60;
		int rem = 0;
		if (T> durations1.length || T>durations2.length) return -1;
		int array[] = new int[durations2.length+durations1.length];
		array = combineString(durations1,durations2,T);
		Arrays.sort(durations1);
		Arrays.sort(durations2);
		Arrays.sort(array);
		int sum = 0;
		for (int i = 0; i < T; i++) sum+=durations1[i]+durations2[i];
		if (sum > total_time) return -1;
		if (sum == total_time) return 2*T;
		res = 2*T;
		rem = total_time-sum;
		for (int j = 0; j < array.length; j++) {
			if (array[j] == 0) continue;
			if (rem>=array[j]) {
				rem-= array[j];
				res++;
			}
			else return res; 
		}
		return res;
	}
	public static int[] combineString(int[] durations1, int[] durations2, int T){
        int length = durations1.length + durations2.length;
        int[] result = new int[length];
        System.arraycopy(durations1, T, result, T, durations1.length-T);
        System.arraycopy(durations2, T, result, durations1.length, durations2.length-T);
        return result;
    }
}