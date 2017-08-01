package TopCoder;

public class CityMap {
	public static void main(String[] args) {
		String[] cityMap = {"WPWDPZT.PPT.PPRPDWPWPPJWCPTPPPDDTWDGTPTPWPPJWPRJDJ", "PJPDPTCPWPXRTPZ.DPWPDWPWW.PJWDPGJPPPWZWJGPWPPWPPWD", "WZZTXPJWPDPPJTWRPPWTPWTWWWTCPWWRWTPWPTRDTRWWPPDRPP", "WCJPDRPPWJCPWWWJWTPWDWT.WPDPPPTCJTJTJJWJTWPJPPWDPD", ".PPWJPDWPXPJJDTWRPXTW.WTTPJDRW.WPPJTPJJPXJDTWRTWPP", "DPDJDXDDZWPWJ.DXPXDWJZTZWRWPJDXXWWRPJPPDTPTPWPPPWG", "XJJ.DGWPJPZPDZXGPDTGPPJTJWPPWWWD.GWJPPPXPPPJGPPWDJ", "TPPDPTDJWWPWWPJWDWTRPWPPPPWT.TPPPGRJJPJWWPPPZPWCPD", "WPTPPPRTDPTXPWPWXPWWPPTDXJPJXPPWJWPDDGPWPWPDPJPWWR", "PZRGWDT.ZPRTRPPWWPWDTWPDPRWPPTWWT.DPPPTDPZWJJXDRPJ", "PJPRPJTJJPPWWJDCPJWJPWTJTWRJPJWJJTPDJJPJWPPTPZPWP.", "PPTPPDJX.DPPWDPRCRPDJPPCGWJWPPPTPTTPPDJPPPTDPWGZDD", "DPJWTWWPPPPPJPPTJWJPTJWRZWPPWDZDWRW.DWWJWTPWPXPJWT", "ZJWPWPJWDJPRWWCWJWDDZTJTD.WPDPWWPDWTWTRTDPWJPDPWDT", "PPJPPWGWDJPXWWDPJDWTPTP.PWT.DTWP.TWTWJWWJDPPZ.C.DP", "WWTPW.PPPPWXDDDRPGTJPWPPPPWPTXTJDPPTJDPPRDWPPZPJRP", "TTJRCJPWXWPPPJPPWGWTP.JP.JTPGTTJPWTJJTPTPTJDDPPPPW", "JXPPWDWPRPDPJWWTPRWTWDPPJTJPWT.TDWTTPPJWJ.PTWDWWJJ", "JWPZPWCPJ.WTCWJPWWGPPJTPDWPXDWPPJRPTDTPTWWDWTTPTTT", "PPWPPTJJJGPWDPWPPPPPCP.PWZPXRGPPRPDRXPZTWC.TPPJZJD", "PTRWPDP.DPRWDJPJPPTTWDJJJPTTTWWWPPPPWPDPPDJDJPPZPW", "JTRDPWRJWZJPDPDCPPPWCJDWWGWPPWCXPDPWWWPPPT.TRTPJ.P", "TRWDJTPDJPCPGWWTWPJPPJJWPTT.JWJWTTXJWTZWWJRWPJDWPT", "TXCTPPTCPPWPJWPWWPTPTJXPPZGTDJWPJJPJDJPPDJPGWDPPTP", "ZDJP.WJPWDDPDJJTWWPXWTJWDPPPPJTPTDRPJDWGWJWZJWPPTW", "R.WTWWWCWDTJZPWTTRPZJWGPCRJTWTPJCPPWT.PPPPJJDPZPDT", "PJJZJG.TDPPPRPTPGWJTTJPTPDP.PPWPDPJT.ZDDPRWWDT.PPJ", "PWWWXRPPTXPJWCDJWWPWJPPWDTRJDWJJTTRPWDTPWZJGDDWWPP", "JWCJTPPTJPPC.WDDWGWTTWTXDWPPPTDGPT.PDPJPTWPPPTDJJW", "TWPTCZWPW.TPZPWPZWWDTPWPPDTDPPXPPTPJZPJZJJJPPTPPDD", "XCPPPPWWZPWDTZDWPPDZPWWZPTGWJCPPZPTWPRPGPJPDTCPPPW", "WTPPPPWJPDDJDTWWWPWWPTWTJTDWJTJPDGPWPDRTPWPPJJDPJZ", "CWPW.PJG.PDJDDP.WDDWDPPDPJPPTJPWWPWDWP.JPWWWPDJJPT", "TDPDPPPPPTJDPJPJ.TTJPPPXDPPPT.WWXRPWTTJWDPGTXWPGPP", "WJZDPPWCJWXJDWTDTPXDWTTJDPTPPTPRWRPDJWWXPJZXRWTWDD", "WDWDTPWWWWPPPPPTGWPWTRGPPPTPWPDPPPWPDRWJPDTPCPPZDJ", "WPTPPDWTDTXJPWJPT..WCPPTTTWPW.ZPPWWJXTWJDDPTTWPWPJ", "TPTWP.WPJWRP.WTJTZWWCPPPPDWWZDJWPWDWPD.PPRWTPWPRCW", "TWPTJGPGTTPPWW.TTWPWWWTWTPTDWJJJTPDWPDJPTWWRPXGJPJ", "WPWPPPJZZTPPTCTPDDJWPTT.TJR.DXPDTRJDTTPPPDPWPGPWDP", "PPPZWWPP.PPPJJJWTJPJJPWWTRPXPRGJPCWTPPPTWTZWPZWPJT", "WWPPXJGPRTWPWWDPPDWPPR.WWPTWDDZWJTZPPDDDJWPDWTTTTP", "J.J.PPPDDWRWTPPTPPTDWPPZP.PWPWPDXPDDWRPTTWJZPWDRDP", "PWRCJWTPDPZCCJWCPWWXPPDTWPTDGWDJXPWZDPDDDTWPDWWPPP", "RPJTWPPPRCPDZPTPWDPPWDDWDJZJJPTJPWRGWW.TTPTJJGXWTJ", "PWTCTPTGZPPTWWPPPZWDWPCZGJGPGTPWDJXDTDGJPPPWZTTWPZ", "TRRWTWWTGJWTWCWPWGZDWTCWWPZPDWJPJPWPWCZTPPWDTDJPTP", "J.PTZJWPRZDJDPJZJWWPWPPZTDWDPPTPWJPTDPTWWWTPRTWRWT", "PDCWPPWJWTPTJTDDPWTPPPPGPCPPPDPTJPGWZPPTDWWDPDTPJR", "CTPDPPZDWCDZPWPGWPJXDWWPWWWPWPTDDPDWRPWJWDXGGPGJGT"};
		int[] POI = {743, 268, 55, 284, 310, 58, 89, 83, 63, 480};
		String res = getLegend(cityMap, POI);
		System.out.println(res);
	}
	public static String getLegend(String[] cityMap, int[] POI) {
		String res = "";
		int count[] = new int[26];
		for (String s : cityMap) {
			for (int i = 0; i < s.length(); i++) {
				char c1 = s.charAt(i);
				if (c1!='.') count[(int)c1-'A']++;
			}
		}
		for (int i = 0; i < POI.length; i++) {
			for (int j = 0; j < count.length; j++) {
				if (POI[i] == count[j]) res = res.concat((char)(j+ 'A') +"");
			}
		}
		return res;
	}
}