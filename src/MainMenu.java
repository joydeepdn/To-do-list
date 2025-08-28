import java.util.Objects;
import java.util.Scanner;

class MainMenu {

   SignUp su = new SignUp();
   SignIn si = new SignIn();

    public void mainMenu(Scanner scan){
        String userInput;
        System.out.println("\nHello and Welcome!");
        while (true) {
            System.out.println("\n1=>Sign-Up\n2=>Sign-In\n3=>Exit");
            userInput = scan.nextLine();
            if(Objects.equals(userInput, "1")){su.setUser(scan);}
            else if (Objects.equals(userInput, "2")) {si.signIn(scan,su);}
            else if(Objects.equals(userInput, "3")) {break;}
            else {System.out.println("Invalid Input!");}
        }
    }
}
