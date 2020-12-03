import java.sql.*;

public class Employee {
    private String code,name,mellicode,fathername,position,salary,experience;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMellicode() {
        return mellicode;
    }

    public void setMellicode(String mellicode) {
        this.mellicode = mellicode;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
    public void insert(String code,String name,String mellicode,String fathername,String position,
                       String salary,String experience) {
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "msmmrz", "msmmrz")) {
            Class.forName("oracle.jdbc.OracleDriver");
            PreparedStatement preparedStatement1 = connection.prepareStatement("select * from employee where code=?");
            preparedStatement1.setString(1, code);
            ResultSet resultSet2 = preparedStatement1.executeQuery();

            if (resultSet2.next()) {
                System.out.println("this employee is there already!");
            } else {
                PreparedStatement preparedStatement = connection.prepareStatement("insert into employee (code,name,mellicode,fathername,position,salary,experience) values (?,?,?,?,?,?,?)");
                preparedStatement.setString(1, code);
                preparedStatement.setString(2, name);
                preparedStatement.setString(3, mellicode);
                preparedStatement.setString(4, fathername);
                preparedStatement.setString(5, position);
                preparedStatement.setString(6, salary);
                preparedStatement.setString(7, experience);
                preparedStatement.executeUpdate();
                preparedStatement1.close();
                preparedStatement.close();
            }

            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }
    public void delete(String code){
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "msmmrz", "msmmrz")) {
            Class.forName("oracle.jdbc.OracleDriver");
            PreparedStatement preparedStatement1 = connection.prepareStatement("select * from employee where code=?");
            preparedStatement1.setString(1, code);
            ResultSet resultSet = preparedStatement1.executeQuery();
            if (resultSet.next()) {
                PreparedStatement preparedStatement=connection.prepareStatement("delete from employee where code=?");
                preparedStatement.setString(1,code);
                preparedStatement.executeUpdate();
                preparedStatement.close();
                preparedStatement1.close();
                connection.close();
                System.out.println("The employee deleted");
            }else{
                System.out.println("The employee's code is wrong");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("DB Driver not found");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
