package com.javarush.test.GameReplace.PockerConsole;


/**
 * Created by Mistes on 22.06.2016.
 */


/**
 * Simple Java program to connect to MySQL database running on localhost and
 * running SELECT and INSERT query to retrieve and add data.
 * @author Javin Paul
 */

        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.ResultSet;
        import java.sql.SQLException;
        import java.sql.Statement;
public class JavaToMySQL {

    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://db4free.net:3306/mypockerbase";
    private static final String user = "pockerbase";
    private static final String password = "pockerbase";

    // JDBC variables for opening and managing connection
    private static Connection con;
    //private static Statement stmt;
    private static ResultSet rs;

    public static void main(String args[]) throws Exception
    {

        String query = "select id, name, author from books";

        rs = stmt.executeQuery(query);

        while (rs.next())
        {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String author = rs.getString(3);
            System.out.printf("id: %d, name: %s, author: %s %n", id, name, author);

        }
    }}