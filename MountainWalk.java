package TopCoder;

public class MountainWalk {

	public static void main(String[] args) {
		String[] areaMap = 	
			 	
			{"173642855131893831828253420",
			 "126290035950506994475683704",
			 "381277675415026563959463393",
			 "019782700912864681764582260",
			 "496448425114634806770407597",
			 "049628433145840178727435051",
			 "117194708226266248973780562",
			 "398138380998246682323622510",
			 "408178777661559971959512111"}
		;
		int heightDifference = 8;

		int res = cellsVisited(areaMap,heightDifference);
		System.out.println(res);
	}

	public static int cellsVisited(String[] areaMap, int heightDifference) {
		int n = areaMap.length;
		int m = areaMap[0].length();
		boolean master = true;
		int i = 0;
		int j = 0;
		char c = '0';
		boolean [][]visited = new boolean[n][m]; 
		visited[0][0] = true;
		while (master) {
			boolean b1 = false;
			boolean b2 = false;
			boolean b3 = false;
			boolean b4 = false;
			c = areaMap[i].charAt(j);
			if (i<n-1 &&((Math.abs((areaMap[i+1].charAt(j)-'0')- (c-'0')) <=heightDifference))
					  && visited[i+1][j] == false) {
				visited[i+1][j] = true;
				i++;
				b1 = true;
			}
			else if (j>0 &&((Math.abs((areaMap[i].charAt(j-1)-'0')- (c-'0')) <=heightDifference))
					  && visited[i][j-1] == false) {
				visited[i][j-1] = true;
				j--;
				b2 = true;
			}
			else if (i>0 &&((Math.abs((areaMap[i-1].charAt(j)-'0')- (c-'0')) <=heightDifference))
					  && visited[i-1][j] == false) {
				visited[i-1][j] = true;
				i--;
				b3 = true;
			}
			else if (j<m-1 &&((Math.abs((areaMap[i].charAt(j+1)-'0')- (c-'0')) <=heightDifference))
					  && visited[i][j+1] == false) {
				visited[i][j+1] = true;
				j++;
				b4 = true;
			}
			if (b1 == true||b2 == true||b3 == true||b4 == true) {
				continue;
			}
			else
				master = false;
		}
			
		int count = 0;
		for (boolean[] bs : visited) {
			for (boolean b : bs) {
				if (b== true) {
					count++;
				}
			}
		}
		return count;
	}
}
