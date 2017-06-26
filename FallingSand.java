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
		String[]res = new String[board.length];
		char[][]boardsC = new char[board.length][board[0].length()];
		
		for (int j = 0; j < board.length; j++) 
			for (int i = 0; i < board[0].length(); i++) 
				boardsC[j][i] = board[j].charAt(i);
			
//		for (int j = 0; j < boardsC.length-1; j++) {
		boolean needCheck = true;
		while (needCheck) {
			
			needCheck = false;
			for (int j = boardsC.length-2; j >=0 ; --j) {
				for (int i = 0; i < boardsC[0].length; ++i) {
					char current = boardsC[j][i];
					char next = boardsC[j+1][i];
					if (current=='o') {
						if (next == '.') {
							boardsC[j+1][i] ='o';
							boardsC[j][i] = '.';
							needCheck = true;
						}
					}
				}
			}
		}
		for (int i = 0; i < boardsC.length; i++) {
			for (int j = 0; j < boardsC[0].length; j++) {
				res[i] = new String(boardsC[i]);
			}	
		}
		return res;
	}
}