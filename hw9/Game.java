import java.util.Scanner;

class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player 1 please enter your name: ");
        String playerName1 = scanner.nextLine();
        Player1 player1 = new Player1(playerName1);

        System.out.print("Player 2 please enter your name: ");
        String playerName2 = scanner.nextLine();
        Player2 player2 = new Player2(playerName2);

        while (true) {
            player1.makeMove();
            player2.makeMove();

            System.out.println(player1.getName() + " chose " + player1.getMove());
            System.out.println(player2.getName() + " chose " + player2.getMove());

            Move player1Move = player1.getMove();
            Move player2Move = player2.getMove();

            if (player1Move == player2Move) {
                System.out.println("It's a tie! Nobody wins");
            } else if ((player1Move == Move.ROCK && player2Move == Move.SCISSORS) ||
                    (player1Move == Move.PAPER && player2Move == Move.ROCK) ||
                    (player1Move == Move.SCISSORS && player2Move == Move.PAPER)) {
                System.out.println(player1.getName() + " wins!");
            } else {
                System.out.println(player2.getName() + " wins!");
            }

            System.out.print("Play again? (yes/no): ");
            String playAgain = scanner.nextLine();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }
        System.out.println("Thank you for playing!");
    }
}