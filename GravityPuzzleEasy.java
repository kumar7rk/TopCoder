public class GravityPuzzleEasy{
	public static String[] solve(String[] board){
		String[] result = board;
		for(int k = 0; k<board.length;k++)
		for(int i = 0;i<board.length-1;i++){
			for(int j = 0; j<board[0].length();j++){
				if(result[i].charAt(j)=='#' && result[i+1].charAt(j)=='.'){
					StringBuilder sb = new StringBuilder(result[i]);
					StringBuilder sb1 = new StringBuilder(result[i+1]);
					sb.setCharAt(j, '.');
					sb1.setCharAt(j, '#');

					result[i] = sb+"";
					result[i+1] = sb1+"";
				}
			}
		}
		return result;
	}
}