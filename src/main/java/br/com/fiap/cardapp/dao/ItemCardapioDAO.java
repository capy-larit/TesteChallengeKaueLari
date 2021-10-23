package br.com.fiap.cardapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.cardapp.bean.ItemCardapio;
import br.com.fiap.cardapp.connection.ConnectionFactory;

public class ItemCardapioDAO {
	
	private Connection con;

	public ItemCardapioDAO() {
		ConnectionFactory cf = new ConnectionFactory();
		try {
			this.con = cf.DBConnectionManager();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<ItemCardapio> select() {

		// CRIANDO A INSTRUÇÃO SQL
		String sql = "SELECT * FROM item_cardapio ORDER BY cd_item_cardapio";

		// Criando a lista que vai ser retornada com todos os registros.
		List<ItemCardapio> lista = new ArrayList<>();

		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// Criando a conexão
			ps = con.prepareStatement(sql);

			// Criando o ResultSet que vai armazenar o conteúdo da consulta.
			rs = ps.executeQuery();

			// Criando uma instância da classe ItemCardapio
			ItemCardapio itemCardapio = null;

			// Criando uma estrutura para ler o ResultSet
			while (rs.next()) {
				// A cada iteração, será criado um novo Objeto e este será populado
				// com os dados oriundos da base de dados.
				itemCardapio = new ItemCardapio();
				itemCardapio.setId((rs.getInt("cd_item_cardapio")));
				itemCardapio.setNome(rs.getString("nm_item_cardapio"));
				itemCardapio.setDescricao(rs.getString("ds_item_cardapio"));
				itemCardapio.setFoto(rs.getString("ds_foto_item_cardapio"));
				itemCardapio.setValor(rs.getFloat("vl_item_cardapio"));
				itemCardapio.setValorCalorico(rs.getFloat("vl_calorico_item_cardapio"));

				// Adicionamos o objeto na lista
				lista.add(itemCardapio);
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
		return lista;
	}

}
