package topCoderV1dot1;

public class BichromeBoard {

	public static void main(String[] args) {
		String[] board = {"W?W",
						  "??B",
		 				  "???"};
		String result = ableToDraw(board);
		System.out.println(result);
	}

	private static String ableToDraw(String[] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				char[] c1 = board[i].toCharArray();
			}
		}
		return "Possible";
	}

}
