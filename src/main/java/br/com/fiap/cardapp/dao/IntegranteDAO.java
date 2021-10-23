package br.com.fiap.cardapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.cardapp.connection.ConnectionFactory;
import br.com.fiap.cardapp.bean.Integrante;

public class IntegranteDAO {

	private Connection con;

	public IntegranteDAO() {
		ConnectionFactory cf = new ConnectionFactory();
		try {
			this.con = cf.DBConnectionManager();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Integrante> select() {
		
		// Criando a lista que vai ser retornada com todos os registros.
		List<Integrante> integrantes = new ArrayList<Integrante>();
		Integrante integrante = new Integrante();

		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// Criando a conexão
			ps = con.prepareStatement("SELECT * FROM INTEGRANTE");

			// Criando o ResultSet que vai armazenar o conteúdo da consulta.
			rs = ps.executeQuery();

			// Criando uma instância da classe Integrante
//			Integrante integrante = null;

			// Criando uma estrutura para ler o ResultSet
			while (rs.next()) {
				// A cada iteração, será criado um novo Objeto e este será populado
				// com os dados oriundos da base de dados.
				integrante = new Integrante();
				integrante.setId(rs.getInt("CD_INTEGRANTE"));
				integrante.setNome(rs.getString("NM_INTEGRANTE"));
				integrante.setRm(rs.getString("DS_RM"));
				integrante.setFoto(rs.getString("DS_FOTO_INTEGRANTE"));
				System.out.println("pegou os integrantes");
				System.out.println(integrante.getNome());
				System.out.println(integrante.getFoto());
				System.out.println(integrante.getId());
				System.out.println(integrante.getRm());

				// Adicionamos o objeto na lista
				integrantes.add(integrante);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				ps.close();
				rs.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return integrantes;
	}

}
