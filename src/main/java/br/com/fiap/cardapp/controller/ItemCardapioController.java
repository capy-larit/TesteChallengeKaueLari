package br.com.fiap.cardapp.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.cardapp.bean.Integrante;
import br.com.fiap.cardapp.bean.ItemCardapio;
import br.com.fiap.cardapp.bo.IntegranteBO;
import br.com.fiap.cardapp.bo.ItemCardapioBO;

@WebServlet("/itemCardapio")
public class ItemCardapioController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

		request.setCharacterEncoding("utf-8");

		String acao = request.getParameter("acao");

		switch (acao) {
		case "listarTodos":
			listarItemCardapioTodos(request, response);
			break;
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);
	}

	private void listarItemCardapioTodos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ItemCardapioBO ic = new ItemCardapioBO();
		List<ItemCardapio> lista = ic.listagemItemCardapio();

		if (lista != null) {
			request.setAttribute("lista_itemCardapio", lista);
			request.getRequestDispatcher("itemCardapio.jsp").forward(request, response);
		} else {
			response.sendRedirect("index.jsp?msgStatus=Ocorreu um erro com a listagem dos itens do cardapio");
		}

	}
}
