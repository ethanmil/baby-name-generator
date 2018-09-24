import java.util.Scanner;

public class BabyNameGenerator {

  public static void main(String[] args) {
    Scanner steve = new Scanner(System.in);
    String userName, partnerName;
    String babyName = "";
    System.out.print("Enter your name: ");
    userName = steve.nextLine();
    if(userName.length() < 3) {
      userName += "oai";
    }
    System.out.print("Enter your partner's name: ");
    partnerName = steve.nextLine();
    if(partnerName.length() < 3) {
      partnerName += "uye";
    }

    steve.close();

    for (int number = 0; number < 3; number++) {
      babyName = babyName + userName.charAt(number) + partnerName.charAt(number);
    }

    String str1 = "" + babyName.charAt(0);
    String str2 = babyName.substring(1,babyName.length());
    str1 = str1.toUpperCase();
    str2 = str2.toLowerCase();
    babyName = str1.concat(str2);
    System.out.println("Baby name: " + babyName);
  }
}