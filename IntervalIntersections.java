public class IntervalIntersections{

	public static int minLength(int x1, int y1, int x2, int y2){
		if(x1<=y2&&x1>=x2) return 0;
		if(y1<=x2&&y1>=y2) return 0;
		if(x2<=y1&&x2>=x1) return 0;
		if(y2<=y1&&y2>=x1) return 0;
		
		if(y1<x2) return x2-y1;
		else return x1-y2;
		
	}
}

