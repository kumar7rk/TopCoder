package TopCoder;
public class PenguinTiles{
	public static void main(String[] args){
		String[] tiles = {  "PPPPPPPP", ".PPPPPPP"};
		int res = minMoves(tiles);
		System.out.println(res);
	}
	public static int minMoves(String[]tiles){
		int row = 0;
		int column = 0;
		boolean flag = false;
		for(int i = 0;i<tiles.length;i++){
			for(int j = 0;j<tiles[0].length();j++){
				if(tiles[i].charAt(j)=='.'){
					row = i;
					column = j;
					flag = true;
					break;
				}
			}
			if(flag) break;
		}
		if(row<tiles.length-1 && column<tiles[0].length()-1) return 2;
		if(row<tiles.length-1 || column<tiles[0].length()-1) return 1;
		if((row==tiles.length-1 && column==tiles[0].length()-1)||row==tiles.length-1 && (column==tiles[0].length()-1)) return 0;
		else return 0;
	}
}