import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdventDayTwo {

  // To get information, once a bag has been loaded with cubes, the Elf will reach into the bag, grab a handful of random cubes,
  // show them to you, and then put them back in the bag. He'll do this a few times per game.
  //
  //You play several games and record the information from each game (your puzzle input).
  // Each game is listed with its ID number (like the 11 in Game 11: ...) followed by a semicolon-separated
  // list of subsets of cubes that were revealed from the bag (like 3 red, 5 green, 4 blue).
  //
  // The Elf would first like to know which games would have been possible if the bag contained only 12 red cubes, 13 green cubes, and 14 blue cubes?

  //todo - the number of dice in any given round cannot exceed the numbers given above (both in total and for indiv colours)
  // turn the input into a list? remove game [no]:
  // read about parser? can i read the input list and basically scan it for numbers and related phrases? separated by comma
  // you can get the game number by doing index +1 i guess - if game number valid, add number to a list and then I can sum the list
  // can i split the games into the rounds, then have like... switch cases? if includes red then compare number to total?
  // read each line

  static final int MAX_RED = 12;
  static final int MAX_GREEN = 13;
  static final int MAX_BLUE = 14;


  public List<String> GameChecker() throws FileNotFoundException {

    File inputText = new File("AdventCode/src/DayTwoInputText.txt");
    Scanner scanner = new Scanner(inputText);

    List<String> possibleGames = new ArrayList<>();

    while (scanner.hasNextLine()) {
      String gameEntry = scanner.nextLine();
      String[] gameRounds = gameEntry.split("[:;]");

      for(int i = 0; i < gameRounds.length; i++) {
        boolean[] gameValidity = new ArrayList<>;

        String dicePulled = gameRounds[i];
        // game number = index 0
        // if entry incs string, check against valid input
        // if number <= valid input, move to next item, if > then break
        // if you get to the end of the gameRounds list without breaking, add game number to list
        if (dicePulled.contains("red")) {
          String redDice = dicePulled.replaceAll("\\D+", "");
          int pulledRedDice = Integer.parseInt(redDice);
          if (!(pulledRedDice <= MAX_RED)) {
            boolean validRed = false;
            // add value to list? then if all list entries == true we can add the game no to another list? i hate myself.
//            break;
          } else {
            boolean val
          }
        }

        if (dicePulled.contains("green")) {
          String greenDice = dicePulled.replaceAll("\\D+", "");
          int pulledGreenDice = Integer.parseInt(greenDice);
          if (!(pulledGreenDice <= MAX_GREEN)) {
//            break;
          }
        }

        if (dicePulled.contains("blue")) {
          String blueDice = dicePulled.replaceAll("\\D+", "");
          int pulledBlueDice = Integer.parseInt(blueDice);
          if (!(pulledBlueDice <= MAX_BLUE)) {
//            break;
          }
        }
      }


    }

    return possibleGames;

  }

  //todo method to extract ints from list, sum together, return int

}

