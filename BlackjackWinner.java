package TopCoder;

import static org.junit.Assert.assertEquals;

public class BlackjackWinner{
	public static void main(String[]args){
		
		int bet = 26;
		int dealer = 21;
		int dealerBlackjack = 1;
		int player = 21;
		int playerBlackjack = 0;
		int res = winnings(bet, dealer, dealerBlackjack, player, playerBlackjack);
		System.out.println(res);
	}
	public static int winnings(int bet, int dealer, int dealerBlackjack, int player, int playerBlackjack){
		if(dealerBlackjack == 1 && playerBlackjack == 1) return 0;
		if(dealerBlackjack == 1 && playerBlackjack == 0) return -bet;
		if(dealerBlackjack == 0 && playerBlackjack == 1) return (int)(bet*1.5);
		
		if((player > dealer && player <=21) || (dealer > 21 && player <=21)){
			if(playerBlackjack == 0) return bet;
			else return (int)(bet*1.5);
		}
		if(player == dealer && player <=21) return 0;
		
		if (player > 21) return -bet;

		return 100;
	}
}