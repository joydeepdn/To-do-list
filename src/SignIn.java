import com.sun.source.doctree.EscapeTree;

import java.util.HashMap;
import java.util.Map;
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
                break;
            }
            else {
                System.out.println("Incorrect username or password!");
            }
        }
    }
}
