package TopCoder;

public class ObjectFall {

	public static void main(String[] args) {
		int x = 500;
		int y = 800;
		String[] obstacles = {"800 001 500","400 001 499","401 501 999"}; 
		int res = howLong(x,y,obstacles);
		System.out.println(res);

	}

	public static int howLong(int x, int y, String[] obstacles) {
		int time= y;
		while (y>0) {
			for (String string : obstacles) {
				String[] split = string.split(" ");
				int y1 = Integer.parseInt(split[0]);
				int x1 = Integer.parseInt(split[1]);
				int x2 = Integer.parseInt(split[2]);
				if ((y==y1)&&(x>=x1)&& (x<=x2)) {
					x = x2;
					y = y1;
					time+=5;
				}
			}
			y--;
		}
		return time;
	}

}
