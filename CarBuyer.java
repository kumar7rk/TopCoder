package TopCoder;

public class CarBuyer {

	public static void main(String[] args) {
		String[] cars = {"10000 1000 1"} 
//			{"21973 49 10", "18435 409 38", "14845 762 10", "19179 537 47", "8028 38 29", "15859 774 94", "19613 60 84", "5196 379 94", "29243 34 75", "10120 795 5", "4979 247 56", "3255 515 49", "15668 890 76", "11210 832 9", "10877 681 49", "26541 300 90", "13040 820 75", "12180 76 42", "19335 454 10", "617 957 95", "19111 360 23", "21357 66 47", "22530 496 86", "27481 727 10", "17936 420 62", "25512 980 98", "22022 848 40", "16857 407 33", "26763 127 82", "5822 718 38", "11428 765 94", "27190 12 3", "19340 497 26", "13802 542 47", "11120 858 10", "20962 204 47", "31818 146 36", "3078 617 22", "10574 109 70", "16371 980 96", "20136 232 5", "13989 361 15", "18044 13 37", "28129 422 73", "4451 181 96", "13681 517 45", "7648 244 82", "25728 943 62", "3965 351 94", "21445 640 9"}
		;
		int fuelPrice = 100000;
		int annualDistance = 100;
		int years = 74;
		double res = lowestCost(cars, fuelPrice, annualDistance, years);
		System.out.println(res);
	}

	public static double lowestCost(String[] cars, int fuelPrice, int annualDistance, int years) {
		double cost = 0;
		double tax = 0;
		double eff = 0;
		double[] totalCost = new double[cars.length];
		for (int i = 0; i < cars.length; i++) {
			String []cte = cars[i].split(" ");
			cost = Double.parseDouble(cte[0]);
			tax = Double.parseDouble(cte[1]);
			eff = Double.parseDouble(cte[2]);
			double totalFuelCost = (fuelPrice*annualDistance*years)/eff;
			double totalTax = tax*years;
			totalCost[i] = totalFuelCost+totalTax+cost;
		}
		double minCost = Double.MAX_VALUE;
		for (int i = 0; i < totalCost.length; i++) {
			if (totalCost[i]<minCost) {
				minCost = totalCost[i];
			}
		}
		return minCost;
	}
}
