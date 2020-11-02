package br.com.fiap.b2w.dao;

import java.sql.*;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class SQLConnect {

    private Connection conn;

    public SQLConnect(){
        try {
            DriverManager.registerDriver(new OracleDriver());
            String host = "oracle.fiap.com.br";
            String port = "1521";
            String SID = "ORCL";
            String user = "rm85183";
            String password = "260895";
            conn = DriverManager.getConnection("jdbc:oracle:thin:@"+host+":"+port+":"+SID+"",user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet executeQuery(String query) {
        try {
            Statement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.executeQuery(query);
            return stmt.getGeneratedKeys();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public void executeUpdate(String query){
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void closeConnection(){
        try {
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
