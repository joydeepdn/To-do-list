
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToDoList {
    ArrayList<String> tasks = new ArrayList<>();
    String userInput;

    public void mainScreen(Scanner scan) {
        String userInput;
        label:
        while (true) {
            System.out.println("\n1.Add Tasks\n2.Review Tasks\n3.Accomplished Tasks\n4.Exit to main menu");
            System.out.print(":");
            userInput = scan.nextLine();
            switch (userInput) {
                case "1":
                    setTasks(scan);
                    break;
                case "2":
                    getTasks();
                    break;
                case "3":
                    removeTasks(scan);
                    break;
                case "4":
                    break label;
                default:
                    System.out.println("Invalid Input!");
                    break;
            }
        }
    }

    public void setTasks(Scanner scan) {
        System.out.println("Enter Tasks");
        do {
            System.out.print(":");
            tasks.add(scan.nextLine());
            System.out.println("press Any Key to add more or N to exit");
            userInput = scan.nextLine();
        } while (!(Objects.equals(userInput, "n") || Objects.equals(userInput, "N")));
    }


    public void getTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + "." + tasks.get(i));
        }
    }

    public void removeTasks(Scanner scan) {
        String regex = "^[0-9]+$";
        Pattern p = Pattern.compile(regex);
        Matcher m;

        while (true) {
            try {
                System.out.println("Enter the serial no. of the task that is accomplished, or press N to exit");
                System.out.print(":");
                userInput = scan.nextLine();
                m = p.matcher(userInput);
                if (m.matches() && Integer.parseInt(userInput) <= tasks.size()) {
                    int index = Integer.parseInt(userInput);
                    tasks.remove(index);
                    System.out.println("Task successfully removed!");
                }
                 else if ((Objects.equals(userInput, "n") || Objects.equals(userInput, "N"))) {
                    break;
                } else if (Integer.parseInt(userInput) > tasks.size()) {
                    System.out.println("Ensure you enter the proper serial number!");
                }
            }catch (Exception e){
                System.out.println("Something went wrong!");
            }
        }
    }
}
