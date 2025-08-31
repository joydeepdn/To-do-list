
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
        while (true) {
            System.out.println("1.Add Tasks\n2.Review Tasks\n3.Accomplished Tasks\n4.Exit to main menu");
            userInput = scan.nextLine();
            if (Objects.equals(userInput, "1")) {setTasks(scan);}
            else if (Objects.equals(userInput, "2")) {getTasks();}
            else if (Objects.equals(userInput,"3")) {removeTasks(scan);}
            else if (Objects.equals(userInput, "4")) {break;}
            else {System.out.println("Invalid Input");}
        }
    }

    public void setTasks(Scanner scan) {
        System.out.println("Enter Tasks");
        do {
            System.out.print(":");
            tasks.add(scan.nextLine());
            System.out.println("press Any Key to add more or N to exit");
            userInput = scan.nextLine();
        }while (!(Objects.equals(userInput,"n") || Objects.equals(userInput,"N")));
    }


    public void getTasks() {
        System.out.println(tasks);
    }
    public void removeTasks(Scanner scan){
        String regex = "^[0-9]+$";
        Pattern p = Pattern.compile(regex);
        Matcher m;

        while (true) {
            System.out.println("Enter the serial no. of the task to be removed or press N to exit");
            System.out.print(":");
            userInput = scan.nextLine();
            m = p.matcher(userInput);
            if (m.matches() && Integer.parseInt(userInput) <= tasks.size()) {
                int index = Integer.parseInt(userInput);
                tasks.remove(index);
            } else if ((Objects.equals(userInput, "n") || Objects.equals(userInput, "N"))){
               break;
            }
            else {
                System.out.println("Make sure you enter the correct serial number!");
            }
        }
    }
}
