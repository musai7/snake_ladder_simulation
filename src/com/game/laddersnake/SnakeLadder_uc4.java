package com.game.laddersnake;
/*snake ladder simulation player start position zero
 * Repeat till the Player reaches the winning position 100.
 *  Note In case the player position moves below 0, then the player restarts from 0
 *  Note in case the player position go above 100,
 *  the player stays in the same previous position till the player gets the exact number that adds to 100.
*/
public class SnakeLadder_uc4 {
	// constant
	public final static int LADDER = 1;
	public final static int SNAKE = 2;

	public static void main(String[] args) {
		int player1Position = 0, temp = 0;
		while (true) {
			int diceNum = (int) (Math.random() * 6 + 1);
			System.out.println("dice value " + diceNum);
			temp = player1Position;
			player1Position += diceNum;
			if (player1Position > 100) {
				player1Position = temp;
			}
			if (player1Position == 100) {
				break;
			}
			System.out.println("player one position " + player1Position);
			double random = Math.random() * 3;
			switch ((int) random) {
			case LADDER:
				System.out.println("player entered ladder position ");
				player1Position += diceNum;
				if (player1Position > 100) {
					player1Position = temp;
				}
				break;
			case SNAKE:
				System.out.println("player entered snake position ");
				player1Position -= diceNum;
				temp = player1Position;
				if (player1Position < 0) {
					player1Position = 0;
				}
				break;
			default:
				System.out.println("player entered the no play position ");
				break;
			}
			System.out.println("player one position " + player1Position);
			if (player1Position == 100) {
				break;
			}

		}
	}
}
