import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Username");
        User.getInstance().setUsername(input.nextLine());
        System.out.println("Enter password");
        User.getInstance().setPassword(input.nextLine());
        User.getInstance().getUsername();
        User.getInstance().getPassword();



    }
}
