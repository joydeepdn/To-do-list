import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class  SignUp {

    HashMap<String, String> map = new HashMap<>();
    private String username;
    private String password;
    String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$";

    public void setUser(Scanner scan) {
        this.username = setUsername(scan);
        this.password = setPassword(scan);
        map.put(username,password);
        System.out.println("Account Successfully Created");
    }
    public HashMap<String, String> getUser(){
        return this.map;
    }

    public String setUsername(Scanner scan) {

        while (true) {
            System.out.print("Set username:");
            username = scan.nextLine();
            if (map.containsKey(this.username)) {
                System.out.println("username already exists!");
            }
            else {
                break;
            }
        }
        return username;
    }

    public String setPassword(Scanner scan) {
        while (true) {
            System.out.println("Password must contain " +
                    "one uppercase letter, " +
                    "one lowercase letter, " +
                    "one number, " +
                    "minimum password length is 8 characters."
            );
            System.out.print("Set password:");
            password = scan.nextLine();
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(password);
            if (m.matches()) {
                break;
            } else {
                System.out.println("Invalid Password");
            }
        }
        return password;
    }
}
