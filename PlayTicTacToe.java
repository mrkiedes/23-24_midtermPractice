import java.util.Scanner;

public class PlayTicTacToe {

    // Create the Scanner
    static Scanner input = new Scanner(System.in);

    public static void main(String args[]){
        // Setup the array to hold the moves.
        TicTacToeUtilties.setupBoard();

        printDirections();

        makeAMove();


    }

    public static void printDirections(){
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("The first person to enter in a symbol will be the x's and the second will be the 0's");
        System.out.println("Simply select the number of the box.");
        System.out.println("Boxes are numbered 1 to 9 from top left to the right and then down.  Use below for reference");
        System.out.println("When someone wins you will also get to find out some statics about each individual game!");
        System.out.println("1 | 2 | 3");
        System.out.println("__________");
        System.out.println("4 | 5 | 6");
        System.out.println("__________");
        System.out.println("7 | 8 | 9");
    }

    public static void makeAMove(){
        System.out.println("What box would you like to select?");
        int boxSelection = input.nextInt();

        // Check if the output is valid. If not make them
        if(boxSelection > 0 && boxSelection < 10) {
            TicTacToeUtilties.makeSelection(boxSelection);
        }else{
            System.out.println("Invalid selection - please try again.");
            makeAMove();
        }
    }

}
