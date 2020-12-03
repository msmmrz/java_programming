import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee employee = new Employee();
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("1-create new info\n2-delete info");
            int i = input.nextInt();
            switch (i){
                case 1:
                    System.out.println("pls enter employee's code : ");
                    employee.setCode(input.next());
                    System.out.println("pls enter employee's name : ");
                    employee.setName(input.next());
                    System.out.println("pls enter employee's melicode : ");
                    employee.setMellicode(input.next());
                    System.out.println("pls enter employee's fathername : ");
                    employee.setFathername(input.next());
                    System.out.println("pls enter employee's position");
                    employee.setPosition(input.next());
                    System.out.println("pls enter employee's salary : ");
                    employee.setSalary(input.next());
                    System.out.println("pls enter employee's experience");
                    System.out.println(input.next());
                    employee.insert(employee.getCode(),employee.getName(),employee.getMellicode(),
                            employee.getFathername(),employee.getPosition(),employee.getSalary(),employee.getExperience());
                    break;

                case 2:
                    System.out.println("Enter employee's code");
                    String code=input.next();
                    employee.delete(code);
                    break;
            }break;
        }

    }
}
