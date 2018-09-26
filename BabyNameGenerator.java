import java.util.Scanner;

public class BabyNameGenerator {

  public static void main(String[] args) {
    // Initiate variables
    Scanner steve = new Scanner(System.in);
    String userName, partnerName;
    String babyName = "";

    // Requesting user's name
    // If the user has a name shorter than 3 characters, we add a few vowels
    System.out.print("Enter your name: ");
    userName = steve.nextLine();
    if(userName.length() < 3) {
      userName += "oai";
    }

    // Requesting the partner's name
    // If the partner has a name shorter than 3 characters, we add a few vowels
    System.out.print("Enter your partner's name: ");
    partnerName = steve.nextLine();
    if(partnerName.length() < 3) {
      partnerName += "uye";
    }

    // Close the scanner after use
    steve.close();

    // Generating the baby name
    babyName = userName.substring(0, 3) + partnerName.substring(0, 3);

    // Uppercases the first character & lowercases the rest
    String str1 = "" + babyName.charAt(0);
    String str2 = babyName.substring(1,babyName.length());
    str1 = str1.toUpperCase();
    str2 = str2.toLowerCase();
    babyName = str1.concat(str2);

    // Prints out the baby name!
    System.out.println("Baby name: " + babyName);
  }
}