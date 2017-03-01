package topCoderV1dot1;

public class BearPasswordAny {
  
	public static void main(String[] args) {
		int[]x = {10, 5, 2, 1, 0, 0, 0, 0, 0, 0};
		System.out.println(findPassword(x));
	}
	
	public static String findPassword(int[] x) {
 
        int N = x.length;
        
        if(x[0] != N) return "";
        
        // if the value increases with index
        for(int i=1; i<N; i++)
            if(x[i] > 0 && x[i] > x[i-1]-1) return "";
 
        String res = "";
        boolean onA = true;
        
        for(int i=N-1; i>=0; i--){
            if(x[i] < 0) return "";
            if(x[i] > 0){
                while(x[i]-->0){ // run for all the indexes till the value of is > 0
//                    if the value of onA is true concat a else b
                	String rep = onA?"a":"b";
                    String toAdd = "";
                    // add till 
                    for(int j=0; j<(i+1); j++) toAdd = rep + toAdd;
                    res = toAdd+res;
                    onA = !onA;
                    for(int j=i-1; j>=0; j--)
                        x[j]-=(i-j+1);
                }
            }
        }
        if(res.length() != N) return "";
        return res;
	}
}