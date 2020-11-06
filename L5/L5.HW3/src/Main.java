import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter car brand\n1-Bmv\n2-Benz\n3-Bugatti");
        int x= input.nextInt();
        Car car = Carfactory.getCar(x);
        car.info();

    }
}
