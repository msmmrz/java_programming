package com.company.Model.Repository;

import com.company.Model.Entity.PersonE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonR implements AutoCloseable {


    private Connection connection;
    private PreparedStatement preparedStatement;

    public PersonR() throws Exception{
        Class.forName ("oracle.jdbc.OracleDriver");
         connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
                "masoume", "myjava123");

            connection.setAutoCommit (false);
    }


    public void insert(PersonE personE) throws Exception{

//create table user2(name varchar2(20),pass varchar2(20),username varchar2(20),email varchar2(35));
        PreparedStatement preparedStatement = connection.prepareStatement(
                "insert into user2 (name,username,pass,email) values (?,?,?,?)");
        preparedStatement.setString(1, personE.getName());
        preparedStatement.setString(2, personE.getUsername());
        preparedStatement.setString(3, personE.getPass());
        preparedStatement.setString(4, personE.getEmail());
        preparedStatement.executeUpdate();
        System.out.println("user create.");
        selecting();
    }

    public List<PersonE> select(PersonE personE) throws Exception{
        PreparedStatement preparedStatement2 = connection.prepareStatement(
                "select * from user2 where username = ? and pass=? ");
        preparedStatement2.setString(1, personE.getUsername());
        preparedStatement2.setString(2, personE.getPass());
        ResultSet resultSet = preparedStatement2.executeQuery();
        List<PersonE> personEList=new ArrayList<>();
        if (resultSet.next()) {
            System.out.println("user & pass is correct.\n welcome : "
                    + resultSet.getString("username"));
            selecting();
        } else {
            System.out.println("your user or pass is incorrect!");
        }
        return personEList;
    }
    public List<PersonE> selecting() throws Exception{
        preparedStatement=connection.prepareStatement ("SELECT * FROM user2");
        ResultSet resultSet=preparedStatement.executeQuery ();
        List<PersonE> personEntiList=new ArrayList <> ();
        while (resultSet.next ()){
            PersonE personEnti=new PersonE (); // call by reference
            personEnti.setName (resultSet.getString ("name"));
            personEnti.setUsername (resultSet.getString ("username"));
            personEnti.setPass(resultSet.getString("pass"));
            personEnti.setEmail(resultSet.getString("email"));
            personEntiList.add (personEnti);
        }
        return personEntiList;

    }
    public void check(PersonE personE) throws Exception{
        PreparedStatement preparedStatement2 = connection.prepareStatement(
                "select * from user2 where username = ? and pass=? ");
        preparedStatement2.setString(1, personE.getUsername());
        preparedStatement2.setString(2, personE.getPass());
        ResultSet resultSet = preparedStatement2.executeQuery();
        if (resultSet.next()) {
            System.out.println("this user is created already!");
        }else {
            insert(personE);
        }
    }

    public void commit()throws Exception {
        connection.commit();
    }

    public void rollback() throws Exception{
        connection.rollback ();
    }
    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();

    }

}
