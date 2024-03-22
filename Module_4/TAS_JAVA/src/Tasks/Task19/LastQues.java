package Tasks.Task19;

import java.util.Scanner;

public class LastQues {
    private  String instanceMember = "Delta";

    public void printName(String name) {
        System.out.println("Instance member: " + instanceMember);
        System.out.println("User's name: " + name);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        LastQues obj = new LastQues();
        obj.printName(userName);

        scanner.close();
    }
}
