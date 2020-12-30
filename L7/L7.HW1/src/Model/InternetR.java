package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class InternetR implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;

    public InternetR()throws Exception{
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection (
                "jdbc:oracle:thin:@localhost:1521:xe", "masoume", "myjava123");
        connection.setAutoCommit (false);

    }

    public List<InternetE> select(InternetE internetE) throws Exception{
        PreparedStatement preparedStatement2 = connection.prepareStatement(
                "select * from user3 where username = ? and pass=? ");
        preparedStatement2.setString(1, internetE.getUsername());
        preparedStatement2.setString(2, internetE.getPass());
        ResultSet resultSet = preparedStatement2.executeQuery();
        List<InternetE> personEList=new ArrayList<>();
        if (resultSet.next()) {
            System.out.println("user & pass is correct.\n welcome : "
                    + resultSet.getString("username"));
            selecting();
        } else {
            System.out.println("this user isn't exist!");
            System.exit(0);
        }
        return personEList;
    }
    public void update(InternetE internetE)throws Exception{
        PreparedStatement preparedStatement=connection.prepareStatement(
                "update user3 set id=?,internet_size=?,price=? where username=? and pass=?");
        preparedStatement.setInt(1,internetE.getId());
        preparedStatement.setInt(2,internetE.getInternet_size());
        preparedStatement.setInt(3,internetE.getPrice());
        preparedStatement.setString(4,internetE.getUsername());
        preparedStatement.setString(5,internetE.getPass());
        preparedStatement.executeUpdate();
        System.out.println("saved.");
        selecting();
    }
    private List<InternetE> selecting() throws Exception{
        preparedStatement=connection.prepareStatement ("SELECT * FROM user3");
        ResultSet resultSet=preparedStatement.executeQuery ();
        List<InternetE> internetEList=new ArrayList <> ();
        while (resultSet.next ()){
            InternetE internetE=new InternetE (); // call by reference
            internetE.setUsername (resultSet.getString ("username"));
            internetE.setPass(resultSet.getString("pass"));
            internetE.setId(resultSet.getInt("id"));
            internetE.setPrice(resultSet.getInt("price"));
            internetE.setInternet_size(resultSet.getInt("internet_size"));
            internetEList.add (internetE);
        }
        return internetEList;
    }

    public void commit()throws Exception {
        connection.commit();
    }

    public void rollback() throws Exception{
        connection.rollback ();
    }

    @Override
    public void close() throws Exception {

    }
}
