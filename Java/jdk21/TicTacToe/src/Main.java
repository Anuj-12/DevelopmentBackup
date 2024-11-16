import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static ArrayList<Character> blocks = new ArrayList<>(Arrays.asList(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '));
    public static ArrayList<Integer> theChosenOnes = new ArrayList<>();
    public static boolean isDumb = false;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        for (int i = 0; blocks.contains(' '); i++) {

            int output = checkWin();

            if(output == 1){
                theBox();
                System.out.println("Player2 wins");
                return;
            }

            if(output == 0){
                theBox();
                System.out.println("Player1 wins");
                return;
            }

            theBox();
            System.out.println("Please enter your choice");
            choice = scanner.nextInt();
            selection(i, choice);

            if(isDumb){
                i--;
                isDumb = false;
            }
        }
        theBox();
    }

    public static int checkWin( ) {

        char[] firstPlayerWin = {'X', 'X', 'X'};
        char[] secondPlayerWin = {'O', 'O', 'O'};

        char[][] winCondition = {
                {blocks.get(0), blocks.get(1), blocks.get(2)},  //all the rows for the win condition
                {blocks.get(3), blocks.get(4), blocks.get(5)},
                {blocks.get(6), blocks.get(7), blocks.get(8)},
                {blocks.get(0), blocks.get(3), blocks.get(6)},  //all the columns for the win condition
                {blocks.get(1), blocks.get(4), blocks.get(7)},
                {blocks.get(2), blocks.get(5), blocks.get(8)},
                {blocks.get(0), blocks.get(4), blocks.get(8)},  //all the diagonals for the win condition
                {blocks.get(2), blocks.get(4), blocks.get(6)}
        };

        for (char[] situation : winCondition) {

            if (Arrays.equals(situation, firstPlayerWin)) {
                return 0;
            }
            if (Arrays.equals(situation, secondPlayerWin)) {
                return 1;
            }
        }
        return 2;
    }
    public static void selection ( int turn, int choice){

            if (!theChosenOnes.contains(choice)) {
                theChosenOnes.add(choice);
                blocks.set(choice, turn % 2 == 0 ? 'X' : 'O');
                return;
            }

            System.out.println("Invalid value");
            isDumb = true;
    }

    public static void theBox() {
            System.out.println(blocks.get(0) + " |" + blocks.get(1) + "  | " + blocks.get(2));
            System.out.println("__+___+__");
            System.out.println(blocks.get(3) + " |" + blocks.get(4) + "  | " + blocks.get(5));
            System.out.println("--+---+--");
            System.out.println(blocks.get(6) + " |" + blocks.get(7) + "  | " + blocks.get(8));
    }
}

