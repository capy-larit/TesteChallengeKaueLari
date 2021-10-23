package br.com.fiap.cardapp.bo;

import java.util.List;

import br.com.fiap.cardapp.bean.Integrante;
import br.com.fiap.cardapp.dao.IntegranteDAO;

public class IntegranteBO {
	
	private IntegranteDAO cd = null;
	
	public List<Integrante> listagemIntegrantes(){
		cd = new IntegranteDAO();
		System.out.println("passou pelo integranteBO");
		return cd.select();
		
	}

}
