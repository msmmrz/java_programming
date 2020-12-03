import java.sql.*;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Student {
    private String student_number, name, entry_year, average;

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEntry_year() {
        return entry_year;
    }

    public void setEntry_year(String entry_year) {
        this.entry_year = entry_year;
    }

    public String getAverage() {
        return average;
    }

    public void setAverage(String average) {
        this.average = average;
    }

    public void insert(String student_number, String name, String entry_year, String average) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "msmmrz", "msmmrz");
            Class.forName("oracle.jdbc.OracleDriver");
            PreparedStatement preparedStatement1 = connection.prepareStatement(
                    "select * from student where student_number=?");
            preparedStatement1.setString(1, student_number);
            ResultSet resultSet2 = preparedStatement1.executeQuery();
            if (resultSet2.next()) {
                System.out.println("this student is there already!");
            } else {
                PreparedStatement preparedStatement = connection.prepareStatement(
                        "insert into student(student_number,name,entry_year,average) values (?,?,?,?)");
                preparedStatement.setString(1, student_number);
                preparedStatement.setString(2, name);
                preparedStatement.setString(3, entry_year);
                preparedStatement.setString(4, average);
                preparedStatement.executeUpdate();
                preparedStatement.close();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("DB Driver not found");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void select(String student_number) {
        Scanner input=new Scanner(System.in);
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "msmmrz", "msmmrz");
            Class.forName("oracle.jdbc.OracleDriver");
            PreparedStatement preparedStatement1 = connection.prepareStatement(
                    "select * from student where student_number=?");
            preparedStatement1.setString(1, student_number);
            ResultSet resultSet2 = preparedStatement1.executeQuery();
            if (resultSet2.next()) {
                System.out.println("update user : ");
                System.out.println("pls enter student's student number : ");
                String student_number1 = input.next();
                System.out.println("pls enter student's name : ");
                String name=input.next();
                System.out.println("pls enter student's entering year : ");
                String entry_year =input.next();
                System.out.println("pls enter student's average : ");
                String average=input.next();
                update(student_number1,name,entry_year,average,student_number);
            } else {
                System.out.println("the student number is wrong");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("DB Driver not found");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    ;
    public void update (String student_number1, String name,String  entry_year, String average , String student_number){
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "msmmrz", "msmmrz");
            Class.forName("oracle.jdbc.OracleDriver");
            //create table student(student_number varchar2(20),name varchar2(20),entry_year varchar2(20),average varchar2(20));
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "update student set student_number1=?, name=?, entry_year=?, average=? where student_number");
            preparedStatement.setString(1,student_number1);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,entry_year);
            preparedStatement.setString(4,average);
            preparedStatement.setString(5,student_number);
            preparedStatement.executeUpdate();
            System.out.println("student information update.");
            preparedStatement.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            System.out.println("DB Driver not found");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
        ;
    public void delete (String student_number){
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "msmmrz", "msmmrz");
            Class.forName("oracle.jdbc.OracleDriver");
            PreparedStatement preparedStatement1 = connection.prepareStatement(
                    "select * from student where student_number=?");
            preparedStatement1.setString(1, student_number);
            ResultSet resultSet2 = preparedStatement1.executeQuery();
            if (resultSet2.next()) {
                PreparedStatement preparedStatement=connection.prepareStatement(
                        "delete from student where student_number=?");
                preparedStatement.setString(1,student_number);
                preparedStatement.executeUpdate();
                System.out.println("student information deleted");
                preparedStatement.close();
                preparedStatement1.close();
                connection.close();
            } else {
                System.out.println("the student number is wrong");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("DB Driver not found");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    ;

}
