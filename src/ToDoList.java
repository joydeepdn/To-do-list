import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ToDoList {
    ArrayList<String> tasks = new ArrayList<>();

    public void mainScreen(Scanner scan) {
        String userInput=null;
        while (true) {
            System.out.println("1.Add Tasks\n2.Review Tasks\n3.Back to mainMenu");
            userInput = scan.nextLine();
            if (Objects.equals(userInput, "1")) {setTasks(userInput,scan);}
            else if (Objects.equals(userInput, "2")) {getTasks();}
            else if (Objects.equals(userInput, "3")) {break;}
            else {System.out.println("Invalid Input");}
        }
    }

    public void setTasks(String userInput, Scanner scan) {
        System.out.println("Enter Tasks");
        do {
            System.out.print(":");
            tasks.add(scan.nextLine());
            System.out.println("press Any Key to add more or N to exit");
            userInput = scan.nextLine();
        }while (!Objects.equals(userInput, "n") && !Objects.equals(userInput, "N"));
    }


    public void getTasks() {
        System.out.println(tasks);
        return;
    }
}
