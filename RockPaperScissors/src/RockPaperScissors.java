import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.print("Choose [r]ock, [p]aper or [s]issors: ");
        String playersInput=scanner.nextLine();
        if (playersInput.equals("r") || playersInput.equals("rock")){
            playersInput=ROCK;
        } else if (playersInput.equals("s") || playersInput.equals("scissors")) {
            playersInput=SCISSORS;
        } else if (playersInput.equals("p")|| playersInput.equals("paper")) {
            playersInput=PAPER;
        } else {
            System.out.println("Invalid Input. Try Again ...");
            return;
        }
        Random random=new Random();
        int computerRandomNumber=random.nextInt(4);
        String computerMove="";
        switch (computerRandomNumber){
            case 1:
                computerMove=ROCK;
                break;
            case 2:
                computerMove=PAPER;
                break;
            case 3:
                computerMove=SCISSORS;
                break;
        }
        System.out.printf("The computer chose %s.\n",computerMove);
        if (playersInput.equals(ROCK) && computerMove.equals(SCISSORS ) || playersInput.equals(PAPER) && computerMove.equals(ROCK)
        ||playersInput.equals(SCISSORS) && computerMove.equals(PAPER)){
            System.out.println("You win");
        } else if (computerMove.equals(ROCK) && playersInput.equals(SCISSORS ) || computerMove.equals(PAPER) && playersInput.equals(ROCK)
                ||computerMove.equals(SCISSORS) && playersInput.equals(PAPER)) {
            System.out.println("You lose.");
        } else {
            System.out.println("This game was a draw.");
        }

    }
}