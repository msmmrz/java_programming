import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        Person person=new Person();
        while(true) {
            System.out.println("1-Signup :\n2-Login :\n3-exit.");
            int i=input.nextInt();
            switch (i) {
                case 1:
                    System.out.println("pls enter your name : ");
                    person.setName(input.next());
                    System.out.println("pls enter your username : ");
                    person.setUser(input.next());
                    System.out.println("pls enter your pass : ");
                    person.setPass(input.next());
                    System.out.println("pls enter your email address : ");
                    person.setEmail(input.next());
                    person.insert(person.getName(),person.getUser(),person.getPass(),person.getEmail());
                    break;
                case 2:
                    System.out.println("pls enter your username : ");
                   // person.setUser(input.next());
                    String username = input.next();
                    System.out.println("pls enter your pass : ");
                   // person.setPass(input.next());
                    String pass = input.next();
                   // person.select(person.getUser(), person.getPass());
                    person.select(username,pass);
                    break;
                case 3:break;
            }break;
        }
    }
}
