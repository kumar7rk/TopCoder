package TopCoder;
import java.util.ArrayList;

public class MagicStonesStore {
	public static void main(String[] args){
		MagicStonesStore magicStonesStore = new MagicStonesStore();
		String res = magicStonesStore.ableToDivide(20);
		System.out.println(res);
	}
	public String ableToDivide(int n){
		if(n==1) return "NO";
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList = primeNumbers(2*n);
		if (arrayList.contains(n)) return "YES";
		for (int i = 0; i < arrayList.size(); i++) 
			for (int j = i+1; j < arrayList.size(); j++) 
				if (arrayList.get(i)+arrayList.get(j) == 2*n) return "YES";
		return "YES";
	}
	public ArrayList<Integer> primeNumbers(int d) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		int i = 2;
		arrayList.add(1);
		while(d !=1){
			if(d%i ==0 ){
				d = d/i;
				arrayList.add(i);
			}
			else i++;
		}
		return arrayList;
	}
}