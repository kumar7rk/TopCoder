package TopCoder;

public class LengthUnitCalculator {

	public static void main(String[] args) {
		int amount = 10;
		String fromUnit = "in";
		String toUnit = "mi";
		double result = calc(amount,fromUnit,toUnit);
		System.out.println(result);
	}

	private static double calc(int amount, String fromUnit, String toUnit) {
		switch (fromUnit) {
		case "mi": return mi(amount,toUnit);
		case "ft": return ft(amount,toUnit);
		case "in": return in(amount,toUnit);
		case "yd": return yd(amount,toUnit);
		}
		return 0;
	}
	private static double yd(int amount, String toUnit) {
		switch (toUnit) {
		case "ft": return amount*3;
		case "mi": return (double)amount/1760;
		case "in": return amount*3*12;
		}
		return amount;
	}

	private static double in(int amount, String toUnit) {
		switch (toUnit) {
		case "ft": return (double)amount/12;
		case "yd": return (double)amount/3/12;
		case "mi": return (double)amount/1760/3/12;
		}
		return amount;
	}
	private static double ft(int amount, String toUnit) {
		switch (toUnit) {
		case "mi": return (double)amount/1760/3;
		case "yd": return (double)amount/3;
		case "in": return amount*12;
		}
		return amount;
	}
	static double mi(int amount, String toUnit){
		switch (toUnit) {
		case "ft": return amount*1760*3;
		case "yd": return amount*1760;
		case "in": return amount*1760*3*12;
		}
		return amount;
	}
}