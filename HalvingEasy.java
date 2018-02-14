public class HalvingEasy{
	
	static int counter;
	public static int count(int[] S, int T){
		
		for(int s : S)
			while(s>0){
				s/=2;
				if(s==T)
					counter++;
			}
        return counter;
	}
	
}