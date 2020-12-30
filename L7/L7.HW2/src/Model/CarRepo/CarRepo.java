package Model.CarRepo;

import Model.CarEnti.CarEnti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CarRepo implements AutoCloseable{
    @Override
    public void close() throws Exception {
    }
    private Connection connection;
    private PreparedStatement preparedStatement;
    public CarRepo () throws Exception{
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection (
                "jdbc:oracle:thin:@localhost:1521:xe", "masoume", "myjava123");
        connection.setAutoCommit (false);
    }
    public void insert(CarEnti carEnti) throws Exception{
        preparedStatement=connection.prepareStatement(
                "INSERT INTO car (personname,melicode,carmodel,price,remaining_money) values (?,?,?,?,?)");
        preparedStatement.setString(1,carEnti.getPersonname());
        preparedStatement.setString(2,carEnti.getMelicode());
        preparedStatement.setString(3,carEnti.getCarmodel());
        preparedStatement.setInt(4,carEnti.getPrice());
        preparedStatement.executeUpdate();
        selecting(carEnti);

    }
    public void select (CarEnti carEnti) throws Exception{
        PreparedStatement preparedStatement=connection.prepareStatement(
                "select * from car where melicode=?");
        preparedStatement.setString(1,carEnti.getMelicode());
        ResultSet resultSet= preparedStatement.executeQuery();
        if(resultSet.next()){
            System.out.println("person with this melli code buying a car already !");
            System.exit(0);
        }else {
            System.out.println("welcome :" + resultSet.getString("personname"));
        }
    }
    private void selecting(CarEnti carEnti) throws Exception{
        PreparedStatement preparedStatement=connection.prepareStatement("select * from car");
        ResultSet resultSet=preparedStatement.executeQuery ();
        List<CarEnti> carEntiList=new ArrayList<>();
        while (resultSet.next ()){
            CarEnti personEnti=new CarEnti (); // call by reference
            personEnti.setPersonname (resultSet.getString ("personname"));
            personEnti.setCarmodel (resultSet.getString ("carmodel"));
            personEnti.setMelicode (resultSet.getString ("melicode"));
            personEnti.setPrice (resultSet.getInt ("price"));
            carEntiList.add (personEnti);
        }
    }

    public void commit() throws Exception{
        connection.commit ();
    }
    public void rollback() throws Exception{
        connection.rollback ();
    }

}
