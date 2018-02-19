public class GravityPuzzleEasy{
	public static String[] solve(String[] board){
		String[] result = board;
		for(int i = board.length-2;i>=0;i--){
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