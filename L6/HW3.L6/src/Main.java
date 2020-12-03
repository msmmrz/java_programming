import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student student= new Student();
        Scanner input= new Scanner(System.in);
        while (true){
            System.out.println("1-save student info\n2-update student info\n3-delete student info");
            int i= input.nextInt();
            switch (i){
                case 1:
                    System.out.println("pls enter student number :");
                    student.setStudent_number(input.next());
                    System.out.println("pls enter your name : ");
                    student.setName(input.next());
                    System.out.println("pls enter entry year : ");
                    student.setEntry_year(input.next());
                    System.out.println("pls enter your average average : ");
                    student.setAverage(input.next());
                    student.insert(student.getStudent_number(), student.getName(), student.getEntry_year(),
                            student.getAverage());
                    break;
                case 2:
                    System.out.println("pls enter student number :");
                    String student_number=input.next();
                    student.select(student_number);
                    break;
                case 3:
                    System.out.println("pls enter student number :");
                    student_number=input.next();
                    student.delete(student_number);
                    break;
                default:
                    System.out.println("invalid value");
            }
        }
    }
}
