package TopCoder;

public class SymmetryDetection {

	public static void main(String[] args) {
		String[] board = {"#..", "#..", "#.."}	;
		String res = detect1(board);
		System.out.println(res);
	}

	public static String detect(String[] board) {
		int n = board.length;
		int m = board[0].length();
		boolean h = true;
		boolean v = true;

//		horizontal;
		double h1 = (double) (n-1)/2;
		for (int i = 0; i < h1; i++) {
			String val = board[i];
			int j = n-1-i; 
			String jj = board[j];
			if (!val.equals(jj)) {
				h = false;
				break;
			}
			if (!h) break;
		}

//		vertical

		double v1 = (double)(m-1)/2;
		for (int i = 0; i < n; i++) {
			String val = board[i];
			for (int j = 0; j < v1; j++) {
				if (j==v1) continue;
				char cj = val.charAt(j);
				int k = m-1-j;
				char ck = val.charAt(k);
				if (cj!=ck) {
					v = false;
					break;
				}
			}
			if (!v) break;
		}
		if (h && v) return "Both";
		if (h) return "Horizontally symmetric";
		if (v) return "Vertically symmetric";
		return "Neither";
	}
	public static String detect1(String[] board) {
	    boolean v = true, h = true;
	    for(int i=0;i<board.length;i++){
	      if(!(new StringBuilder(board[i])).reverse().toString().equals(board[i])){
	        v = false; break;
	      }
	    }
	    for(int i=0;i<board[0].length();i++){
	    	System.out.println(i);
	      String x = "";
	      for(int j=0;j<board.length;j++){
	    	  x += board[j].charAt(i);
	    	  System.out.println(x);
	      }
	      if(!(new StringBuilder(x)).reverse().toString().equals(x)){
	        h = false; break;
	      }
	    }
	    if(v && h) return "Both";
	    if(v) return "Vertically symmetric";
	    if(h) return "Horizontally symmetric";
	    return "Neither";
	  }
	 
}