public class TicTacToeUtilties {
    static int moveNum = 0;
    static String[] moves = new String[9];

    // Start all spots off with a hyphen.
    public static void setupBoard(){
        for(int k = 0; k < moves.length; k++){
            moves[k] = "-";
        }
    }

    // Display the board
    public static void showBoard(){
        System.out.println(moves[0] + " | " + moves[1] + " | " + moves[2]);
        System.out.println("__________");
        System.out.println(moves[3] + " | " + moves[4] + " | " + moves[5]);
        System.out.println("__________");
        System.out.println(moves[6] + " | " + moves[7] + " | " + moves[8]);
    }

    // Make a selection properly based on who's turn it is.
    public static void makeSelection(int boxNum){
        if(moveNum % 2 == 0){
            select0(boxNum - 1);
        }else{
            selectX(boxNum - 1);
        }
        moveNum++;
        showBoard();
        if(checkWin()){
            calculateStats();
            return;
        }
        PlayTicTacToe.makeAMove();
    }

    // Calculate the statistics of the game
    public static void calculateStats(){
        int count0 = 0;
        int countX = 0;
        for(int k = 0; k < moves.length; k++){
            if(moves[k].equals("0")){
                count0++;
            }else if(moves[k].equals("X")){
                countX++;
            }
        }
        System.out.println("Congratulations to our winner!  This game's statistics are below.");
        System.out.println("0 made " + count0 + " moves.");
        System.out.println("X made " + countX + " moves.");
        System.out.println("There were " + (9 - count0 - countX) + " unused spaces on the board.");
        System.out.println("Feel free to play again sometime!");
    }


    public static void select0(int boxNum){
        moves[boxNum] = "0";

    }

    public static void selectX(int boxNum){
        moves[boxNum] = "X";
    }

    public static boolean checkWin(){
        if(moves[0].equals(moves[1]) && moves[1].equals(moves[2]) && !moves[0].equals("-")){ return true; }
        if(moves[3].equals(moves[4]) && moves[4].equals(moves[5]) && !moves[3].equals("-")){ return true; }
        if(moves[6].equals(moves[7]) && moves[7].equals(moves[8]) && !moves[6].equals("-")){ return true; }

        if(moves[0].equals(moves[4]) && moves[4].equals(moves[8]) && !moves[0].equals("-")){ return true; }
        if(moves[6].equals(moves[4]) && moves[4].equals(moves[2]) && !moves[6].equals("-")){ return true; }

        return false;
    }


}
