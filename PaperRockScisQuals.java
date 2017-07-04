package TopCoder;

public class PaperRockScisQuals {

	public static void main(String[] args) {
		String[] players = 
//			{"PPRPS","RRRPR","SSPRS","SSPRR","PPRSP","SPRPS","SPRSP","PRSPR","PRSPR"}
			{"RRRRR","PPPPP","SSSSS","SSSSS","RRRRR","RRRRR"}
//			{"RRRRR","PPPPP","RRRRR","PPPPP"}
		;
		int res = whoPasses(players);
		System.out.println(res);
	}

	public static int whoPasses(String[] players) {
//		double[] points = new double[players.length];
		float[] points = new float[players.length];
		for (int i = 0; i < players.length; i++) {
			for (int j = i+1; j < players.length; j++) {
				int pointI = 0;
				int pointJ = 0;
				for (int k = 0; k < 5; k++) {
					char c1 = players[i].charAt(k);
					char c2 = players[j].charAt(k);
					if (c1=='P') {
						if (c2=='R') pointI++;
						if (c2=='S') pointJ++;
					}
					if (c1=='R') {
						if (c2=='P') pointJ++;
						if (c2=='S') pointI++;
					}
					if (c1=='S') {
						if (c2=='P') pointI++;
						if (c2=='R') pointJ++;
					}
				}
				if (pointI>pointJ) points[i]++;
				else if (pointI<pointJ) points[j]++;
				else if (pointI==pointJ){
					points[i]+=0.5;
					points[j]+=0.5;
				}
			}
		}
		double max = Double.MIN_VALUE;
		int loc = 0;
		for (int i = 0; i < points.length; i++) {
			System.out.println(points[i]);
			if (points[i]>max) {
				max = points[i];
				loc = i;
			}
		}
		return loc;
	}

}
