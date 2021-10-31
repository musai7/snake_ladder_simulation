package com.game.laddersnake;
/* The Player then checks for a Option. They are No Play,Ladder or Snake. 
 * Use ((RANDOM)) to check for Options - 
 * In Case of No Play the player stays in the same position
 * In Case of Ladder the player moves ahead by the number of position received in the die
 * In Case of Snake the player moves behind
 */

public class SnakeLadder_uc3 {
	//constant
		public final static int LADDER = 1;
		public final static int SNAKE = 2;
 
	public static void main(String[] args) {
		int player1Position = 0;
		int diceNum = (int) (Math.random() * 6 + 1);
		System.out.println("player one position " + player1Position);
		System.out.println("Dice number : " + diceNum);
		double random = Math.random() * 3;
		switch ((int) random) {
		case LADDER:
			System.out.println("player entered ladder position ");
			player1Position += diceNum;
			break;
		case SNAKE:
			System.out.println("player entered snake position ");
			player1Position -= diceNum;
			break;
		default:
			System.out.println("player entered the no play position ");
			break;
		}
	}

}
