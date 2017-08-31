public class XorBoardDivTwo{
	public static void main(String[] args){
		String[] board = 
		{"000","001","010","011","100","101","110","111"}
		;
		int res = theMax(board);
		System.out.println(res);
	}
	public static int theMax(String[]board){
		String[][]board2 = new String[board.length][board[0].length()];
		int row = 0;
		int col = 0;
		int ones_in_row = 0;
		int ones_in_col = 0;
		int max_zeros_row = -1;
		int max_zeros_col = -1;
		
		for(int i = 0; i< board.length;i++){
			for(int j = 0; j<board[0].length();j++){
				board2[i][j] = board[i].charAt(j)+"";
			}
		}
		for(int i = 0; i< board.length;i++){
			int zeros_in_row = 0;
			for(int j = 0; j<board[0].length();j++){
				char c = board[i].charAt(j);
				if(c=='0') zeros_in_row++;
			}
			if(max_zeros_row<zeros_in_row){
				max_zeros_row = zeros_in_row;
				row = i;
			} 
		}
		for(int i = 0; i< board[row].length();i++){
			if(board2[row][i].equals("0"))
				board2[row][i] = "1";
			else if(board2[row][i].equals("1"))
				board2[row][i] = "0";
		}
		System.out.println("Row: "+ row);
		for(int i = 0; i< board.length;i++){
			for(int j = 0; j<board[0].length();j++){
				System.out.print(board2[i][j]+" ");
			}
			System.out.println();
		}
		for(int i = 0; i< board[0].length() ;i++){
			int zeros_in_col = 0;
			for(int j = 0; j<board.length;j++){
				char c = board[j].charAt(i);
				if(c=='0') zeros_in_col++;
			}
			if(max_zeros_col<zeros_in_col){
				max_zeros_col = zeros_in_col;
				col = i;
			} 
		}
		for(int i = 0; i< board.length;i++){
			if(board2[i][col].equals("0"))
				board2[i][col] = "1";
			else if(board2[i][col].equals("1"))
				board2[i][col] = "0";
		}
		System.out.println("Col "+ col);
		for(int i = 0; i< board.length;i++){
			for(int j = 0; j<board[0].length();j++){
				System.out.print(board2[i][j]+" ");
			}
			System.out.println();
		}
		int ones = 0;
		for(int i = 0; i< board.length;i++){
			for(int j = 0; j<board[0].length();j++){
				if(board2[i][j].equals("1")) ones++;
			}
		}		
		return ones;
	}
}
