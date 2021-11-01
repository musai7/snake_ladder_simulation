package com.game.laddersnake;

public class SnakeLadder_uc6 {
	public final static int LADDER = 1;
	public final static int SNAKE = 2;

	public int snakeLadderGame(int playerPosition, int player) {
		int temp = 0;
		int diceNum = (int) (Math.random() * 6 + 1);
		System.out.println("now player " + player + " turn");
		System.out.println("dice number " + diceNum);
		playerPosition += diceNum;
		if (playerPosition > 100) {
			playerPosition -= diceNum;
		}
		if (playerPosition == 100) {
			return playerPosition;
		}
		System.out.println("player" + player + "position " + playerPosition);
		double random = Math.random() * 3;
		temp = playerPosition;
		switch ((int) random) {
		case LADDER:
			System.out.println("player entered ladder position ");
			playerPosition += diceNum;
			if (playerPosition > 100) {
				playerPosition = temp;
			}
			System.out.println("player get another chance to roll dice ");
			SnakeLadder_uc6 game = new SnakeLadder_uc6();
			playerPosition = game.snakeLadderGame(playerPosition, player);
			break;
		case SNAKE:
			System.out.println("player entered snake position ");
			playerPosition -= diceNum;
			temp = playerPosition;
			if (playerPosition < 0) {
				playerPosition = 0;
			}
			break;
		default:
			System.out.println("player entered the no play position ");
			break;
		}
		System.out.println("player" + player + "position " + playerPosition);
		return playerPosition;
	}

	public static void main(String[] args) {
		int player1Position = 0, player2Position = 0, player1 = 1, player2 = 2;

		 SnakeLadder_uc6 game = new SnakeLadder_uc6();

		while (true) {
			player1Position = game.snakeLadderGame(player1Position, player1);
			player2Position = game.snakeLadderGame(player2Position, player2);
			if (player1Position == 100 || player2Position == 100) {
				if (player1Position == 100) {
					System.out.println("player one win the game lets celabrate ");
				} else
					System.out.println("player two win the game lets celabrate ");

				break;
			}

		}
		System.out.println("player one position " + player1Position);
		System.out.println("player two position " + player2Position);
	}

}
