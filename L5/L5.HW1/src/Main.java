import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter \n1-name 2-username 3-password 4-address 5-phone 6-grade 7-age");
        personBuilder personBuilder = new personBuilder().setName(input.nextLine()).setUsername(input.nextLine())
                .setPassword(input.nextLine()).setAddress(input.nextLine()).setPhone(input.nextLine())
                .setGrade(input.nextLine()).setAge(input.nextInt());

        System.out.println("name:"+personBuilder.getName()+"\n"+"username:"+personBuilder.getUsername()+"\n"+
                "password:"+ personBuilder.getPassword()+"\n"+"address:"+ personBuilder.getAddress()+"\n"+
                "phone"+personBuilder.getPhone()+"\n"+ "grade:"+personBuilder.getGrade()+
                "\n"+"age:"+ personBuilder.getAge());

    }
}
