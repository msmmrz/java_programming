import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        String Array[] = new String[3];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter operation ");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = input.nextLine();
        }

        int a = Integer.parseInt(Array[0]);
        int b = Integer.parseInt(Array[2]);

        if (Array[1].equals("-")) {

            Calculate calculate = Calcfactory.getCalculate(Calculate.CALMINES);
            calculate.calc(a,b);


        } else if (Array[1].equals("+")) {
            Calculate calculate=Calcfactory.getCalculate(Calculate.CALPLUS);
            calculate.calc(a,b);
        }

    }
}
