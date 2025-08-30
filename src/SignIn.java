import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class SignIn {

    ToDoList to = new ToDoList();
    String username=null;
    String password=null;

    public void signIn(Scanner scan,SignUp su) {

        HashMap<String, String> map2 = su.getUser();
        System.out.println(map2);

        while (true) {
            System.out.print("Enter username:");
            username = scan.nextLine();
            System.out.print("Enter password");
            password = scan.nextLine();
            if(map2.containsKey(this.username) && map2.containsValue(this.password)){
                to.mainScreen(scan);
                break;
            }
            else {
                System.out.println("Incorrect username or password!");
            }
        }
    }
}
