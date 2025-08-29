import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class SignIn {

    String username=null;
    String password=null;

    public void signIn(Scanner scan,SignUp su) {

        HashMap<String, String> map2 = su.getUser();
        System.out.println(map2);

        while (true) {
            System.out.println("Enter username:");
            username = scan.nextLine();
            System.out.println("Enter password");
            password = scan.nextLine();
            if(map2.containsKey(this.username) && map2.containsValue(this.password)){
                toDoList(scan);
                break;
            }
            else {
                System.out.println("Incorrect username or password!");
            }
        }
    }
    public void toDoList(Scanner scan){

        ArrayList<String> task = new ArrayList<>();
        String str;
        System.out.println("Enter your tasks");

        do {
            System.out.print(":");
            task.add(scan.nextLine());
            System.out.println("press Any Key to add more or, N to Exit");
            str = scan.nextLine();
        } while (!Objects.equals(str, "N") && !Objects.equals(str, "n"));
    }
}
