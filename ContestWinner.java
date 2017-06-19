package TopCoder;

public class ContestWinner {

	public static void main(String[] args) {
		int[] events = 
			{123,123,456,456,456,123}
		;
		int res = getWinner(events);
		System.out.println(res);
	}
	
	public static int getWinner(int[] events) {
		int []event = new int[1000001];
		int max = 0;
		int winner = 0;
		for (int i = 0; i < events.length; i++){
			event[events[i]]++;
			if (event[events[i]]>max){
				winner = events[i];
				max = event[events[i]];
			}
		}
		return winner;
	}

}
