package br.com.fiap.cardapp.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection DBConnectionManager() throws ClassNotFoundException, SQLException {
		
		Connection conexao = null;
        try {
        	Class.forName("oracle.jdbc.OracleDriver");

            conexao = DriverManager.getConnection(
            		"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm85707", "281102");


        } catch (ClassNotFoundException e) {
        	e.printStackTrace();

        } catch (SQLException e) {
        	e.printStackTrace();

        }

        return conexao;
	}
}
