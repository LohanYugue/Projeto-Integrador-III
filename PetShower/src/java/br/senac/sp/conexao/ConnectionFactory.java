package br.senac.sp.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    static String status = "";

    public static Connection getConnection() {

        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3307/petshower";
            connection = DriverManager.getConnection(url);
            status = "Connection opened";

        } catch (SQLException e) {
            status = e.getMessage();
        } catch (ClassNotFoundException e) {
            status = e.getMessage();
        } catch (Exception e) {
            status = e.getMessage();
        }
        return connection;
    }
    public static void CloseConnection(Connection connection) throws SQLException {

        try {
            if (connection != null) {
                connection.close();
            }

        } catch (Exception ErrorSQL) {
            throw new SQLException(ErrorSQL);
        }
    }
}
