import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Current song is playing");
        boolean isCurrentSongOnRepeat = true;

        while(isCurrentSongOnRepeat) {
            System.out.println("Would you still like to repeat the current song? Type yes/no:  ");

            Scanner choice = new Scanner(System.in);
            String userChoice = choice.nextLine();

            if (userChoice.equalsIgnoreCase("yes")) {
                System.out.println("Current song on repeat...");
            } else if (userChoice.equalsIgnoreCase("no")) {
                System.out.println("New song playing...");
            } else {
                System.out.println("Type yes/no to proceed");
            }
        }





    }
}
