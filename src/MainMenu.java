import java.util.Objects;
import java.util.Scanner;

class MainMenu {

   SignUp su = new SignUp();
   SignIn si = new SignIn();

    public void mainMenu(Scanner scan){
        String userInput;
        System.out.println("\nHello and Welcome!");
        label:
        while (true) {
            System.out.println("\n1->Sign-Up\n2->Sign-In\n3->Exit");
            System.out.print(":");
            userInput = scan.nextLine();
            switch (userInput) {
                case "1": su.setUser(scan);
                break;
                case "2": si.signIn(scan, su);
                break;
                case "3": break label;
                default: System.out.println("Invalid Input!");
                break;
            }
        }
    }
}
