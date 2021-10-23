package br.com.fiap.cardapp.bo;

import java.util.List;

import br.com.fiap.cardapp.bean.ItemCardapio;
import br.com.fiap.cardapp.dao.ItemCardapioDAO;

public class ItemCardapioBO {
	
private ItemCardapioDAO cd = null;
	
	public List<ItemCardapio> listagemItemCardapio(){
		cd = new ItemCardapioDAO();
		return cd.select();
	}

}
