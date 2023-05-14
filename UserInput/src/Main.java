import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = myScanner.nextLine();
        System.out.println("Thank you " + userName);

        System.out.println("What are you currently doing " + userName + "?");
        String jobDone = myScanner.nextLine();
        System.out.println(jobDone + " is a great thing!");
    }
}