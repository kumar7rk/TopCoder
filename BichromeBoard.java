package TopCoder;

public class BichromeBoard {

	public static void main(String[] args) {
		String[] board = {"W?W","??B","???"};
		String result = ableToDraw(board);
		System.out.println(result);
	}
	public static String ableToDraw(String[] board) {
		int n = board.length;
		int m = board[0].length();
		String s = "";
		String s1 = "";
		for (int i = 0; i < m; i++) {
			if (i%2==0) {
				s+="W";
				s1+="B";
			}
			else{
				s+="B";
				s1+="W";
			}
		}
		boolean b = true;
		boolean b1 = true;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i%2==0) {
					if (board[i].charAt(j)==s.charAt(j)||board[i].charAt(j)=='?') {
					}
					else {
						b = false;
					}
					if (board[i].charAt(j)==s1.charAt(j)||board[i].charAt(j)=='?') {
					}
					else {
						b1 = false;
					}
				}
				else{
					if (board[i].charAt(j)==s1.charAt(j)||board[i].charAt(j)=='?') {
					}
					else {
						b = false;
					}
					if (board[i].charAt(j)==s.charAt(j)||board[i].charAt(j)=='?') {
					}
					else {
						b1 = false;
					}
				}
			}
		}
		if (b||b1) return "Possible";
		return "Impossible";
	}

}
