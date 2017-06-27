package TopCoder;

public class FallingSand {

	public static void main(String[] args) {
		String[] board = 
				
			{"o",
			 ".",
			 "o",
			 ".",
			 "o",
			 ".",
			 "."}
		;
		String[] res = simulate(board);
		for (String s : res) System.out.println(s);
	}

	public static String[] simulate(String[] board) {
		int r = board.length;
		int c = board[0].length();
		String[]res = new String[board.length];
		char[][]boardsC = new char[board.length][board[0].length()];
		
		for (int j = 0; j < board.length; j++) 
			for (int i = 0; i < board[0].length(); i++) 
				boardsC[j][i] = board[j].charAt(i);
			
		boolean needCheck = true;
		while (needCheck) {
			needCheck = false;
			for (int j = r-2; j >=0 ; --j) {
				for (int i = 0; i < c; ++i) {
					if (boardsC[j][i]=='o' && boardsC[j+1][i] == '.') {
						boardsC[j+1][i] ='o';
						boardsC[j][i] = '.';
						needCheck = true;
					}
				}
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				res[i] = new String(boardsC[i]);
			}	
		}
		return res;
	}
}