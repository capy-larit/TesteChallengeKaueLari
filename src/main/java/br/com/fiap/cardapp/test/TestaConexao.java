package br.com.fiap.cardapp.test;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.cardapp.connection.ConnectionFactory;

public class TestaConexao {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection con = new ConnectionFactory().DBConnectionManager();
		System.out.println("Conexão Aberta!");
		
		con.close();
	}

}
