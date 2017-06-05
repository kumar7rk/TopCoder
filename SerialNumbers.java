// arena testing
package TopCoder;

public class SerialNumbers {
	public static void main(String[] args) {
		String[] serialNumbers = 
//			{"ABCD","145C","A","A910","Z321"}
//			{"34H2BJS6N","PIM12MD7RCOLWW09","PYF1J14TF","FIPJOTEA5"}
//			{"ABCDE", "BCDEF", "ABCDA", "BAAAA", "ACAAA"}
			{"66", "MF5CM7M8151FD1ZGPJQWQ2WQUI2", "656OZULF6SKI5E", "86JWL6D20SIK6AIM5H7S4UV6L0BVE", "MU4I5Z2MW6NXI5KRKTZEHJE", "IOHLO8BW", "TY289WOG7HH76W3GM7OWRRCJCXKDQJG4MFW13H2V2RE3VK", "19MBHGOA540N8DOMRHJYLLE3Q51TCIQ9QQIQ49ADT3GFFZUH1", "2Y59Y9MC1FIRXH9TR5KQJQD34TS9ORHENEPWHB6FZNCFUOR", "DEKY71BOTFB4Y9GVNXWP9HTJSJYGIF2X9UB5A5KAECTBAM5WQ", "0QGU111760J1A69I9SPD6Q065401OTF08HI81JNJB5T7", "SAIVW9QJRQ97NGLLAZTEUI1", "681WA9QQNWU", "JMKO0B9OZDNI0GJR75IB7HVWBYMOR297JWETBAROVSC0P5XXVL", "MTUC1SGAQV3", "MJ72EY8FQHQQTB71EPVRF2GI", "BF5ZAWLOCKY1FD65LNT8KI9ZZB", "RDA1VDGCC3KVIB4QVCCPHRTYSQQLPLG9DXOB334VPE", "IB", "H5COB8A5YJ", "GSBTGVOYHY", "1OETM21115C2T39J31FZG6ER83O3OIC61Q5UYFIKD2JWUNH6", "94QCI0BXIWZUG7ZSZ44ZLYNVY18JQIZX7AS02VW", "GBEX7G2K8V7RN74KUFI2A2WROYEZDGAGQGLS299HO5EKBIBFPH", "J6FU0J1T92Z8TUWJ3NX", "85L8QVMILS9", "6U059VKLRKH8KYU36937X2HEP7ILA6ZMNC4UG", "000LP2VWS4XE9D8"}	
		;
		String[] res = sortSerials(serialNumbers);
		for (String s: res){
			System.out.print(s+ " ");
		}
	}

	public static String[] sortSerials(String[] serialNumbers) {
		for (int i = 0; i < serialNumbers.length; i++) {
			for (int j = i+1; j < serialNumbers.length; j++) {
				if (serialNumbers[i].length()!=serialNumbers[j].length()) {
					if (serialNumbers[i].length()>serialNumbers[j].length()) {
						String temp = serialNumbers[i];
						serialNumbers[i] = serialNumbers[j];
						serialNumbers[j] = temp;
					}
				}
				else{
					if(sum_of_digits(serialNumbers[i]) != sum_of_digits(serialNumbers[j])){
						if(sum_of_digits(serialNumbers[i]) > sum_of_digits(serialNumbers[j])){
							String temp = serialNumbers[i];
							serialNumbers[i] = serialNumbers[j];
							serialNumbers[j] = temp;
						}	
					}
					else if(serialNumbers[i].compareTo(serialNumbers[j])>0){
						String temp = serialNumbers[i];
						serialNumbers[i] = serialNumbers[j];
						serialNumbers[j] = temp;
					}
				}
			}
		}
		return serialNumbers;
	}

	private static int sum_of_digits(String string) {
		int res = 0;
		for (int i = 0; i < string.length(); i++) 
			if (Character.isDigit(string.charAt(i))) res+= string.charAt(i)-'0';
		return res;
	}
}