package br.com.fiap.cardapp.test;

import java.sql.SQLException;

import br.com.fiap.cardapp.bo.IntegranteBO;

public class TestaDAOIntegrante {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		IntegranteBO bo = new IntegranteBO();
		System.out.println(bo.listagemIntegrantes()); 
		

	}

}
