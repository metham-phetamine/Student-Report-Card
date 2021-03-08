import actions.Features;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for(int i = 0; i < 20; i++){
            int userInput = giveUserOptions();
            takeActions(userInput);
        }
    }

    /**
     * user will be given some options to choose from
     * he/she has 7 options and the next steps or program will
     * executed based on users choose.
     *
     * @return returns the number of the option user chosen.
     */
    private static int giveUserOptions() {
        System.out.println("Here are some options you can choose from");
        System.out.println("1.Create Report Card.");
        System.out.println("2.Display reports sorted by name.");
        System.out.println("3.Display reports sorted by marks.");
        System.out.println("4.Display specific Record.");
        System.out.println("5.Display student Grades.");
        System.out.println("6.Modify student records.");
        System.out.println("7.Delete Record.");

        System.out.print("Enter Your input: ");
        return new Scanner(System.in).nextInt();  //return user input
    }

    /**
     * take several actions based on user's input.
     * @param userInput is the user's chosen number.
     */
    private static void takeActions(int userInput) {
        Features actions = new Features();

        switch (userInput) {
            case 1 -> actions.creatingReportCard();
            case 2 -> actions.sortByName();
            case 3 -> actions.sortByMarks();
            case 4 -> actions.displaySpecificRecord();
            case 5 -> actions.displayStudentGrade();
            case 6 -> actions.modifyRecord();
            case 7 -> actions.deleteRecord();
            default -> System.out.println("Invalid Choose!!");
        }
    }
}
