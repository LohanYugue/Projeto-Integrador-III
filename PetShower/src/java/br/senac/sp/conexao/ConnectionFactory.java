package br.senac.sp.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    static String status = "";

    public static Connection getConnection() {

        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3307/petshower";
            conn = DriverManager.getConnection(url);
            status = "Connection opened";

        } catch (SQLException e) {
            status = e.getMessage();
        } catch (ClassNotFoundException e) {
            status = e.getMessage();
        } catch (Exception e) {
            status = e.getMessage();
        }
        return conn;
    }
    public static void CloseConnection(Connection conn) throws SQLException {

        try {
            if (conn != null) {
                conn.close();
            }

        } catch (Exception ErrorSQL) {
            throw new SQLException(ErrorSQL);
        }
    }
}
