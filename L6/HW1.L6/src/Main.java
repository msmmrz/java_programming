import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1-create user\n2-update user");
            int i=input.nextInt();
            switch (i) {
                case 1:
                    System.out.println("Enter your usercode");
                    user.setUsercode(input.next());
                    System.out.println("Enter your username");
                    user.setUsername(input.next());
                    System.out.println("Enter your email");
                    user.setEmail(input.next());
                    System.out.println("Enter your pass");
                    user.setPass(input.next());
                    System.out.println("Enter your age");
                    user.setAge(input.nextInt());
                    System.out.println("Enter your education");
                    user.setEducation(input.next());
                    user.insert(user.getUsercode(), user.getUsername(), user.getEmail(), user.getPass(),
                            user.getAge(), user.getEducation());
                    break;
                case 2:
                    System.out.println("pls enter your username : ");
                    String username = input.next();
                    System.out.println("pls enter your pass : ");
                    String pass = input.next();
                    user.select(username, pass);
                    break;
            }break;
        }

    }
}
