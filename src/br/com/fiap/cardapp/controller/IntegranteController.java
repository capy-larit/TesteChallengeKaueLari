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
import br.com.fiap.cardapp.bo.IntegranteBO;

@WebServlet("/integrante")
public class IntegranteController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		System.out.println("entrou no doGet");

		String acao = request.getParameter("acao");
		System.out.println(acao);

		switch (acao) {
		case "listarTodos":
			listarIntegranteTodos(request, response);
			System.out.println("chamou a ação listarTodos");
			break;

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);

		
	}

	private void listarIntegranteTodos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		IntegranteBO ib = new IntegranteBO();
		List<Integrante> lista = ib.listagemIntegrantes();
		System.out.println("passou pela controller integrante");

		if (lista != null) {
			request.setAttribute("lista_integrantes", lista);
			request.getRequestDispatcher("about.jsp").forward(request, response);
		} else {
			response.sendRedirect("index.jsp?msgStatus=Ocorreu um erro com a listagem dos integrante");
		}
	}

}
